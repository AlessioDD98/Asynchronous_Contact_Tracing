package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/ScanResultsReceiver;", "Landroid/content/BroadcastReceiver;", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "callback", "Lcom/vrem/wifianalyzer/wifi/scanner/Callback;", "(Lcom/vrem/wifianalyzer/MainActivity;Lcom/vrem/wifianalyzer/wifi/scanner/Callback;)V", "registered", "", "makeIntentFilter", "Landroid/content/IntentFilter;", "action", "", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "register", "unregister", "app_debug"})
@com.vrem.annotation.OpenClass()
public class ScanResultsReceiver extends android.content.BroadcastReceiver {
    private final com.vrem.wifianalyzer.MainActivity mainActivity = null;
    private final com.vrem.wifianalyzer.wifi.scanner.Callback callback = null;
    private boolean registered = false;
    
    public ScanResultsReceiver(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.Callback callback) {
        super();
    }
    
    public void register() {
    }
    
    public void unregister() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.content.IntentFilter makeIntentFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String action) {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
}