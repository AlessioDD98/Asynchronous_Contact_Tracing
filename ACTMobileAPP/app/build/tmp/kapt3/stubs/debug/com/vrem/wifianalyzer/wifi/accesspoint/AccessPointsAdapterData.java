package com.vrem.wifianalyzer.wifi.accesspoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0012J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0012J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapterData;", "", "accessPointsAdapterGroup", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapterGroup;", "wiFiDetails", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "(Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapterGroup;Ljava/util/List;)V", "getWiFiDetails", "()Ljava/util/List;", "calculateChildType", "", "child", "indexParent", "indexChild", "childrenCount", "index", "onGroupCollapsed", "", "groupPosition", "onGroupExpanded", "parent", "parentsCount", "type", "value", "update", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "expandableListView", "Landroid/widget/ExpandableListView;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class AccessPointsAdapterData {
    private final com.vrem.wifianalyzer.wifi.accesspoint.AccessPointsAdapterGroup accessPointsAdapterGroup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails = null;
    
    public AccessPointsAdapterData() {
        super();
    }
    
    public AccessPointsAdapterData(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.AccessPointsAdapterGroup accessPointsAdapterGroup, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> getWiFiDetails() {
        return null;
    }
    
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData, @org.jetbrains.annotations.Nullable()
    android.widget.ExpandableListView expandableListView) {
    }
    
    public int parentsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiDetail parent(int index) {
        return null;
    }
    
    public int childrenCount(int index) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiDetail child(int indexParent, int indexChild) {
        return null;
    }
    
    public void onGroupCollapsed(int groupPosition) {
    }
    
    public void onGroupExpanded(int groupPosition) {
    }
    
    private int calculateChildType() {
        return 0;
    }
    
    private int type(int value) {
        return 0;
    }
}