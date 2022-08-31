package com.vrem.wifianalyzer.wifi.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\'J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/database/NetworkDao;", "", "getFilteredNetworks", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "sBSSID", "", "getFilteredNetworksByBSSID", "getNetworks", "getOpenNetworks", "insertNetwork", "", "network", "updateNetwork", "app_debug"})
public abstract interface NetworkDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insertNetwork(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.database.Network network);
    
    @androidx.room.Update()
    public abstract void updateNetwork(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.database.Network network);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Network")
    public abstract java.util.List<com.vrem.wifianalyzer.wifi.database.Network> getNetworks();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Network WHERE BSSID LIKE:sBSSID AND TimeLost IS null")
    public abstract java.util.List<com.vrem.wifianalyzer.wifi.database.Network> getFilteredNetworks(@org.jetbrains.annotations.NotNull()
    java.lang.String sBSSID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Network WHERE BSSID LIKE:sBSSID AND TimeFound IS NOT null AND TimeLost IS NOT null")
    public abstract java.util.List<com.vrem.wifianalyzer.wifi.database.Network> getFilteredNetworksByBSSID(@org.jetbrains.annotations.NotNull()
    java.lang.String sBSSID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Network WHERE TimeLost IS null")
    public abstract java.util.List<com.vrem.wifianalyzer.wifi.database.Network> getOpenNetworks();
}