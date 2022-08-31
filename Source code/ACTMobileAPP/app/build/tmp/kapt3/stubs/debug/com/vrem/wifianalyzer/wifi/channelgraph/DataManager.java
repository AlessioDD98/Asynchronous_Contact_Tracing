package com.vrem.wifianalyzer.wifi.channelgraph;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\u0010J4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`\u0016H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/channelgraph/DataManager;", "", "()V", "addSeriesData", "", "graphViewWrapper", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;", "wiFiDetails", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "levelMax", "", "graphDataPoints", "", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;", "wiFiDetail", "(Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;I)[Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;", "newSeries", "", "wiFiChannelPair", "Lkotlin/Pair;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelPair;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class DataManager {
    
    public DataManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> newSeries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint[] graphDataPoints(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, int levelMax) {
        return null;
    }
    
    public void addSeriesData(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper, @org.jetbrains.annotations.NotNull()
    java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, int levelMax) {
    }
}