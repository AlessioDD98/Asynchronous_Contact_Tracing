package com.vrem.wifianalyzer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J(\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00112\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012j\u0002`\u0014H\u0016J\u0010\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R&\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/vrem/wifianalyzer/Configuration;", "", "largeScreen", "", "(Z)V", "getLargeScreen", "()Z", "size", "", "getSize", "()I", "setSize", "(I)V", "sizeAvailable", "getSizeAvailable", "wiFiChannelPair", "", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "Lkotlin/Pair;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelPair;", "wiFiBand", "", "countryCode", "", "app_debug"})
@com.vrem.annotation.OpenClass()
public class Configuration {
    private final boolean largeScreen = false;
    private java.util.Map<com.vrem.wifianalyzer.wifi.band.WiFiBand, kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel>> wiFiChannelPair;
    private int size = 4096;
    
    public Configuration(boolean largeScreen) {
        super();
    }
    
    public boolean getLargeScreen() {
        return false;
    }
    
    public int getSize() {
        return 0;
    }
    
    public void setSize(int p0) {
    }
    
    public boolean getSizeAvailable() {
        return false;
    }
    
    public void wiFiChannelPair(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand) {
        return null;
    }
    
    public void wiFiChannelPair(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
    }
}