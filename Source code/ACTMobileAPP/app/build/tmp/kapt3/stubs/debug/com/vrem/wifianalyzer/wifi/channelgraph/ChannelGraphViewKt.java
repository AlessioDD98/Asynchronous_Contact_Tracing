package com.vrem.wifianalyzer.wifi.channelgraph;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0000\u001a(\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u0004*\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u0012H\u0000\u001a$\u0010\u0016\u001a\u00020\u0017*\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010j\u0002`\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0000\u00a8\u0006\u0018"}, d2 = {"makeDefaultSeries", "Lcom/jjoe64/graphview/series/TitleLineGraphSeries;", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphDataPoint;", "frequencyEnd", "", "minX", "makeGraphView", "Lcom/jjoe64/graphview/GraphView;", "mainContext", "Lcom/vrem/wifianalyzer/MainContext;", "graphMaximumY", "themeStyle", "Lcom/vrem/wifianalyzer/settings/ThemeStyle;", "wiFiBand", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "wiFiChannelPair", "Lkotlin/Pair;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelPair;", "makeGraphViewWrapper", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;", "numX", "selected", "", "app_debug"})
public final class ChannelGraphViewKt {
    
    public static final int numX(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> $this$numX) {
        return 0;
    }
    
    public static final boolean selected(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> $this$selected, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.jjoe64.graphview.GraphView makeGraphView(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainContext mainContext, int graphMaximumY, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.ThemeStyle themeStyle, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.jjoe64.graphview.series.TitleLineGraphSeries<com.vrem.wifianalyzer.wifi.graphutils.GraphDataPoint> makeDefaultSeries(int frequencyEnd, int minX) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper makeGraphViewWrapper(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
        return null;
    }
}