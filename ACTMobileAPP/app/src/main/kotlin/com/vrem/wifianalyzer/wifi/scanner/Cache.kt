/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2022 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.vrem.wifianalyzer.wifi.scanner

import android.app.Application
import android.content.Context
import android.net.wifi.ScanResult
import android.net.wifi.WifiInfo
import android.os.AsyncTask
import com.vrem.annotation.OpenClass
import com.vrem.wifianalyzer.MainContext
import com.vrem.wifianalyzer.settings.Repository
import com.vrem.wifianalyzer.settings.Settings
import com.vrem.wifianalyzer.wifi.database.Network
import com.vrem.wifianalyzer.wifi.database.NetworkDatabase
import com.vrem.wifianalyzer.wifi.model.calculateDistance
import java.security.AccessController.getContext
import java.text.SimpleDateFormat
import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayDeque
import kotlin.reflect.typeOf

internal class CacheResult(val scanResult: ScanResult, val average: Int)

internal data class CacheKey(val bssid: String, val ssid: String)

@OpenClass
internal class Cache {
    private var scanResults: ArrayDeque<List<ScanResult>> = ArrayDeque(MAXIMUM)
    private var wifiInfo: WifiInfo? = null
    private var count: Int = COUNT_MIN
    var listNetwork : ArrayList<String> = ArrayList()
    var remListNetwork : ArrayList<String> = ArrayList()
    var del=false
    var sRemove : String=""
    private var mc=MainContext.INSTANCE
    var settings: Settings =Settings(Repository(mc.context))


    fun scanResults(): List<CacheResult> =
        combineCache()
            .groupingBy { CacheKey(it.BSSID, it.SSID) }
            .aggregate { _, accumulator: CacheResult?, element, first ->
                CacheResult(element, calculate(first, element, accumulator))
            }
            .values
            .toList()

    fun add(scanResults: List<ScanResult>, wifiInfo: WifiInfo?) {
        val mainContext = MainContext.INSTANCE
        val sharedPreference =  mainContext.context.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
        val mode= sharedPreference.getString("mode","nessuna")
        println("Modalita: "+mode)
        count = if (count >= MAXIMUM * FACTOR) COUNT_MIN else count + 1
        val size = size()
        while (this.scanResults.size >= size) {
            this.scanResults.removeLastOrNull()
        }
        println("SONO ARRIVATO")

        if(mode.equals("act")){
            var sr : MutableList<ScanResult> =mutableListOf()
            for (r in scanResults){
                var d= calculateDistance(r.frequency,r.level)
                if(settings.distance()>-1){
                    if(d<=settings.distance()){
                        println("La rete: "+r.SSID+" Potenza: "+r.level)
                        // println("DISTANZA: "+calculateDistance(r.frequency,r.level))
                        sr.add(r)
                    }
                }else{
                    sr.add(r)
                }
            }
            var networksAlreadySeen= getAllNetworks(MainContext.INSTANCE.mainActivity.application).execute().get()
            for(l in listNetwork){
                println("List network: $l")
            }
            for(r in sr){
                if(!listNetwork.contains(r.BSSID)){
                    listNetwork.add(r.BSSID)
                    if(networksAlreadySeen.filter {
                                s->s.BSSID==r.BSSID && s.TimeLost==null
                        }.isEmpty()){
                        println("SONO DENTRO IS EMPTY")
                        var n= Network(r.SSID,r.BSSID,Date(),null)
                        InsertNetwork(n,MainContext.INSTANCE.mainActivity.application).execute()
                    }
                }
            }
            for(l in listNetwork){
               // println("Sono in for l in list")
                //networksAlreadySeen= getAllNetworks(MainContext.INSTANCE.mainActivity.application).execute().get()
                if(sr.filter {
                            scanResult -> scanResult.BSSID==l
                    }.isEmpty()) {
                    var networkFiltered = networksAlreadySeen.filter { s ->
                        s.BSSID == l && s.TimeLost == null
                    }
                    println("NF: $networkFiltered")
                    //var networkFiltered = getFilteredNetworks(l,MainContext.INSTANCE.mainActivity.application).execute().get()
                    //println("Rete non piu rilevata: "+networkFiltered.get(0).SSID+" BSSID: "+l+" TF:"+networkFiltered.get(0).TimeFound)
                    if(networkFiltered.isNotEmpty()){
                        var n= Network(networkFiltered.get(0).SSID,l,networkFiltered.get(0).TimeFound,Date())
                        UpdateNetwork(n,MainContext.INSTANCE.mainActivity.application).execute()
                        del=true
                        remListNetwork.add(l)
                    }
                }
            }
            if(del){
                for(i in remListNetwork){
                    println("RM: "+i)
                    listNetwork.remove(i)
                }
                del=false
                remListNetwork=ArrayList()
            }
            for(n in networksAlreadySeen){
                println("NOME: "+n.SSID+" BSSID: "+n.BSSID+" TF: "+n.TimeFound+ " TL: "+n.TimeLost)
            }
            this.scanResults.addFirst(sr)
        }
        else{
            this.scanResults.addFirst(scanResults)
        }
        this.wifiInfo = wifiInfo
    }

