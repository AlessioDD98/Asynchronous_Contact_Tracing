package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0004ghijB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010O\u001a\u00020PJ\u0014\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010TH\u0016J\b\u0010U\u001a\u00020PH\u0016J\"\u0010V\u001a\u00020W2\b\u0010X\u001a\u0004\u0018\u00010T2\u0006\u0010Y\u001a\u00020W2\u0006\u0010Z\u001a\u00020WH\u0016J\b\u0010[\u001a\u00020PH\u0016J\u0010\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020?H\u0016J\u0006\u0010^\u001a\u00020WJ\b\u0010_\u001a\u00020PH\u0016J\b\u0010`\u001a\u00020PH\u0016J\b\u0010a\u001a\u00020\u000bH\u0016J\b\u0010b\u001a\u00020PH\u0016J\u0006\u0010c\u001a\u00020PJ\b\u0010d\u001a\u00020PH\u0016J\u0010\u0010e\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020?H\u0016J\b\u0010f\u001a\u00020PH\u0016J\b\u0010G\u001a\u00020HH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010@\u001a\u0012 B*\b\u0018\u00010AR\u00020\u001b0AR\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020HX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010I\u001a\u00020J\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020NX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006k"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTScanner;", "Landroid/app/Service;", "Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;", "()V", "CHANNEL_ID", "", "cache", "Lcom/vrem/wifianalyzer/wifi/scanner/Cache;", "getCache", "()Lcom/vrem/wifianalyzer/wifi/scanner/Cache;", "initialScan", "", "mc", "Lcom/vrem/wifianalyzer/MainContext;", "periodicScan", "Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;", "getPeriodicScan", "()Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;", "setPeriodicScan", "(Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;)V", "permissionService", "Lcom/vrem/wifianalyzer/permission/PermissionService;", "getPermissionService", "()Lcom/vrem/wifianalyzer/permission/PermissionService;", "setPermissionService", "(Lcom/vrem/wifianalyzer/permission/PermissionService;)V", "powerManager", "Landroid/os/PowerManager;", "getPowerManager", "()Landroid/os/PowerManager;", "setPowerManager", "(Landroid/os/PowerManager;)V", "scanResultsReceiver", "Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;", "getScanResultsReceiver", "()Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;", "setScanResultsReceiver", "(Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;)V", "scannerCallback", "Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;", "getScannerCallback", "()Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;", "setScannerCallback", "(Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;)V", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "getSettings", "()Lcom/vrem/wifianalyzer/settings/Settings;", "setSettings", "(Lcom/vrem/wifianalyzer/settings/Settings;)V", "shouldStop", "getShouldStop", "()Z", "setShouldStop", "(Z)V", "transformer", "Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;", "getTransformer", "()Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;", "setTransformer", "(Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;)V", "updateNotifiers", "", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "kotlin.jvm.PlatformType", "getWakeLock", "()Landroid/os/PowerManager$WakeLock;", "setWakeLock", "(Landroid/os/PowerManager$WakeLock;)V", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "wiFiManager", "Landroid/net/wifi/WifiManager;", "getWiFiManager", "()Landroid/net/wifi/WifiManager;", "wiFiManagerWrapper", "Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "createNotificationChannel", "", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onDestroy", "onStartCommand", "", "intent", "flags", "startId", "pause", "register", "updateNotifier", "registered", "resume", "resumeWithDelay", "running", "stop", "stopService", "toggle", "unregister", "update", "CloseNetwork", "Companion", "UpdateNetwork", "getAllNetworks", "app_debug"})
public final class ACTScanner extends android.app.Service implements com.vrem.wifianalyzer.wifi.scanner.ScannerService {
    public com.vrem.wifianalyzer.wifi.scanner.PeriodicScan periodicScan;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.scanner.Cache cache = null;
    private boolean shouldStop = false;
    private final java.util.List<com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier> updateNotifiers = null;
    private com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData;
    private boolean initialScan = false;
    private com.vrem.wifianalyzer.MainContext mc = com.vrem.wifianalyzer.MainContext.INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.settings.Settings settings;
    @org.jetbrains.annotations.NotNull()
    private final android.net.wifi.WifiManager wiFiManager = null;
    private com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper wiFiManagerWrapper;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.permission.PermissionService permissionService;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.wifi.scanner.ScannerCallback scannerCallback;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.wifi.scanner.ScanResultsReceiver scanResultsReceiver;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.wifi.scanner.Transformer transformer;
    private final java.lang.String CHANNEL_ID = "canal1ID";
    @org.jetbrains.annotations.NotNull()
    private android.os.PowerManager powerManager;
    private android.os.PowerManager.WakeLock wakeLock;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.scanner.ACTScanner.Companion Companion = null;
    
