package com.vrem.wifianalyzer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020GR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010Bj\u0002\bH\u00a8\u0006I"}, d2 = {"Lcom/vrem/wifianalyzer/MainContext;", "", "(Ljava/lang/String;I)V", "configuration", "Lcom/vrem/wifianalyzer/Configuration;", "getConfiguration", "()Lcom/vrem/wifianalyzer/Configuration;", "setConfiguration", "(Lcom/vrem/wifianalyzer/Configuration;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "filtersAdapter", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/FiltersAdapter;", "getFiltersAdapter", "()Lcom/vrem/wifianalyzer/wifi/filter/adapter/FiltersAdapter;", "setFiltersAdapter", "(Lcom/vrem/wifianalyzer/wifi/filter/adapter/FiltersAdapter;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "mA", "Lcom/vrem/wifianalyzer/MainActivity;", "getMA", "()Lcom/vrem/wifianalyzer/MainActivity;", "mainActivity", "getMainActivity", "setMainActivity", "(Lcom/vrem/wifianalyzer/MainActivity;)V", "permissionService", "Lcom/vrem/wifianalyzer/permission/PermissionService;", "getPermissionService", "()Lcom/vrem/wifianalyzer/permission/PermissionService;", "resources", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "scannerService", "Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;", "getScannerService", "()Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;", "setScannerService", "(Lcom/vrem/wifianalyzer/wifi/scanner/ScannerService;)V", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "getSettings", "()Lcom/vrem/wifianalyzer/settings/Settings;", "setSettings", "(Lcom/vrem/wifianalyzer/settings/Settings;)V", "vendorService", "Lcom/vrem/wifianalyzer/vendor/model/VendorService;", "getVendorService", "()Lcom/vrem/wifianalyzer/vendor/model/VendorService;", "setVendorService", "(Lcom/vrem/wifianalyzer/vendor/model/VendorService;)V", "wiFiManager", "Landroid/net/wifi/WifiManager;", "getWiFiManager", "()Landroid/net/wifi/WifiManager;", "wiFiManagerWrapper", "Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "getWiFiManagerWrapper", "()Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;", "setWiFiManagerWrapper", "(Lcom/vrem/wifianalyzer/wifi/manager/WiFiManagerWrapper;)V", "initialize", "", "activity", "largeScreen", "", "INSTANCE", "app_debug"})
public enum MainContext {
    /*public static final*/ INSTANCE /* = new INSTANCE() */;
    public com.vrem.wifianalyzer.settings.Settings settings;
    public com.vrem.wifianalyzer.MainActivity mainActivity;
    public com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper wiFiManagerWrapper;
    public com.vrem.wifianalyzer.wifi.scanner.ScannerService scannerService;
    public com.vrem.wifianalyzer.vendor.model.VendorService vendorService;
    public com.vrem.wifianalyzer.Configuration configuration;
    public com.vrem.wifianalyzer.wifi.filter.adapter.FiltersAdapter filtersAdapter;
    
    MainContext() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.settings.Settings getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.MainActivity getMainActivity() {
        return null;
    }
    
    public final void setMainActivity(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper getWiFiManagerWrapper() {
        return null;
    }
    
    public final void setWiFiManagerWrapper(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.manager.WiFiManagerWrapper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.scanner.ScannerService getScannerService() {
        return null;
    }
    
    public final void setScannerService(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.ScannerService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.vendor.model.VendorService getVendorService() {
        return null;
    }
    
    public final void setVendorService(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.vendor.model.VendorService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.Configuration getConfiguration() {
        return null;
    }
    
    public final void setConfiguration(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.Configuration p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.filter.adapter.FiltersAdapter getFiltersAdapter() {
        return null;
    }
    
    public final void setFiltersAdapter(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.filter.adapter.FiltersAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.Resources getResources() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.LayoutInflater getLayoutInflater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.permission.PermissionService getPermissionService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.MainActivity getMA() {
        return null;
    }
    
    private final android.net.wifi.WifiManager getWiFiManager() {
        return null;
    }
    
    public final void initialize(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity activity, boolean largeScreen) {
    }
}