package com.vrem.wifianalyzer.wifi.filter.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0010\u00a2\u0006\u0002\b\u0013J\b\u0010\u0014\u001a\u00020\u0012H\u0012J\r\u0010\u0015\u001a\u00020\u0012H\u0010\u00a2\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/filter/adapter/FiltersAdapter;", "", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "(Lcom/vrem/wifianalyzer/settings/Settings;)V", "securityAdapter", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/SecurityAdapter;", "ssidAdapter", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/SSIDAdapter;", "strengthAdapter", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/StrengthAdapter;", "wiFiBandAdapter", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/WiFiBandAdapter;", "filterAdapters", "", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/BasicFilterAdapter;", "Ljava/io/Serializable;", "accessPoints", "", "filterAdapters$app_debug", "isAccessPoints", "isActive", "isActive$app_debug", "reload", "", "reset", "save", "app_debug"})
@com.vrem.annotation.OpenClass()
public class FiltersAdapter {
    private final com.vrem.wifianalyzer.settings.Settings settings = null;
    private com.vrem.wifianalyzer.wifi.filter.adapter.SSIDAdapter ssidAdapter;
    private com.vrem.wifianalyzer.wifi.filter.adapter.WiFiBandAdapter wiFiBandAdapter;
    private com.vrem.wifianalyzer.wifi.filter.adapter.StrengthAdapter strengthAdapter;
    private com.vrem.wifianalyzer.wifi.filter.adapter.SecurityAdapter securityAdapter;
    
    public FiltersAdapter(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
        super();
    }
    
    public void reload() {
    }
    
    public void reset() {
    }
    
    public void save() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.filter.adapter.SSIDAdapter ssidAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.filter.adapter.WiFiBandAdapter wiFiBandAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.filter.adapter.StrengthAdapter strengthAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.filter.adapter.SecurityAdapter securityAdapter() {
        return null;
    }
    
    public boolean isActive$app_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.filter.adapter.BasicFilterAdapter<? extends java.io.Serializable>> filterAdapters$app_debug(boolean accessPoints) {
        return null;
    }
    
    private boolean isAccessPoints() {
        return false;
    }
}