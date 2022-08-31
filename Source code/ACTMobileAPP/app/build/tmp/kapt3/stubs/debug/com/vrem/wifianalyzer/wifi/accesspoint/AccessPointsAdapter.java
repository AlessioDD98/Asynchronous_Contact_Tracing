package com.vrem.wifianalyzer.wifi.accesspoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J4\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J,\u0010&\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010(\u001a\u00020\u001eH\u0016J\u0018\u0010)\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020.H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006/"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "accessPointsAdapterData", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapterData;", "accessPointDetail", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointDetail;", "accessPointPopup", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointPopup;", "(Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointsAdapterData;Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointDetail;Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointPopup;)V", "expandableListView", "Landroid/widget/ExpandableListView;", "getExpandableListView", "()Landroid/widget/ExpandableListView;", "setExpandableListView", "(Landroid/widget/ExpandableListView;)V", "attachPopup", "", "view", "Landroid/view/View;", "wiFiDetail", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "getChild", "groupPosition", "", "childPosition", "getChildId", "", "getChildView", "lastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "expanded", "hasStableIds", "isChildSelectable", "onGroupCollapsed", "onGroupExpanded", "update", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class AccessPointsAdapter extends android.widget.BaseExpandableListAdapter implements com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier {
    private final com.vrem.wifianalyzer.wifi.accesspoint.AccessPointsAdapterData accessPointsAdapterData = null;
    private final com.vrem.wifianalyzer.wifi.accesspoint.AccessPointDetail accessPointDetail = null;
    private final com.vrem.wifianalyzer.wifi.accesspoint.AccessPointPopup accessPointPopup = null;
    public android.widget.ExpandableListView expandableListView;
    
    public AccessPointsAdapter() {
        super();
    }
    
    public AccessPointsAdapter(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.AccessPointsAdapterData accessPointsAdapterData, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.AccessPointDetail accessPointDetail, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.AccessPointPopup accessPointPopup) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.widget.ExpandableListView getExpandableListView() {
        return null;
    }
    
    public void setExpandableListView(@org.jetbrains.annotations.NotNull()
    android.widget.ExpandableListView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean expanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean lastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vrem.wifianalyzer.wifi.model.WiFiDetail getGroup(int groupPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vrem.wifianalyzer.wifi.model.WiFiDetail getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    
    @java.lang.Override()
    public void onGroupCollapsed(int groupPosition) {
    }
    
    @java.lang.Override()
    public void onGroupExpanded(int groupPosition) {
    }
    
    private void attachPopup(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
    }
}