package com.vrem.wifianalyzer.wifi.timegraph;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J/\u0010\u000b\u001a!\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\fj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0012J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/timegraph/TimeGraphView;", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewNotifier;", "wiFiBand", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "dataManager", "Lcom/vrem/wifianalyzer/wifi/timegraph/DataManager;", "graphViewWrapper", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;", "(Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;Lcom/vrem/wifianalyzer/wifi/timegraph/DataManager;Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewWrapper;)V", "graphView", "Lcom/jjoe64/graphview/GraphView;", "predicate", "Lkotlin/Function1;", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "Lkotlin/ParameterName;", "name", "wiFiDetail", "", "Lcom/vrem/wifianalyzer/wifi/predicate/Predicate;", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "selected", "update", "", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class TimeGraphView implements com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier {
    private final com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand = null;
    private final com.vrem.wifianalyzer.wifi.timegraph.DataManager dataManager = null;
    private final com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper = null;
    
    public TimeGraphView(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.timegraph.DataManager dataManager, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.graphutils.GraphViewWrapper graphViewWrapper) {
        super();
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.Boolean> predicate(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
        return null;
    }
    
    private boolean selected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.jjoe64.graphview.GraphView graphView() {
        return null;
    }
}