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

import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.Handler
import com.vrem.wifianalyzer.MainActivity
import com.vrem.wifianalyzer.MainContext
import com.vrem.wifianalyzer.permission.PermissionService
import com.vrem.wifianalyzer.settings.Repository
import com.vrem.wifianalyzer.settings.Settings
import com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper
import com.vrem.wifianalyzer.wifi.model.WiFiData

interface UpdateNotifier {
    fun update(wiFiData: WiFiData)
}

interface ScannerService {
    fun update()
    fun wiFiData(): WiFiData
    fun register(updateNotifier: UpdateNotifier): Boolean
    fun unregister(updateNotifier: UpdateNotifier): Boolean
    fun pause()
    fun running(): Boolean
    fun resume()
    fun resumeWithDelay()
    fun stop()
    fun toggle()
}

fun makeScannerService(
    mainActivity: MainActivity,
    wiFiManagerWrapper: WiFiManagerWrapper,
    handler: Handler,
    settings: Settings
): ScannerService {
    val sharedPreference =  mainActivity.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)
    val mode= sharedPreference.getString("mode","nessuna")
    if(mode.equals("normal")) {
        val cache = Cache()
        val transformer = Transformer(cache)
        val permissionService = PermissionService(mainActivity)
        val scanner = Scanner(wiFiManagerWrapper, settings, permissionService, transformer)
        scanner.periodicScan = PeriodicScan(scanner, handler, settings)
        scanner.scannerCallback = ScannerCallback(wiFiManagerWrapper, cache)
        scanner.scanResultsReceiver = ScanResultsReceiver(mainActivity, scanner.scannerCallback)
        return scanner
    }else{
       /* val cache = Cache()
        val transformer = Transformer(cache)*/
        //val permissionService = PermissionService(mainActivity)
        val scanner = ACTScanner()
        scanner.periodicScan = PeriodicScan(scanner, handler, settings)
        //scanner.scannerCallback = ScannerCallback(wiFiManagerWrapper, cache)
        //scanner.scanResultsReceiver = ScanResultsReceiver(mainActivity, scanner.scannerCallback)
        //****
        //scanner.permissionService = PermissionService(mainActivity)
        val mc=MainContext.INSTANCE
        /*val wiFiManager: WifiManager = mc.context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
        scanner.wiFiManagerWrapper= WiFiManagerWrapper(wiFiManager)*/
        //scanner.settings = Settings(Repository(mc.context))
        //scanner.transformer = Transformer(cache)
        ACTScanner.startService(mc.context, "Scanning is running")
        ACTPosScanner.startService(mc.context,"Scanning is running")
        //****
        return scanner
    }
}
