package com.vrem.wifianalyzer.wifi.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0012J\b\u0010\b\u001a\u00020\u0006H\u0013J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0012J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/manager/WiFiSwitch;", "", "wifiManager", "Landroid/net/wifi/WifiManager;", "(Landroid/net/wifi/WifiManager;)V", "enable", "", "enabled", "enableWiFiAndroidQ", "enableWiFiLegacy", "minVersionQ", "off", "on", "startWiFiSettings", "", "app_debug"})
@com.vrem.annotation.OpenClass()
public class WiFiSwitch {
    private final android.net.wifi.WifiManager wifiManager = null;
    
    public WiFiSwitch(@org.jetbrains.annotations.NotNull()
    android.net.wifi.WifiManager wifiManager) {
        super();
    }
    
    public boolean on() {
        return false;
    }
    
    public boolean off() {
        return false;
    }
    
    public void startWiFiSettings() {
    }
    
    public boolean minVersionQ() {
        return false;
    }
    
    private boolean enable(boolean enabled) {
        return false;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.Q)
    private boolean enableWiFiAndroidQ() {
        return false;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private boolean enableWiFiLegacy(boolean enabled) {
        return false;
    }
}