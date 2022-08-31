package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;", "Lcom/vrem/wifianalyzer/wifi/scanner/Callback;", "wiFiManagerWrapper", "Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "cache", "Lcom/vrem/wifianalyzer/wifi/scanner/Cache;", "(Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;Lcom/vrem/wifianalyzer/wifi/scanner/Cache;)V", "getCache", "()Lcom/vrem/wifianalyzer/wifi/scanner/Cache;", "getWiFiManagerWrapper", "()Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "onSuccess", "", "app_debug"})
@com.vrem.annotation.OpenClass()
public class ScannerCallback implements com.vrem.wifianalyzer.wifi.scanner.Callback {
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper wiFiManagerWrapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.scanner.Cache cache = null;
    
    public ScannerCallback(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper wiFiManagerWrapper, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.Cache cache) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper getWiFiManagerWrapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.scanner.Cache getCache() {
        return null;
    }
    
    @java.lang.Override()
    public void onSuccess() {
    }
}