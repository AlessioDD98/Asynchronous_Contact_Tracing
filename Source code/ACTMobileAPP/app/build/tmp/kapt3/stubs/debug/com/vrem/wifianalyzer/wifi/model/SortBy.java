package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\u0002\u0010\u0006R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/SortBy;", "", "sort", "Ljava/util/Comparator;", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "Lkotlin/Comparator;", "(Ljava/lang/String;ILjava/util/Comparator;)V", "getSort", "()Ljava/util/Comparator;", "STRENGTH", "SSID", "CHANNEL", "app_debug"})
public enum SortBy {
    /*public static final*/ STRENGTH /* = new STRENGTH(null) */,
    /*public static final*/ SSID /* = new SSID(null) */,
    /*public static final*/ CHANNEL /* = new CHANNEL(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Comparator<com.vrem.wifianalyzer.wifi.model.WiFiDetail> sort = null;
    
    SortBy(java.util.Comparator<com.vrem.wifianalyzer.wifi.model.WiFiDetail> sort) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.vrem.wifianalyzer.wifi.model.WiFiDetail> getSort() {
        return null;
    }
}