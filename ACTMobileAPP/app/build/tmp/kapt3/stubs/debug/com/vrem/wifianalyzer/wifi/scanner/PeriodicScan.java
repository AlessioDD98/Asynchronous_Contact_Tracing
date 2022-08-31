package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0011\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0012J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0090\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;", "Ljava/lang/Runnable;", "scanner", "Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;", "handler", "Landroid/os/Handler;", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "(Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;Landroid/os/Handler;Lcom/vrem/wifianalyzer/settings/Settings;)V", "running", "", "getRunning$app_debug", "()Z", "setRunning$app_debug", "(Z)V", "nextRun", "", "delay", "", "run", "start", "startWithDelay", "stop", "Companion", "app_debug"})
@com.vrem.annotation.OpenClass()
public class PeriodicScan implements java.lang.Runnable {
    private final com.vrem.wifianalyzer.wifi.scanner.ScannerService scanner = null;
    private final android.os.Handler handler = null;
    private final com.vrem.wifianalyzer.settings.Settings settings = null;
    private boolean running = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.scanner.PeriodicScan.Companion Companion = null;
    private static final long DELAY_INITIAL = 1L;
    public static final long DELAY_INTERVAL = 1000L;
    
    public PeriodicScan(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.ScannerService scanner, @org.jetbrains.annotations.NotNull()
    android.os.Handler handler, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
        super();
    }
    
    public boolean getRunning$app_debug() {
        return false;
    }
    
    public void setRunning$app_debug(boolean p0) {
    }
    
    public void stop() {
    }
    
    public void start() {
    }
    
    public void startWithDelay() {
    }
    
    @java.lang.Override()
    public void run() {
    }
    
    private void nextRun(long delay) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan$Companion;", "", "()V", "DELAY_INITIAL", "", "DELAY_INTERVAL", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}