    fun first(): List<ScanResult> = scanResults.first()

    fun last(): List<ScanResult> = scanResults.last()

    fun size(): Int =
        if (sizeAvailable) {
            val settings = MainContext.INSTANCE.settings
            if (settings.cacheOff())
                MINIMUM
            else {
                with(settings.scanSpeed()) {
                    when {
                        this < 2 -> MAXIMUM
                        this < 5 -> MAXIMUM - 1
                        this < 10 -> MAXIMUM - 2
                        else -> MINIMUM
                    }
                }
            }
        } else MINIMUM

    fun wifiInfo(): WifiInfo? = wifiInfo

    private fun calculate(first: Boolean, element: ScanResult, accumulator: CacheResult?): Int {
        val average: Int = if (first) element.level else (accumulator!!.average + element.level) / DENOMINATOR
        return (if (sizeAvailable) average else average - SIZE * (count + count % FACTOR) / DENOMINATOR)
            .coerceIn(LEVEL_MINIMUM, LEVEL_MAXIMUM)
    }

    private fun combineCache(): List<ScanResult> =
        scanResults.flatten().sortedWith(comparator())

    private fun comparator(): Comparator<ScanResult> =
        compareBy<ScanResult> { it.BSSID }.thenBy { it.SSID }.thenBy { it.level }

    private val sizeAvailable: Boolean
        get() = MainContext.INSTANCE.configuration.sizeAvailable

    companion object {
        private const val MINIMUM: Int = 1
        private const val MAXIMUM: Int = 4
        private const val SIZE: Int = MINIMUM + MAXIMUM
        private const val LEVEL_MINIMUM: Int = -100
        private const val LEVEL_MAXIMUM: Int = 0
        private const val FACTOR: Int = 3
        private const val DENOMINATOR: Int = 2
        private const val COUNT_MIN: Int = 2
    }

    class InsertNetwork(val network: Network, val application: Application) : AsyncTask<Void,Void,Void>(){
        override fun doInBackground(vararg p0: Void?): Void? {
            NetworkDatabase.get(application).getNetworkDao().insertNetwork(network)
            return null
        }
    }

    class UpdateNetwork(val network: Network, val application: Application) : AsyncTask<Void,Void,Void>(){
        override fun doInBackground(vararg p0: Void?): Void? {
            NetworkDatabase.get(application).getNetworkDao().updateNetwork(network)
            return null
        }
    }

    class getAllNetworks(val application: Application) : AsyncTask<Void,Void,List<Network>>(){
        override fun doInBackground(vararg p0: Void?): List<Network>? {
            var l=NetworkDatabase.get(application).getNetworkDao().getNetworks()
            l.forEach{
                println("Rete nel db: ${it.SSID} ${it.BSSID} TF: ${it.TimeFound} TL: ${it.TimeLost}")
            }
            return l
        }
    }

    class getFilteredNetworks(val sBSSID : String, val application: Application) : AsyncTask<Void,Void,List<Network>>(){
        override fun doInBackground(vararg p0: Void?): List<Network>? {
            var l=NetworkDatabase.get(application).getNetworkDao().getFilteredNetworks(sBSSID)
            /*l.forEach{
                println("Rete nel db: ${it.SSID} ${it.BSSID} TF: ${it.TimeFound} TL: ${it.TimeLost}")
            }*/
            return l
        }
    }
}