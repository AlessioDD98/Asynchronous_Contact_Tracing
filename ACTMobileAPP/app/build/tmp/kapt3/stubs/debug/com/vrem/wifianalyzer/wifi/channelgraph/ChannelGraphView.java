package com.vrem.wifianalyzer.wifi.channelgraph;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J/\u0010\u000f\u001a!\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/channelgraph/ChannelGraphView;", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewNotifier;", "wiFiBand", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "wiFiChannelPair", "Lkotlin/Pair;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelPair;", "dataManager", "Lcom/vrem/wifianalyzer/wifi/channelgraph/DataManager;", "graphViewWrapper", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;", "(Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;Lkotlin/Pair;Lcom/vrem/wifianalyzer/wifi/channelgraph/DataManager;Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;)V", "graphView", "Lcom/jjoe64/graphview/GraphView;", "predicate", "Lkotlin/Function1;", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "Lkotlin/ParameterName;", "name", "wiFiDetail", "", "Lcom/vrem/wifianalyzer/wifi/predicate/Predicate;", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "selected", "update", "", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class ChannelGraphView implements com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier {
    private final com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand = null;
    private final kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair = null;
    private com.vrem.wifianalyzer.wifi.channelgraph.DataManager dataManager;
    private com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper;
    
    public ChannelGraphView(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.channelgraph.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper) {
        super();
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    public boolean selected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.Boolean> predicate(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jjoe64.graphview.GraphView graphView() {
        return null;
    }
}