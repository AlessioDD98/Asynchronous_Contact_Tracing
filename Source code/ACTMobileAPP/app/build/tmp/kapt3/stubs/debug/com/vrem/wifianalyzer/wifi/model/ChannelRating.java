package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0012J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0012J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0016\u0010\u0003\u001a\u00020\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/ChannelRating;", "", "()V", "wiFiDetails", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "bestChannel", "", "it", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "bestChannels", "", "Lcom/vrem/wifianalyzer/wifi/model/ChannelAPCount;", "wiFiChannels", "collectOverlapping", "wiFiChannel", "count", "", "removeSame", "strength", "Lcom/vrem/wifianalyzer/wifi/model/Strength;", "", "app_debug"})
@com.vrem.annotation.OpenClass()
public class ChannelRating {
    private final java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails = null;
    
    public ChannelRating() {
        super();
    }
    
    public int count(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannel) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.Strength strength(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails() {
        return null;
    }
    
    public void wiFiDetails(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.ChannelAPCount> bestChannels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannels) {
        return null;
    }
    
    private java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> removeSame(java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails) {
        return null;
    }
    
    private java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> collectOverlapping(com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannel) {
        return null;
    }
    
    private boolean bestChannel(com.vrem.wifianalyzer.wifi.band.WiFiChannel it) {
        return false;
    }
}