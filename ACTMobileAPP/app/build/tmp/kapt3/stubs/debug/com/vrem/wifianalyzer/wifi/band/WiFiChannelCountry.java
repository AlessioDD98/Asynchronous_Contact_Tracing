package com.vrem.wifianalyzer.wifi.band;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014J\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelCountry;", "", "country", "Ljava/util/Locale;", "(Ljava/util/Locale;)V", "unknown", "", "wiFiChannelGHZ2", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelCountryGHZ2;", "wiFiChannelGHZ5", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelCountryGHZ5;", "wiFiChannelGHZ6", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelCountryGHZ6;", "channelAvailableGHZ2", "", "channel", "", "channelAvailableGHZ5", "channelAvailableGHZ6", "channelsGHZ2", "Ljava/util/SortedSet;", "channelsGHZ5", "channelsGHZ6", "countryCode", "countryName", "currentLocale", "Companion", "app_debug"})
public final class WiFiChannelCountry {
    private final java.util.Locale country = null;
    private final java.lang.String unknown = "-Unknown";
    private final com.vrem.wifianalyzer.wifi.band.WiFiChannelCountryGHZ2 wiFiChannelGHZ2 = null;
    private final com.vrem.wifianalyzer.wifi.band.WiFiChannelCountryGHZ5 wiFiChannelGHZ5 = null;
    private final com.vrem.wifianalyzer.wifi.band.WiFiChannelCountryGHZ6 wiFiChannelGHZ6 = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.band.WiFiChannelCountry.Companion Companion = null;
    
    public WiFiChannelCountry(@org.jetbrains.annotations.NotNull()
    java.util.Locale country) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String countryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String countryName(@org.jetbrains.annotations.NotNull()
    java.util.Locale currentLocale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.SortedSet<java.lang.Integer> channelsGHZ2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.SortedSet<java.lang.Integer> channelsGHZ5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.SortedSet<java.lang.Integer> channelsGHZ6() {
        return null;
    }
    
    public final boolean channelAvailableGHZ2(int channel) {
        return false;
    }
    
    public final boolean channelAvailableGHZ5(int channel) {
        return false;
    }
    
    public final boolean channelAvailableGHZ6(int channel) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u00a8\u0006\t"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelCountry$Companion;", "", "()V", "find", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelCountry;", "countryCode", "", "findAll", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.band.WiFiChannelCountry find(@org.jetbrains.annotations.NotNull()
        java.lang.String countryCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannelCountry> findAll() {
            return null;
        }
    }
}