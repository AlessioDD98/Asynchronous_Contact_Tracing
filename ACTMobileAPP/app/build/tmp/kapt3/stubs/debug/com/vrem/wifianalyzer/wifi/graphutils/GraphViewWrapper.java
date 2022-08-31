package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J&\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J(\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\b\u0010#\u001a\u00020\u0014H\u0016J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010*\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020,0+H\u0012J\u0016\u0010-\u001a\u00020\u00182\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\'H\u0016J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0012J\u0010\u0010/\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0012J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u001cH\u0016J\b\u00102\u001a\u00020\u0018H\u0016J\u0018\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u0014H\u0016J\u0010\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0014H\u0016J\u0010\u00107\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J+\u00108\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b092\u0006\u0010\u001f\u001a\u00020\u001cH\u0016\u00a2\u0006\u0002\u0010:J\u0010\u0010;\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006<"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;", "", "graphView", "Lcom/jjoe64/graphview/GraphView;", "graphLegend", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphLegend;", "themeStyle", "Lcom/vrem/wifianalyzer/settings/ThemeStyle;", "seriesCache", "Lcom/vrem/wifianalyzer/wifi/graphutils/SeriesCache;", "seriesOptions", "Lcom/vrem/wifianalyzer/wifi/graphutils/SeriesOptions;", "(Lcom/jjoe64/graphview/GraphView;Lcom/vrem/wifianalyzer/wifi/graphutils/GraphLegend;Lcom/vrem/wifianalyzer/settings/ThemeStyle;Lcom/vrem/wifianalyzer/wifi/graphutils/SeriesCache;Lcom/vrem/wifianalyzer/wifi/graphutils/SeriesOptions;)V", "getGraphLegend", "()Lcom/vrem/wifianalyzer/wifi/graphutils/GraphLegend;", "setGraphLegend", "(Lcom/vrem/wifianalyzer/wifi/graphutils/GraphLegend;)V", "getGraphView", "()Lcom/jjoe64/graphview/GraphView;", "viewportCntX", "", "getViewportCntX", "()I", "addSeries", "", "series", "Lcom/jjoe64/graphview/series/BaseSeries;", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;", "", "wiFiDetail", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "drawBackground", "appendToSeries", "data", "count", "calculateGraphType", "differenceSeries", "", "newSeries", "", "newLegendRenderer", "Lcom/jjoe64/graphview/LegendRenderer;", "popup", "Lcom/jjoe64/graphview/series/Series;", "Lcom/jjoe64/graphview/series/DataPointInterface;", "removeSeries", "resetLegendRenderer", "seriesExists", "setHorizontalLabelsVisible", "horizontalLabelsVisible", "setViewport", "minX", "maxX", "size", "value", "updateLegend", "updateSeries", "", "(Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;[Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;Z)Z", "visibility", "app_debug"})
@com.vrem.annotation.OpenClass()
public class GraphViewWrapper {
    @org.jetbrains.annotations.NotNull()
    private final com.jjoe64.graphview.GraphView graphView = null;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.wifi.graphutils.GraphLegend graphLegend;
    private final com.vrem.wifianalyzer.settings.ThemeStyle themeStyle = null;
    private final com.vrem.wifianalyzer.wifi.graphutils.SeriesCache seriesCache = null;
    private final com.vrem.wifianalyzer.wifi.graphutils.SeriesOptions seriesOptions = null;
    
    public GraphViewWrapper(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.GraphView graphView, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphLegend graphLegend, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.ThemeStyle themeStyle, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.SeriesCache seriesCache, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.SeriesOptions seriesOptions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.jjoe64.graphview.GraphView getGraphView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.graphutils.GraphLegend getGraphLegend() {
        return null;
    }
    
    public void setGraphLegend(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphLegend p0) {
    }
    
    public void removeSeries(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> newSeries) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> differenceSeries(@org.jetbrains.annotations.NotNull()
    java.util.Set<com.vrem.wifianalyzer.wifi.model.WiFiDetail> newSeries) {
        return null;
    }
    
    public boolean addSeries(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, @org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series, boolean drawBackground) {
        return false;
    }
    
    public boolean updateSeries(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint[] data, boolean drawBackground) {
        return false;
    }
    
    public boolean appendToSeries(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint data, int count, boolean drawBackground) {
        return false;
    }
    
    public boolean newSeries(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return false;
    }
    
    public void setViewport() {
    }
    
    public void setViewport(int minX, int maxX) {
    }
    
    public int getViewportCntX() {
        return 0;
    }
    
    public void addSeries(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.series.BaseSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> series) {
    }
    
    public void updateLegend(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphLegend graphLegend) {
    }
    
    public int calculateGraphType() {
        return 0;
    }
    
    public void setHorizontalLabelsVisible(boolean horizontalLabelsVisible) {
    }
    
    public void visibility(int visibility) {
    }
    
    public int size(int value) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.jjoe64.graphview.LegendRenderer newLegendRenderer() {
        return null;
    }
    
    private void resetLegendRenderer(com.vrem.wifianalyzer.wifi.graphutils.GraphLegend graphLegend) {
    }
    
    private boolean seriesExists(com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return false;
    }
    
    private void popup(com.jjoe64.graphview.series.Series<com.jjoe64.graphview.series.DataPointInterface> series) {
    }
}