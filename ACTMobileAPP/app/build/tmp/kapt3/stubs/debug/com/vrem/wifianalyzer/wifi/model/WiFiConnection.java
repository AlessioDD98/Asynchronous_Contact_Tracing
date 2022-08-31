package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "", "wiFiIdentifier", "Lcom/vrem/wifianalyzer/wifi/model/WiFiIdentifier;", "ipAddress", "", "linkSpeed", "", "(Lcom/vrem/wifianalyzer/wifi/model/WiFiIdentifier;Ljava/lang/String;I)V", "connected", "", "getConnected", "()Z", "getIpAddress", "()Ljava/lang/String;", "getLinkSpeed", "()I", "getWiFiIdentifier", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiIdentifier;", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "hashCode", "toString", "Companion", "app_debug"})
public final class WiFiConnection implements java.lang.Comparable<com.vrem.wifianalyzer.wifi.model.WiFiConnection> {
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.model.WiFiIdentifier wiFiIdentifier = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ipAddress = null;
    private final int linkSpeed = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.WiFiConnection.Companion Companion = null;
    public static final int LINK_SPEED_INVALID = -1;
    @org.jetbrains.annotations.NotNull()
    private static final com.vrem.wifianalyzer.wifi.model.WiFiConnection EMPTY = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiConnection copy(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiIdentifier wiFiIdentifier, @org.jetbrains.annotations.NotNull()
    java.lang.String ipAddress, int linkSpeed) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public WiFiConnection() {
        super();
    }
    
    public WiFiConnection(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiIdentifier wiFiIdentifier, @org.jetbrains.annotations.NotNull()
    java.lang.String ipAddress, int linkSpeed) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiIdentifier component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.model.WiFiIdentifier getWiFiIdentifier() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIpAddress() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getLinkSpeed() {
        return 0;
    }
    
    public final boolean getConnected() {
        return false;
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
    
    @java.lang.Override()
    public int compareTo(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiConnection other) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection$Companion;", "", "()V", "EMPTY", "Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "getEMPTY", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "LINK_SPEED_INVALID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.WiFiConnection getEMPTY() {
            return null;
        }
    }
}