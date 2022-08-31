package com.vrem.wifianalyzer.wifi.filter.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/filter/adapter/StrengthAdapter;", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/EnumFilterAdapter;", "Lcom/vrem/wifianalyzer/wifi/model/Strength;", "selections", "", "(Ljava/util/Set;)V", "color", "", "selection", "save", "", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "app_debug"})
public class StrengthAdapter extends com.vrem.wifianalyzer.wifi.filter.adapter.EnumFilterAdapter<com.vrem.wifianalyzer.wifi.model.Strength> {
    
    public StrengthAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.vrem.wifianalyzer.wifi.model.Strength> selections) {
        super(null, null);
    }
    
    @java.lang.Override()
    public int color(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.Strength selection) {
        return 0;
    }
    
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
    }
}