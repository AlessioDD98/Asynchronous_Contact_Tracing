package com.vrem.wifianalyzer.wifi.accesspoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionView;", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "accessPointDetail", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointDetail;", "accessPointPopup", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointPopup;", "(Lcom/vrem/wifianalyzer/MainActivity;Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointDetail;Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointPopup;)V", "attachPopup", "", "view", "Landroid/view/View;", "wiFiDetail", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "displayConnection", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "connectionViewType", "Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionViewType;", "displayNoData", "getNoLocationVisibility", "", "visibility", "noData", "", "setViewConnection", "connectionView", "wiFiConnection", "Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "update", "app_debug"})
public final class ConnectionView implements com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier {
    private final com.vrem.wifianalyzer.MainActivity mainActivity = null;
    private final com.vrem.wifianalyzer.wifi.accesspoint.AccessPointDetail accessPointDetail = null;
    private final com.vrem.wifianalyzer.wifi.accesspoint.AccessPointPopup accessPointPopup = null;
    
    public ConnectionView(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.AccessPointDetail accessPointDetail, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.AccessPointPopup accessPointPopup) {
        super();
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    private final void displayNoData(com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    private final int getNoLocationVisibility(int visibility) {
        return 0;
    }
    
    private final boolean noData(com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
        return false;
    }
    
    private final void displayConnection(com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData, com.vrem.wifianalyzer.wifi.accesspoint.ConnectionViewType connectionViewType) {
    }
    
    private final void setViewConnection(android.view.View connectionView, com.vrem.wifianalyzer.wifi.model.WiFiConnection wiFiConnection) {
    }
    
    private final void attachPopup(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
    }
}