package com.vrem.wifianalyzer.wifi.scanner

import android.app.*
import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.os.*
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.vrem.wifianalyzer.MainActivity
import com.vrem.wifianalyzer.MainContext
import com.vrem.wifianalyzer.permission.PermissionService
import com.vrem.wifianalyzer.settings.Repository
import com.vrem.wifianalyzer.settings.Settings
import com.vrem.wifianalyzer.wifi.database.Network
import com.vrem.wifianalyzer.wifi.database.NetworkDatabase
import com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper
import com.vrem.wifianalyzer.wifi.model.WiFiData
import java.util.*


internal class ACTScanner :  Service(),
    ScannerService {
    lateinit var periodicScan: PeriodicScan
    val cache = Cache()
    var shouldStop=false

    private val updateNotifiers: MutableList<UpdateNotifier> = mutableListOf()

    private var wiFiData: WiFiData = WiFiData.EMPTY
    private var initialScan: Boolean = false
    private var mc=MainContext.INSTANCE
    var settings: Settings =Settings(Repository(mc.context))

    val wiFiManager = MainContext.INSTANCE.context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
    private  var wiFiManagerWrapper: WiFiManagerWrapper = WiFiManagerWrapper(wiFiManager)
    var permissionService: PermissionService= mc.permissionService
    var scannerCallback: ScannerCallback=ScannerCallback(wiFiManagerWrapper, cache)
    var scanResultsReceiver: ScanResultsReceiver= ScanResultsReceiver(mc.mA,scannerCallback)
    var transformer: Transformer = Transformer(cache)
    private val CHANNEL_ID = "canal1ID"
    var powerManager=MainContext.INSTANCE.context.applicationContext.getSystemService(Context.POWER_SERVICE) as PowerManager
    var wakeLock=powerManager.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,"MYAPP:WAKELOCK")

    companion object {
        fun startService(context: Context, message: String) {
            val startIntent = Intent(context, ACTScanner::class.java)
            startIntent.putExtra("inputExtra", message)
            ContextCompat.startForegroundService(context,startIntent)
        }
        fun stopService(context: Context) {
            val stopIntent = Intent(context, ACTScanner::class.java)
            context.stopService(stopIntent)

        }
    }

    fun stopService() {
        val stopIntent = Intent(mc.context, ACTScanner::class.java)
        mc.context.stopService(stopIntent)
    }

    class CloseNetwork(val application: Application) : AsyncTask<Void,Void,List<Network>>(){
        override fun doInBackground(vararg p0: Void?): List<Network>? {
            var l= NetworkDatabase.get(application).getNetworkDao().getOpenNetworks()
            l.forEach{
                println("Rete nel db: ${it.SSID} ${it.BSSID} TF: ${it.TimeFound} TL: ${it.TimeLost}")
            }
            return l
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
                println("Rete nel db DOPO ONDESTROY: ${it.SSID} ${it.BSSID} TF: ${it.TimeFound} TL: ${it.TimeLost}")
            }
            return l
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        println("ONDESTROY")
        //******* Quando chiudo l'app metto la data attuale a tutte le reti che avevano TL=NULL
        var networks= CloseNetwork(MainContext.INSTANCE.mainActivity.application).execute().get()
        for(n in networks){
            var n= Network(n.SSID,n.BSSID,n.TimeFound, Date())
            UpdateNetwork(n, MainContext.INSTANCE.mainActivity.application).execute()
        }
        getAllNetworks(MainContext.INSTANCE.mainActivity.application).execute().get()
        //*******
        shouldStop=true
        //periodicScan.stop()
        scanResultsReceiver.unregister()
       // wakeLock.release()
        stopService()
        stopSelf()
    }

   /* override fun onCreate() {
        wakeLock.acquire(60000)
        println("Intent Service onCreate")
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            createNotificationChannel()
            val notification= NotificationCompat.Builder(this,CHANNEL_ID)
                .setContentTitle("ACTMApp")
                .setContentText("Scanning in esecuzione")
                .setSmallIcon(com.vrem.wifianalyzer.R.drawable.ic_app)
                .build()
            startForeground(1,notification)
        }
        scanResultsReceiver.register()
        super.onCreate()
    }*/

    /*override fun onHandleIntent(p0: Intent?) {
        while (!shouldStop) {
            println("Richiamo Update")
            update()
            SystemClock.sleep(settings.scanSpeed() * 1000L)
        }
    }*/

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
         scanResultsReceiver.register()

        Thread {
            Looper.prepare()
            while (!shouldStop) {
                println("Richiamo Update")
                update()
               /* wiFiManagerWrapper.startScan()
                if (!initialScan) {
                    scannerCallback.onSuccess()
                    initialScan = true
                }*/
                //wiFiData = transformer.transformToWiFiData()
               // updateNotifiers.forEach { it.update(wiFiData) }
                try {
                    Thread.sleep((settings.scanSpeed()*1000L))
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                    println("Thread interrotto")
                }
            }
        }.start()

        return START_NOT_STICKY
    }

    override fun update() {
        wiFiManagerWrapper.enableWiFi()
        if (permissionService.enabled()) {
            //val wiFiManager = MainContext.INSTANCE.context.applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            var b= wiFiManagerWrapper.startScan()
            if(!b){
                println("Fallimento")
            }else{
                println("SUCCESSO")
            }
            println("Initial scan: "+initialScan)
           // if (!initialScan) {
                scannerCallback.onSuccess()
                initialScan = true
            //}
        }
        wiFiData = transformer.transformToWiFiData()
        updateNotifiers.forEach { it.update(wiFiData) }
        scanResultsReceiver.unregister()
    }

    override fun wiFiData(): WiFiData = wiFiData

    override fun register(updateNotifier: UpdateNotifier): Boolean = updateNotifiers.add(updateNotifier)

    override fun unregister(updateNotifier: UpdateNotifier): Boolean = updateNotifiers.remove(updateNotifier)

    override fun pause() {
        periodicScan.stop()
        //scanResultsReceiver.unregister()
        //stopService()
    }

    override fun running(): Boolean = periodicScan.running
    override fun resume(): Unit = periodicScan.start()

    override fun resumeWithDelay(): Unit = periodicScan.startWithDelay()

    override fun stop() {
        println("Eseguo Stop ACTScanner")
        periodicScan.stop()
       /* updateNotifiers.clear()
        if (settings.wiFiOffOnExit() == true) {
            wiFiManagerWrapper.disableWiFi()
        }*/
        //scanResultsReceiver.unregister()
        //stopService()
    }

    override fun toggle(): Unit =
        if (periodicScan.running) {
            periodicScan.stop()
        } else {
            periodicScan.start()
        }

    fun registered(): Int = updateNotifiers.size

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val serviceChannel = NotificationChannel(CHANNEL_ID, "Foreground Service Channel",
                NotificationManager.IMPORTANCE_HIGH)
            val manager = getSystemService(NotificationManager::class.java)
            manager!!.createNotificationChannel(serviceChannel)
        }
    }

}