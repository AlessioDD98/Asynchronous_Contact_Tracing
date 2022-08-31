package com.vrem.wifianalyzer.wifi.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "", "wifiManager", "Landroid/net/wifi/WifiManager;", "wiFiSwitch", "Lcom/vrem/wifianalyzer/wifi/manager/WiFiSwitch;", "(Landroid/net/wifi/WifiManager;Lcom/vrem/wifianalyzer/wifi/manager/WiFiSwitch;)V", "disableWiFi", "", "enableWiFi", "is5GHzBandSupported", "is6GHzBandSupported", "minVersionL", "minVersionR", "scanResults", "", "Landroid/net/wifi/ScanResult;", "startScan", "wiFiEnabled", "wiFiInfo", "Landroid/net/wifi/WifiInfo;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class WiFiManagerWrapper {
    private final android.net.wifi.WifiManager wifiManager = null;
    private final com.vrem.wifianalyzer.wifi.manager.WiFiSwitch wiFiSwitch = null;
    
    public WiFiManagerWrapper(@org.jetbrains.annotations.NotNull()
    android.net.wifi.WifiManager wifiManager, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.manager.WiFiSwitch wiFiSwitch) {
        super();
    }
    
    public boolean wiFiEnabled() {
        return false;
    }
    
    public boolean enableWiFi() {
        return false;
    }
    
    public boolean disableWiFi() {
        return false;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    public boolean startScan() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<android.net.wifi.ScanResult> scanResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public android.net.wifi.WifiInfo wiFiInfo() {
        return null;
    }
    
    public boolean is5GHzBandSupported() {
        return false;
    }
    
    public boolean is6GHzBandSupported() {
        return false;
    }
    
    public boolean minVersionL() {
        return false;
    }
    
    public boolean minVersionR() {
        return false;
    }
}