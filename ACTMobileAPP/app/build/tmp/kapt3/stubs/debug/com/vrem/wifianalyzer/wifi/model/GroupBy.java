package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B=\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\u0004`\t\u00a2\u0006\u0002\u0010\nR\'\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\u0004`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/GroupBy;", "", "sort", "Ljava/util/Comparator;", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "Lkotlin/Comparator;", "group", "Lkotlin/Function1;", "", "Lcom/vrem/wifianalyzer/wifi/model/GroupByKey;", "(Ljava/lang/String;ILjava/util/Comparator;Lkotlin/jvm/functions/Function1;)V", "getGroup", "()Lkotlin/jvm/functions/Function1;", "none", "", "getNone", "()Z", "getSort", "()Ljava/util/Comparator;", "NONE", "SSID", "CHANNEL", "VIRTUAL", "app_debug"})
public enum GroupBy {
    /*public static final*/ NONE /* = new NONE(null, null) */,
    /*public static final*/ SSID /* = new SSID(null, null) */,
    /*public static final*/ CHANNEL /* = new CHANNEL(null, null) */,
    /*public static final*/ VIRTUAL /* = new VIRTUAL(null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Comparator<com.vrem.wifianalyzer.wifi.model.WiFiDetail> sort = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.String> group = null;
    
    GroupBy(java.util.Comparator<com.vrem.wifianalyzer.wifi.model.WiFiDetail> sort, kotlin.jvm.functions.Function1<? super com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.String> group) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Comparator<com.vrem.wifianalyzer.wifi.model.WiFiDetail> getSort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.String> getGroup() {
        return null;
    }
    
    public final boolean getNone() {
        return false;
    }
}