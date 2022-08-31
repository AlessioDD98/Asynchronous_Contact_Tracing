package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0011\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\'H\u0016J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016J\b\u00104\u001a\u00020\fH\u0016J\b\u00105\u001a\u00020-H\u0016J\b\u00106\u001a\u00020-H\u0016J\u0010\u00107\u001a\u00020\f2\u0006\u0010/\u001a\u00020\'H\u0016J\b\u00108\u001a\u00020-H\u0016J\b\u0010(\u001a\u00020)H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u00069"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Scanner;", "Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;", "wiFiManagerWrapper", "Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "permissionService", "Lcom/vrem/wifianalyzer/permission/PermissionService;", "transformer", "Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;", "(Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;Lcom/vrem/wifianalyzer/settings/Settings;Lcom/vrem/wifianalyzer/permission/PermissionService;Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;)V", "initialScan", "", "periodicScan", "Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;", "getPeriodicScan", "()Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;", "setPeriodicScan", "(Lcom/vrem/wifianalyzer/wifi/scanner/PeriodicScan;)V", "getPermissionService", "()Lcom/vrem/wifianalyzer/permission/PermissionService;", "scanResultsReceiver", "Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;", "getScanResultsReceiver", "()Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;", "setScanResultsReceiver", "(Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;)V", "scannerCallback", "Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;", "getScannerCallback", "()Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;", "setScannerCallback", "(Lcom/vrem/wifianalyzer/wifi/scanner/ScannerCallback;)V", "getSettings", "()Lcom/vrem/wifianalyzer/settings/Settings;", "getTransformer", "()Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;", "updateNotifiers", "", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "getWiFiManagerWrapper", "()Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "pause", "", "register", "updateNotifier", "registered", "", "resume", "resumeWithDelay", "running", "stop", "toggle", "unregister", "update", "app_debug"})
@com.vrem.annotation.OpenClass()
public class Scanner implements com.vrem.wifianalyzer.wifi.scanner.ScannerService {
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper wiFiManagerWrapper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.settings.Settings settings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.permission.PermissionService permissionService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.scanner.Transformer transformer = null;
    private final java.util.List<com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier> updateNotifiers = null;
    private com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData;
    private boolean initialScan = false;
    public com.vrem.wifianalyzer.wifi.scanner.PeriodicScan periodicScan;
    public com.vrem.wifianalyzer.wifi.scanner.ScannerCallback scannerCallback;
    public com.vrem.wifianalyzer.wifi.scanner.ScanResultsReceiver scanResultsReceiver;
    
    public Scanner(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper wiFiManagerWrapper, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.PermissionService permissionService, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.Transformer transformer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper getWiFiManagerWrapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.settings.Settings getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.permission.PermissionService getPermissionService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.scanner.Transformer getTransformer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.scanner.PeriodicScan getPeriodicScan() {
        return null;
    }
    
    public void setPeriodicScan(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.PeriodicScan p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.scanner.ScannerCallback getScannerCallback() {
        return null;
    }
    
    public void setScannerCallback(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.ScannerCallback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.scanner.ScanResultsReceiver getScanResultsReceiver() {
        return null;
    }
    
    public void setScanResultsReceiver(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.ScanResultsReceiver p0) {
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
    
    public int registered() {
        return 0;
    }
}