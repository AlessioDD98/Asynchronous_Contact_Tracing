package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\u0014\u0010\u000f\u001a\u00020\u00052\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002J&\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/SeriesCache;", "", "()V", "cache", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "Lcom/jjoe64/graphview/series/BaseSeries;", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;", "contains", "", "wiFiDetail", "difference", "", "series", "", "find", "Lcom/jjoe64/graphview/series/Series;", "get", "put", "remove", "app_debug"})
@com.vrem.annotation.OpenClass()
public class SeriesCache {
    private final java.util.Map<com.vrem.wifianalyzer.wifi.model.WiFiDetail, com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint>> cache = null;
    
    public SeriesCache() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> difference(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> series) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint>> remove(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> series) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiDetail find(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.Series<?> series) {
        return null;
    }
    
    public boolean contains(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> get(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> put(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, @org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series) {
        return null;
    }
}