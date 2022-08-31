package com.vrem.wifianalyzer.wifi.band;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "", "channel", "", "frequency", "(II)V", "getChannel", "()I", "getFrequency", "compareTo", "other", "component1", "component2", "copy", "equals", "", "", "hashCode", "inRange", "value", "toString", "", "Companion", "app_debug"})
public final class WiFiChannel implements java.lang.Comparable<com.vrem.wifianalyzer.wifi.band.WiFiChannel> {
    private final int channel = 0;
    private final int frequency = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.band.WiFiChannel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.vrem.wifianalyzer.wifi.band.WiFiChannel UNKNOWN = null;
    private static final int ALLOWED_RANGE = 2;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.band.WiFiChannel copy(int channel, int frequency) {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WiFiChannel() {
        super();
    }
    
    public WiFiChannel(int channel, int frequency) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getChannel() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getFrequency() {
        return 0;
    }
    
    public final boolean inRange(int value) {
        return false;
    }
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiChannel other) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel$Companion;", "", "()V", "ALLOWED_RANGE", "", "UNKNOWN", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "getUNKNOWN", "()Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.band.WiFiChannel getUNKNOWN() {
            return null;
        }
    }
}