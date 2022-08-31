package com.vrem.wifianalyzer.wifi.timegraph;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0016J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/timegraph/DataManager;", "", "timeGraphCache", "Lcom/vrem/wifianalyzer/wifi/timegraph/TimeGraphCache;", "(Lcom/vrem/wifianalyzer/wifi/timegraph/TimeGraphCache;)V", "scanCount", "", "getScanCount", "()I", "setScanCount", "(I)V", "xValue", "getXValue", "setXValue", "addData", "", "graphViewWrapper", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;", "wiFiDetail", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "levelMax", "addSeriesData", "", "wiFiDetails", "", "adjustData", "newSeries", "app_debug"})
@com.vrem.annotation.OpenClass()
public class DataManager {
    private final com.vrem.wifianalyzer.wifi.timegraph.TimeGraphCache timeGraphCache = null;
    private int scanCount = 0;
    private int xValue = 0;
    
    public DataManager() {
        super();
    }
    
    public DataManager(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.timegraph.TimeGraphCache timeGraphCache) {
        super();
    }
    
    public int getScanCount() {
        return 0;
    }
    
    public void setScanCount(int p0) {
    }
    
    public int getXValue() {
        return 0;
    }
    
    public void setXValue(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> addSeriesData(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, int levelMax) {
        return null;
    }
    
    public void adjustData(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper, @org.jetbrains.annotations.NotNull()
    java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> newSeries(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails) {
        return null;
    }
    
    public void addData(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, int levelMax) {
    }
}