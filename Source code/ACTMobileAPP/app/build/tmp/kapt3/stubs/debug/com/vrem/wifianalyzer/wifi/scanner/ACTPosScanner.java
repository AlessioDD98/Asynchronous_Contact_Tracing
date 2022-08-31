package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 92\u00020\u0001:\u00039:;B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020&J\u0016\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*J\u0014\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020&H\u0016J\"\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010/2\u0006\u00104\u001a\u0002022\u0006\u00105\u001a\u000202H\u0016J\u000e\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020\u0004J\u0006\u00108\u001a\u00020&R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006<"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTPosScanner;", "Landroid/app/Service;", "()V", "CHANNEL_ID", "", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "location", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "setLocation", "(Landroid/location/Location;)V", "mc", "Lcom/vrem/wifianalyzer/MainContext;", "permissionService", "Lcom/vrem/wifianalyzer/permission/PermissionService;", "getPermissionService", "()Lcom/vrem/wifianalyzer/permission/PermissionService;", "setPermissionService", "(Lcom/vrem/wifianalyzer/permission/PermissionService;)V", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "getSettings", "()Lcom/vrem/wifianalyzer/settings/Settings;", "setSettings", "(Lcom/vrem/wifianalyzer/settings/Settings;)V", "shouldStop", "", "getShouldStop", "()Z", "setShouldStop", "(Z)V", "createNotificationChannel", "", "getCurrentLocation", "getGeohash", "lat", "", "lon", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onDestroy", "onStartCommand", "", "intent", "flags", "startId", "sendRequest", "geohash", "stopService", "Companion", "InsertNetwork", "getFilteredNetworksByBSSID", "app_debug"})
public final class ACTPosScanner extends android.app.Service {
    private boolean shouldStop = false;
    private com.vrem.wifianalyzer.MainContext mc = com.vrem.wifianalyzer.MainContext.INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.permission.PermissionService permissionService;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.settings.Settings settings;
    private final java.lang.String CHANNEL_ID = "canal1ID";
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location location;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.scanner.ACTPosScanner.Companion Companion = null;
    
    public ACTPosScanner() {
        super();
    }
    
    public final boolean getShouldStop() {
        return false;
    }
    
    public final void setShouldStop(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.permission.PermissionService getPermissionService() {
        return null;
    }
    
    public final void setPermissionService(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.settings.Settings getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    public final void setFusedLocationProviderClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
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
    
    public final void getCurrentLocation() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGeohash(double lat, double lon) {
        return null;
    }
    
    public final void sendRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String geohash) {
    }
    
    private final void createNotificationChannel() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0010\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTPosScanner$getFilteredNetworksByBSSID;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "sBSSID", "", "application", "Landroid/app/Application;", "(Ljava/lang/String;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getSBSSID", "()Ljava/lang/String;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class getFilteredNetworksByBSSID extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.vrem.wifianalyzer.wifi.database.Network>> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sBSSID = null;
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public getFilteredNetworksByBSSID(@org.jetbrains.annotations.NotNull()
        java.lang.String sBSSID, @org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSBSSID() {
            return null;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTPosScanner$InsertNetwork;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "network", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Lcom/vrem/wifianalyzer/wifi/database/Network;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getNetwork", "()Lcom/vrem/wifianalyzer/wifi/database/Network;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
    public static final class InsertNetwork extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        @org.jetbrains.annotations.NotNull()
        private final com.vrem.wifianalyzer.wifi.database.Network network = null;
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public InsertNetwork(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ACTPosScanner$Companion;", "", "()V", "startService", "", "context", "Landroid/content/Context;", "message", "", "stopService", "app_debug"})
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