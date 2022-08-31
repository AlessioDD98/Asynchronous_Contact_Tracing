package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u0000 :2\u00020\u0001:\u0001:BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010,\u001a\u00020\u0014J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003JE\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u00104\u001a\u00020\t2\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00106\u001a\u00020\u0003H\u0016J\u000e\u00107\u001a\u00020\t2\u0006\u00108\u001a\u00020\u0003J\t\u00109\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000eR\u0011\u0010\u001e\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012R\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006;"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiSignal;", "", "primaryFrequency", "", "centerFrequency", "wiFiWidth", "Lcom/vrem/wifianalyzer/wifi/model/WiFiWidth;", "level", "is80211mc", "", "wiFiStandard", "Lcom/vrem/wifianalyzer/wifi/model/WiFiStandard;", "(IILcom/vrem/wifianalyzer/wifi/model/WiFiWidth;IZLcom/vrem/wifianalyzer/wifi/model/WiFiStandard;)V", "getCenterFrequency", "()I", "centerWiFiChannel", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "getCenterWiFiChannel", "()Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "distance", "", "getDistance", "()Ljava/lang/String;", "frequencyEnd", "getFrequencyEnd", "frequencyStart", "getFrequencyStart", "()Z", "getLevel", "getPrimaryFrequency", "primaryWiFiChannel", "getPrimaryWiFiChannel", "strength", "Lcom/vrem/wifianalyzer/wifi/model/Strength;", "getStrength", "()Lcom/vrem/wifianalyzer/wifi/model/Strength;", "wiFiBand", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "getWiFiBand", "()Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "getWiFiStandard", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiStandard;", "getWiFiWidth", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiWidth;", "channelDisplay", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "inRange", "frequency", "toString", "Companion", "app_debug"})
public final class WiFiSignal {
    private final int primaryFrequency = 0;
    private final int centerFrequency = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.model.WiFiWidth wiFiWidth = null;
    private final int level = 0;
    private final boolean is80211mc = false;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.model.WiFiStandard wiFiStandard = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.WiFiSignal.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FREQUENCY_UNITS = "MHz";
    @org.jetbrains.annotations.NotNull()
    private static final com.vrem.wifianalyzer.wifi.model.WiFiSignal EMPTY = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiSignal copy(int primaryFrequency, int centerFrequency, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiWidth wiFiWidth, int level, boolean is80211mc, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiStandard wiFiStandard) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WiFiSignal() {
        super();
    }
    
    public WiFiSignal(int primaryFrequency, int centerFrequency, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiWidth wiFiWidth, int level, boolean is80211mc, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiStandard wiFiStandard) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getPrimaryFrequency() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCenterFrequency() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiWidth component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiWidth getWiFiWidth() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getLevel() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean is80211mc() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiStandard component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiStandard getWiFiStandard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiBand getWiFiBand() {
        return null;
    }
    
    public final int getFrequencyStart() {
        return 0;
    }
    
    public final int getFrequencyEnd() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel getPrimaryWiFiChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel getCenterWiFiChannel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.Strength getStrength() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistance() {
        return null;
    }
    
    public final boolean inRange(int frequency) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String channelDisplay() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiSignal$Companion;", "", "()V", "EMPTY", "Lcom/vrem/wifianalyzer/wifi/model/WiFiSignal;", "getEMPTY", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiSignal;", "FREQUENCY_UNITS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.WiFiSignal getEMPTY() {
            return null;
        }
    }
}