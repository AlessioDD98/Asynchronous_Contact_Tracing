package com.vrem.wifianalyzer.wifi.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.vrem.wifianalyzer.wifi.database.DateConverter.class})
@androidx.room.Database(version = 1, entities = {com.vrem.wifianalyzer.wifi.database.Network.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/database/NetworkDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getNetworkDao", "Lcom/vrem/wifianalyzer/wifi/database/NetworkDao;", "Companion", "app_debug"})
public abstract class NetworkDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.database.NetworkDatabase.Companion Companion = null;
    
    public NetworkDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrem.wifianalyzer.wifi.database.NetworkDao getNetworkDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/database/NetworkDatabase$Companion;", "", "()V", "get", "Lcom/vrem/wifianalyzer/wifi/database/NetworkDatabase;", "application", "Landroid/app/Application;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.database.NetworkDatabase get(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            return null;
        }
    }
}