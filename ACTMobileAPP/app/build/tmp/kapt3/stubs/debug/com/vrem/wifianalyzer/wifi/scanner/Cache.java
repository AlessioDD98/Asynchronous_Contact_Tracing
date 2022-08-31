package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0011\u0018\u0000 72\u00020\u0001:\u0005789:;B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020+2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\"\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u001f2\b\u0010/\u001a\u0004\u0018\u000100H\u0012J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0012J\u0018\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u001f03j\b\u0012\u0004\u0012\u00020\u001f`4H\u0012J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002000\u001eH\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\n\u0010(\u001a\u0004\u0018\u00010)H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0092\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068RX\u0092\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\bR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Cache;", "", "()V", "count", "", "del", "", "getDel", "()Z", "setDel", "(Z)V", "listNetwork", "Ljava/util/ArrayList;", "", "getListNetwork", "()Ljava/util/ArrayList;", "setListNetwork", "(Ljava/util/ArrayList;)V", "mc", "Lcom/vrem/wifianalyzer/MainContext;", "remListNetwork", "getRemListNetwork", "setRemListNetwork", "sRemove", "getSRemove", "()Ljava/lang/String;", "setSRemove", "(Ljava/lang/String;)V", "scanResults", "Lkotlin/collections/ArrayDeque;", "", "Landroid/net/wifi/ScanResult;", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "getSettings", "()Lcom/vrem/wifianalyzer/settings/Settings;", "setSettings", "(Lcom/vrem/wifianalyzer/settings/Settings;)V", "sizeAvailable", "getSizeAvailable", "wifiInfo", "Landroid/net/wifi/WifiInfo;", "add", "", "calculate", "first", "element", "accumulator", "Lcom/vrem/wifianalyzer/wifi/scanner/CacheResult;", "combineCache", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "last", "size", "Companion", "InsertNetwork", "UpdateNetwork", "getAllNetworks", "getFilteredNetworks", "app_debug"})
@com.vrem.annotation.OpenClass()
public class Cache {
    private kotlin.collections.ArrayDeque<java.util.List<android.net.wifi.ScanResult>> scanResults;
    private android.net.wifi.WifiInfo wifiInfo;
    private int count = 2;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> listNetwork;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> remListNetwork;
    private boolean del = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sRemove = "";
    private com.vrem.wifianalyzer.MainContext mc = com.vrem.wifianalyzer.MainContext.INSTANCE;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.settings.Settings settings;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.scanner.Cache.Companion Companion = null;
    private static final int MINIMUM = 1;
    private static final int MAXIMUM = 4;
    private static final int SIZE = 5;
    private static final int LEVEL_MINIMUM = -100;
    private static final int LEVEL_MAXIMUM = 0;
    private static final int FACTOR = 3;
    private static final int DENOMINATOR = 2;
    private static final int COUNT_MIN = 2;
    
    public Cache() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<java.lang.String> getListNetwork() {
        return null;
    }
    
    public void setListNetwork(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<java.lang.String> getRemListNetwork() {
        return null;
    }
    
    public void setRemListNetwork(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public boolean getDel() {
        return false;
    }
    
    public void setDel(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSRemove() {
        return null;
    }
    
    public void setSRemove(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.settings.Settings getSettings() {
        return null;
    }
    
    public void setSettings(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.scanner.CacheResult> scanResults() {
        return null;
    }
    
    public void add(@org.jetbrains.annotations.NotNull()
    java.util.List<android.net.wifi.ScanResult> scanResults, @org.jetbrains.annotations.Nullable()
    android.net.wifi.WifiInfo wifiInfo) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<android.net.wifi.ScanResult> first() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<android.net.wifi.ScanResult> last() {
        return null;
    }
    
    public int size() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.net.wifi.WifiInfo wifiInfo() {
        return null;
    }
    
    private int calculate(boolean first, android.net.wifi.ScanResult element, com.vrem.wifianalyzer.wifi.scanner.CacheResult accumulator) {
        return 0;
    }
    
    private java.util.List<android.net.wifi.ScanResult> combineCache() {
        return null;
    }
    
    private java.util.Comparator<android.net.wifi.ScanResult> comparator() {
        return null;
    }
    
    private boolean getSizeAvailable() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Cache$InsertNetwork;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "network", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Lcom/vrem/wifianalyzer/wifi/database/Network;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getNetwork", "()Lcom/vrem/wifianalyzer/wifi/database/Network;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000e\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Cache$UpdateNetwork;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "network", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Lcom/vrem/wifianalyzer/wifi/database/Network;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getNetwork", "()Lcom/vrem/wifianalyzer/wifi/database/Network;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Cache$getAllNetworks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ-\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0010\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Cache$getFilteredNetworks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "sBSSID", "", "application", "Landroid/app/Application;", "(Ljava/lang/String;Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getSBSSID", "()Ljava/lang/String;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class getFilteredNetworks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.vrem.wifianalyzer.wifi.database.Network>> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String sBSSID = null;
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public getFilteredNetworks(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Cache$Companion;", "", "()V", "COUNT_MIN", "", "DENOMINATOR", "FACTOR", "LEVEL_MAXIMUM", "LEVEL_MINIMUM", "MAXIMUM", "MINIMUM", "SIZE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}