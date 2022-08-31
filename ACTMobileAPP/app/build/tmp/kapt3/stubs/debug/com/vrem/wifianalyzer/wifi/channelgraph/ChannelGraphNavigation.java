package com.vrem.wifianalyzer.wifi.channelgraph;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006JP\u0010\u0007\u001a\u00020\b2&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e0\nj\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0012J@\u0010\u0013\u001a2\u0012\u0004\u0012\u00020\u000b\u0012$\u0012\"\u0012\u0004\u0012\u00020\u000b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000e0\nj\u0002`\u000f0\nj\u0002`\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0012J-\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fj\u0002`\u000eH\u0010\u00a2\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\bH\u0010\u00a2\u0006\u0002\b\u0019J\u001c\u0010\u001a\u001a\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/channelgraph/ChannelGraphNavigation;", "", "view", "Landroid/view/View;", "mainContext", "Landroid/content/Context;", "(Landroid/view/View;Landroid/content/Context;)V", "buttons", "", "navigationSets", "", "", "Lkotlin/Pair;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelPair;", "Lcom/vrem/wifianalyzer/wifi/channelgraph/NavigationSets;", "wiFiBand", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "selectedWiFiChannelPair", "navigationLines", "Lcom/vrem/wifianalyzer/wifi/channelgraph/NavigationLines;", "onClickListener", "wiFiChannelPair", "onClickListener$app_debug", "update", "update$app_debug", "visibility", "map", "app_debug"})
@com.vrem.annotation.OpenClass()
public class ChannelGraphNavigation {
    private final android.view.View view = null;
    private final android.content.Context mainContext = null;
    
    public ChannelGraphNavigation(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.content.Context mainContext) {
        super();
    }
    
    public void update$app_debug() {
    }
    
    private void buttons(java.util.Map<java.lang.Integer, kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel>> navigationSets, com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> selectedWiFiChannelPair) {
    }
    
    private int visibility(java.util.Map<java.lang.Integer, ? extends java.lang.Object> map) {
        return 0;
    }
    
    public void onClickListener$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
    }
    
    private java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel>>> navigationLines(com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand) {
        return null;
    }
}