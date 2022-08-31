package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/SeriesOptions;", "", "graphColors", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphColors;", "(Lcom/vrem/wifianalyzer/wifi/graphutils/GraphColors;)V", "drawBackground", "", "series", "Lcom/jjoe64/graphview/series/BaseSeries;", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;", "", "highlightConnected", "connected", "removeSeriesColor", "setSeriesColor", "app_debug"})
@com.vrem.annotation.OpenClass()
public class SeriesOptions {
    private final com.vrem.wifianalyzer.wifi.graphutils.GraphColors graphColors = null;
    
    public SeriesOptions() {
        super();
    }
    
    public SeriesOptions(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphColors graphColors) {
        super();
    }
    
    public void highlightConnected(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series, boolean connected) {
    }
    
    public void setSeriesColor(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series) {
    }
    
    public void drawBackground(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series, boolean drawBackground) {
    }
    
    public void removeSeriesColor(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series) {
    }
}