package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/GraphAdapter;", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "graphViewNotifiers", "", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewNotifier;", "(Ljava/util/List;)V", "graphViews", "Lcom/jjoe64/graphview/GraphView;", "update", "", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
public class GraphAdapter implements com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier {
    private final java.util.List<com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier> graphViewNotifiers = null;
    
    public GraphAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier> graphViewNotifiers) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.jjoe64.graphview.GraphView> graphViews() {
        return null;
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier> graphViewNotifiers() {
        return null;
    }
}