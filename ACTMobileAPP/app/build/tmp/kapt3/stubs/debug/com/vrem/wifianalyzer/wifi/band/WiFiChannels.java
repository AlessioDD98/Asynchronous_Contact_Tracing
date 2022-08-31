package com.vrem.wifianalyzer.wifi.band;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB;\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\rH&J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H&J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004J&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tH\u0002J&\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tJ\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0004J(\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\tH&J\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\bJ \u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u0006\u0010\f\u001a\u00020\rH&J\u001e\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t0\u0007H&J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiChannels;", "", "wiFiRange", "Lkotlin/Pair;", "", "Lcom/vrem/wifianalyzer/wifi/band/WiFiRange;", "wiFiChannelPairs", "", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannelPair;", "(Lkotlin/Pair;Ljava/util/List;)V", "availableChannels", "countryCode", "", "channels", "", "channelAvailable", "", "channel", "inRange", "frequency", "transform", "wiFiChannelPair", "wiFiChannel", "wiFiChannelByChannel", "wiFiChannelByFrequency", "wiFiChannelFirst", "wiFiChannelLast", "wiFiChannelPairFirst", "wiFiChannels", "Companion", "app_debug"})
public abstract class WiFiChannels {
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> wiFiRange = null;
    private final java.util.List<kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel>> wiFiChannelPairs = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.band.WiFiChannels.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> UNKNOWN = null;
    public static final int FREQUENCY_SPREAD = 5;
    public static final int CHANNEL_OFFSET = 2;
    public static final int FREQUENCY_OFFSET = 10;
    
    public WiFiChannels(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.Integer, java.lang.Integer> wiFiRange, @org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel>> wiFiChannelPairs) {
        super();
    }
    
    public final boolean inRange(int frequency) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannelByFrequency(int frequency) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannelByChannel(int channel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannelFirst() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannelLast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannel(int frequency, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> availableChannels(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode);
    
    public abstract boolean channelAvailable(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode, int channel);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel>> wiFiChannelPairs();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPairFirst(@org.jetbrains.annotations.NotNull()
    java.lang.String countryCode);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannelByFrequency(int frequency, @org.jetbrains.annotations.NotNull()
    kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair);
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> availableChannels(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Integer> channels) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannels() {
        return null;
    }
    
    private final java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> transform(kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannelPair) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiChannels$Companion;", "", "()V", "CHANNEL_OFFSET", "", "FREQUENCY_OFFSET", "FREQUENCY_SPREAD", "UNKNOWN", "Lkotlin/Pair;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "getUNKNOWN", "()Lkotlin/Pair;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<com.vrem.wifianalyzer.wifi.band.WiFiChannel, com.vrem.wifianalyzer.wifi.band.WiFiChannel> getUNKNOWN() {
            return null;
        }
    }
}