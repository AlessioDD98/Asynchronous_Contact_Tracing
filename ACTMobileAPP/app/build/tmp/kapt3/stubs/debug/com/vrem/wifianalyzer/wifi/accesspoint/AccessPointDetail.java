package com.vrem.wifianalyzer.wifi.accesspoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0012\u00a2\u0006\u0002\u0010\nJ8\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001f\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012\u00a2\u0006\u0002\u0010\u001bJ\'\u0010\u001e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0012\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012\u00a2\u0006\u0002\u0010\u001bJ\u001f\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0012\u00a2\u0006\u0002\u0010$J\u001f\u0010%\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0012\u00a2\u0006\u0002\u0010$J\u001f\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\'\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010(\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0012\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0092D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0092D\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointDetail;", "", "()V", "vendorLongMax", "", "vendorShortMax", "enableTextSelection", "", "view", "Landroid/view/View;", "(Landroid/view/View;)Lkotlin/Unit;", "makeView", "convertView", "parent", "Landroid/view/ViewGroup;", "wiFiDetail", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "child", "", "layout", "makeViewDetailed", "setLevelImage", "wiFiSignal", "Lcom/vrem/wifianalyzer/wifi/model/WiFiSignal;", "(Landroid/view/View;Lcom/vrem/wifianalyzer/wifi/model/WiFiSignal;)Lkotlin/Unit;", "setLevelText", "setSecurityImage", "(Landroid/view/View;Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;)Lkotlin/Unit;", "setView80211mc", "setViewCapabilitiesLong", "setViewCompact", "(Landroid/view/View;Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;Z)Lkotlin/Unit;", "setViewExtra", "setViewVendorLong", "wiFiAdditional", "Lcom/vrem/wifianalyzer/wifi/model/WiFiAdditional;", "(Landroid/view/View;Lcom/vrem/wifianalyzer/wifi/model/WiFiAdditional;)Lkotlin/Unit;", "setViewVendorShort", "setViewWiFiBand", "setViewWiFiStandard", "setWiFiStandardImage", "app_debug"})
@com.vrem.annotation.OpenClass()
public class AccessPointDetail {
    private final int vendorShortMax = 12;
    private final int vendorLongMax = 30;
    
    public AccessPointDetail() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.view.View makeView(@org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, boolean child, @androidx.annotation.LayoutRes()
    int layout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.view.View makeViewDetailed(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return null;
    }
    
    private kotlin.Unit enableTextSelection(android.view.View view) {
        return null;
    }
    
    private kotlin.Unit setViewCompact(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, boolean child) {
        return null;
    }
    
    private kotlin.Unit setSecurityImage(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return null;
    }
    
    private kotlin.Unit setViewExtra(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return null;
    }
    
    private kotlin.Unit setWiFiStandardImage(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiSignal wiFiSignal) {
        return null;
    }
    
    private kotlin.Unit setLevelText(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiSignal wiFiSignal) {
        return null;
    }
    
    private kotlin.Unit setLevelImage(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiSignal wiFiSignal) {
        return null;
    }
    
    private kotlin.Unit setViewVendorShort(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiAdditional wiFiAdditional) {
        return null;
    }
    
    private kotlin.Unit setViewCapabilitiesLong(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return null;
    }
    
    private kotlin.Unit setViewVendorLong(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiAdditional wiFiAdditional) {
        return null;
    }
    
    private kotlin.Unit setViewWiFiBand(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiSignal wiFiSignal) {
        return null;
    }
    
    private kotlin.Unit setViewWiFiStandard(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiSignal wiFiSignal) {
        return null;
    }
    
    private kotlin.Unit setView80211mc(android.view.View view, com.vrem.wifianalyzer.wifi.model.WiFiSignal wiFiSignal) {
        return null;
    }
}