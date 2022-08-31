package com.vrem.wifianalyzer.wifi.accesspoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001e\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0012J \u0010\u0019\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapterGroup;", "", "expanded", "", "", "groupBy", "Lcom/vrem/wifianalyzer/wifi/model/GroupBy;", "(Ljava/util/Set;Lcom/vrem/wifianalyzer/wifi/model/GroupBy;)V", "getExpanded", "()Ljava/util/Set;", "getGroupBy", "()Lcom/vrem/wifianalyzer/wifi/model/GroupBy;", "setGroupBy", "(Lcom/vrem/wifianalyzer/wifi/model/GroupBy;)V", "onGroupCollapsed", "", "wiFiDetails", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "groupPosition", "", "onGroupExpanded", "toggle", "expandableListView", "Landroid/widget/ExpandableListView;", "update", "updateGroupBy", "app_debug"})
@com.vrem.annotation.OpenClass()
public class AccessPointsAdapterGroup {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> expanded = null;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.wifi.model.GroupBy groupBy;
    
    public AccessPointsAdapterGroup() {
        super();
    }
    
    public AccessPointsAdapterGroup(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> expanded, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.GroupBy groupBy) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<java.lang.String> getExpanded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.GroupBy getGroupBy() {
        return null;
    }
    
    public void setGroupBy(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.GroupBy p0) {
    }
    
    public void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, @org.jetbrains.annotations.Nullable()
    android.widget.ExpandableListView expandableListView) {
    }
    
    public void updateGroupBy() {
    }
    
    public void onGroupCollapsed(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, int groupPosition) {
    }
    
    public void onGroupExpanded(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, int groupPosition) {
    }
    
    private void toggle(java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, android.widget.ExpandableListView expandableListView) {
    }
}