    public ACTScanner() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.scanner.PeriodicScan getPeriodicScan() {
        return null;
    }
    
    public final void setPeriodicScan(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.PeriodicScan p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.scanner.Cache getCache() {
        return null;
    }
    
    public final boolean getShouldStop() {
        return false;
    }
    
    public final void setShouldStop(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.settings.Settings getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.wifi.WifiManager getWiFiManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.permission.PermissionService getPermissionService() {
        return null;
    }
    
    public final void setPermissionService(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.scanner.ScannerCallback getScannerCallback() {
        return null;
    }
    
    public final void setScannerCallback(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.ScannerCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.scanner.ScanResultsReceiver getScanResultsReceiver() {
        return null;
    }
    
    public final void setScanResultsReceiver(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.ScanResultsReceiver p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.scanner.Transformer getTransformer() {
        return null;
    }
    
    public final void setTransformer(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.Transformer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.PowerManager getPowerManager() {
        return null;
    }
    
    public final void setPowerManager(@org.jetbrains.annotations.NotNull()
    android.os.PowerManager p0) {
    }
    
    public final android.os.PowerManager.WakeLock getWakeLock() {
        return null;
    }
    
    public final void setWakeLock(android.os.PowerManager.WakeLock p0) {
    }
    
    public final void stopService() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void update() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData() {
        return null;
    }
    
    @java.lang.Override()
    public boolean register(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier updateNotifier) {
        return false;
    }
    
    @java.lang.Override()
    public boolean unregister(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier updateNotifier) {
        return false;
    }
    
    @java.lang.Override()
    public void pause() {
    }
    
    @java.lang.Override()
    public boolean running() {
        return false;
    }
    
    @java.lang.Override()
    public void resume() {
    }
    
    @java.lang.Override()
    public void resumeWithDelay() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void toggle() {
    }
    
    public final int registered() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    public final void createNotificationChannel() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTScanner$CloseNetwork;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class CloseNetwork extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.vrem.wifianalyzer.wifi.database.Network>> {
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public CloseNetwork(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApplication() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<com.vrem.wifianalyzer.wifi.database.Network> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTScanner$UpdateNetwork;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "network", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Lcom/vrem/wifianalyzer/wifi/database/Network;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getNetwork", "()Lcom/vrem/wifianalyzer/wifi/database/Network;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
    public static final class UpdateNetwork extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        @org.jetbrains.annotations.NotNull()
        private final com.vrem.wifianalyzer.wifi.database.Network network = null;
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public UpdateNetwork(@org.jetbrains.annotations.NotNull()
        com.vrem.wifianalyzer.wifi.database.Network network, @org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.database.Network getNetwork() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApplication() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTScanner$getAllNetworks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class getAllNetworks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.vrem.wifianalyzer.wifi.database.Network>> {
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public getAllNetworks(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApplication() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<com.vrem.wifianalyzer.wifi.database.Network> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTScanner$Companion;", "", "()V", "startService", "", "context", "Landroid/content/Context;", "message", "", "stopService", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void startService(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final void stopService(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}