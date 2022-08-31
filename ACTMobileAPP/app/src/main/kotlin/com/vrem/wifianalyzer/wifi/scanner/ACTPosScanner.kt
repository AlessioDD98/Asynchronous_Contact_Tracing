package com.vrem.wifianalyzer.wifi.scanner

import android.Manifest
import android.app.*
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.os.AsyncTask
import android.os.Build
import android.os.IBinder
import android.os.Looper
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import ch.hsr.geohash.GeoHash.geoHashStringWithCharacterPrecision
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.location.*
import com.vrem.wifianalyzer.MainActivity
import com.vrem.wifianalyzer.MainContext
import com.vrem.wifianalyzer.permission.PermissionService
import com.vrem.wifianalyzer.settings.Repository
import com.vrem.wifianalyzer.settings.Settings
import com.vrem.wifianalyzer.wifi.database.Network
import com.vrem.wifianalyzer.wifi.database.NetworkDatabase
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.time.format.DateTimeFormatter
import java.util.*


class ACTPosScanner : Service() {
    var shouldStop=false
    private var mc= MainContext.INSTANCE
    var permissionService: PermissionService = mc.permissionService
    var settings: Settings = Settings(Repository(mc.context))
    private val CHANNEL_ID = "canal1ID"
    var fusedLocationProviderClient=LocationServices.getFusedLocationProviderClient(mc.context)
    var location: Location?=null

    companion object {
        fun startService(context: Context, message: String) {
            val startIntent = Intent(context, ACTPosScanner::class.java)
            startIntent.putExtra("inputExtra", message)
            ContextCompat.startForegroundService(context,startIntent)
        }
        fun stopService(context: Context) {
            val stopIntent = Intent(context, ACTPosScanner::class.java)
            context.stopService(stopIntent)

        }
    }

    fun stopService() {
        val stopIntent = Intent(mc.context, ACTPosScanner::class.java)
        mc.context.stopService(stopIntent)
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ONDESTROY")
        shouldStop=true
        stopService()
        stopSelf()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val input = intent?.getStringExtra("inputExtra")
        createNotificationChannel()
        val notificationIntent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this,
            0, notificationIntent, 0
        )
        val notification= NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("ACTMApp")
            .setContentText(input)
            .setSmallIcon(com.vrem.wifianalyzer.R.drawable.ic_app)
            .setContentIntent(pendingIntent)
            .build()
        startForeground(1, notification)

        Thread {
            Looper.prepare()
            while (!shouldStop) {
                println("Richiamo Update POS")
                getCurrentLocation()
                try {
                    Thread.sleep((settings.posScanSpeed()*1000L))
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                    println("Thread POS interrotto")
                }
            }
        }.start()

        return START_NOT_STICKY
    }

    fun getCurrentLocation(){
        if(permissionService.enabled()){
            if (ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                permissionService.enabled()
                return
            }
            fusedLocationProviderClient.lastLocation.addOnCompleteListener(MainContext.INSTANCE.mainActivity){ task->
                location=task.result
                if(location!=null){
                    println("LAT: ${location!!.latitude} LONG: ${location!!.longitude}")
                    var geohash= getGeohash(location!!.latitude, location!!.longitude)
                    println("Geohash della posizione: $geohash")
                    sendRequest(geohash)
                }else{
                    println("ERRORE NELLA POSIZIONE")
                }
            }
        }else{
            Toast.makeText(mc.context,"Enable Location Setting",Toast.LENGTH_LONG).show()
        }
    }

    fun getGeohash(lat: Double, lon: Double): String{
        return geoHashStringWithCharacterPrecision(lat, lon, 6)
    }

    fun sendRequest(geohash: String){
        /*var d=Date()
        val cal = Calendar.getInstance()
        cal.time = d
        cal.add(Calendar.MONTH, 1)
        val datePlusOneMonth: Date = cal.time
        for(i in 0 until 10){
            var n= Network("Prova $i","00:00:00:00:00:00",Date(),datePlusOneMonth)
            InsertNetwork(n, MainContext.INSTANCE.mainActivity.application).execute()
        }*/
        createNotificationChannel()
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationIntent = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(
            this,
            0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT
        )
        val notification= NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("ACTMApp")
            .setContentText("You have been exposed to the risk of infection. Go for a test now")
            .setSmallIcon(com.vrem.wifianalyzer.R.drawable.ic_app)
            .setContentIntent(pendingIntent)
        val queue = Volley.newRequestQueue(this)
        val url = "http://84a6-46-193-67-245.ngrok.io/ControlService/SMAPP"
        val parameters=JSONObject()
        parameters.put("Location",geohash)
        val strReq = JsonObjectRequest(Request.Method.POST, url, parameters, { response ->
            val str = response.toString()
            println("response: " + str)
            val rep=response.getJSONArray("Replies")
            for(i in 0 until rep.length()){
                var ele=rep.getJSONObject(i).getString("Peripheral_Service_Id")
                var networkFiltered = getFilteredNetworksByBSSID(ele,MainContext.INSTANCE.mainActivity.application).execute().get()
                println("SIZE: ${networkFiltered.size}")
                if(networkFiltered.isNotEmpty()){
                    for(x in networkFiltered) {
                        println("ELE: $x")
                        val rf=rep.getJSONObject(i).getJSONObject("RED_Forecasts")
                        var ts=rf.getString("Start")
                        var te=rf.getString("End")
                        ts=ts.replace("T"," ")
                        te=te.replace("T"," ")
                        println("TS: $ts\n TE: $te")
                        var tf=x.TimeFound
                        var td=x.TimeLost
                        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        val dataTS = formatter.parse("2022-06-09 14:35:00.000000")
                        println("DATA START: $dataTS")
                        val dataTE = formatter.parse("2022-09-02 14:35:00.000000")
                        println("DATA END: $dataTE")
                        //Time interval check
                        if(tf>=dataTS && td!!<=dataTE) {
                            notificationManager.notify(2, notification.build())
                            println("NOTIFICA per ele $x")
                        }
                        else if(tf<dataTS && td!! >=dataTS){
                            notificationManager.notify(2, notification.build())
                            println("NOTIFICA per ele $x")
                        }
                        else if(tf>=dataTS && td==null){
                            notificationManager.notify(2, notification.build())
                            println("NOTIFICA per ele $x")
                        }
                    }
                }
            }
        }, {
                error ->
            println("VOLLEY ERROR: "+error)
        })
        // Adding request to request queue
        queue.add(strReq)
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(CHANNEL_ID, "Foreground Service Channel",
                NotificationManager.IMPORTANCE_DEFAULT)
            val manager = getSystemService(NotificationManager::class.java)
            manager!!.createNotificationChannel(serviceChannel)
        }
    }

    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    class getFilteredNetworksByBSSID(val sBSSID : String, val application: Application) : AsyncTask<Void, Void, List<Network>>(){
        override fun doInBackground(vararg p0: Void?): List<Network>? {
            var l= NetworkDatabase.get(application).getNetworkDao().getFilteredNetworksByBSSID(sBSSID)
            /*l.forEach{
                println("Rete nel db: ${it.SSID} ${it.BSSID} TF: ${it.TimeFound} TL: ${it.TimeLost}")
            }*/
            return l
        }
    }

    class InsertNetwork(val network: Network, val application: Application) : AsyncTask<Void,Void,Void>(){
        override fun doInBackground(vararg p0: Void?): Void? {
            NetworkDatabase.get(application).getNetworkDao().insertNetwork(network)
            return null
        }
    }
}