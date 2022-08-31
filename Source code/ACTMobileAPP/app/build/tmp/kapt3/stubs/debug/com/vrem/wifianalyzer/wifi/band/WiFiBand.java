package com.vrem.wifianalyzer.wifi.band;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB+\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u00a2\u0006\u0002\u0010\nR\u001b\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "", "textResource", "", "wiFiChannels", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannels;", "available", "Lkotlin/Function0;", "", "Lcom/vrem/wifianalyzer/wifi/band/Available;", "(Ljava/lang/String;IILcom/vrem/wifianalyzer/wifi/band/WiFiChannels;Lkotlin/jvm/functions/Function0;)V", "getAvailable", "()Lkotlin/jvm/functions/Function0;", "ghz2", "getGhz2", "()Z", "ghz5", "getGhz5", "ghz6", "getGhz6", "getTextResource", "()I", "getWiFiChannels", "()Lcom/vrem/wifianalyzer/wifi/band/WiFiChannels;", "GHZ2", "GHZ5", "GHZ6", "Companion", "app_debug"})
public enum WiFiBand {
    /*public static final*/ GHZ2 /* = new GHZ2(0, null, null) */,
    /*public static final*/ GHZ5 /* = new GHZ5(0, null, null) */,
    /*public static final*/ GHZ6 /* = new GHZ6(0, null, null) */;
    private final int textResource = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.band.WiFiChannels wiFiChannels = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> available = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.band.WiFiBand.Companion Companion = null;
    
    WiFiBand(@androidx.annotation.StringRes()
    int textResource, com.vrem.wifianalyzer.wifi.band.WiFiChannels wiFiChannels, kotlin.jvm.functions.Function0<java.lang.Boolean> available) {
    }
    
    public final int getTextResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannels getWiFiChannels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<java.lang.Boolean> getAvailable() {
        return null;
    }
    
    public final boolean getGhz2() {
        return false;
    }
    
    public final boolean getGhz5() {
        return false;
    }
    
    public final boolean getGhz6() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiBand$Companion;", "", "()V", "find", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "frequency", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.band.WiFiBand find(int frequency) {
            return null;
        }
    }
}