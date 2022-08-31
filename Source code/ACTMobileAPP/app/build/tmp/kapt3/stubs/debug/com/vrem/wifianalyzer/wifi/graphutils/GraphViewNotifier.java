package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewNotifier;", "", "graphView", "Lcom/jjoe64/graphview/GraphView;", "update", "", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
public abstract interface GraphViewNotifier {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.jjoe64.graphview.GraphView graphView();
    
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData);
}