package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;", "", "pause", "", "register", "", "updateNotifier", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "resume", "resumeWithDelay", "running", "stop", "toggle", "unregister", "update", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
public abstract interface ScannerService {
    
    public abstract void update();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData();
    
    public abstract boolean register(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier updateNotifier);
    
    public abstract boolean unregister(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier updateNotifier);
    
    public abstract void pause();
    
    public abstract boolean running();
    
    public abstract void resume();
    
    public abstract void resumeWithDelay();
    
    public abstract void stop();
    
    public abstract void toggle();
}