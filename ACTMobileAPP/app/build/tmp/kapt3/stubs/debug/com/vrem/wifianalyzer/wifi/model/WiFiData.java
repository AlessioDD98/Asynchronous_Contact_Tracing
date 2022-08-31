package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0012J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0012J*\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0012J=\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032%\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\r0\u0013j\u0002`\u001c2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016JE\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032%\u0010\u0019\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\r0\u0013j\u0002`\u001c2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "", "wiFiDetails", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "wiFiConnection", "Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "(Ljava/util/List;Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;)V", "getWiFiConnection", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "getWiFiDetails", "()Ljava/util/List;", "connected", "", "it", "connection", "copy", "wiFiDetail", "map", "Lkotlin/Function1;", "sortBy", "Lcom/vrem/wifianalyzer/wifi/model/SortBy;", "groupBy", "Lcom/vrem/wifianalyzer/wifi/model/GroupBy;", "transform", "predicate", "Lkotlin/ParameterName;", "name", "Lcom/vrem/wifianalyzer/wifi/predicate/Predicate;", "sortAndGroup", "Companion", "app_debug"})
@com.vrem.annotation.OpenClass()
public class WiFiData {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.wifi.model.WiFiConnection wiFiConnection = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.WiFiData.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.vrem.wifianalyzer.wifi.model.WiFiData EMPTY = null;
    
    public WiFiData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiConnection wiFiConnection) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> getWiFiDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiConnection getWiFiConnection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiDetail connection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.Boolean> predicate, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.SortBy sortBy) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.Boolean> predicate, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.SortBy sortBy, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.GroupBy groupBy) {
        return null;
    }
    
    private java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> sortAndGroup(java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> $this$sortAndGroup, com.vrem.wifianalyzer.wifi.model.SortBy sortBy, com.vrem.wifianalyzer.wifi.model.GroupBy groupBy) {
        return null;
    }
    
    private kotlin.jvm.functions.Function1<java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail>, com.vrem.wifianalyzer.wifi.model.WiFiDetail> map(com.vrem.wifianalyzer.wifi.model.SortBy sortBy, com.vrem.wifianalyzer.wifi.model.GroupBy groupBy) {
        return null;
    }
    
    private com.vrem.wifianalyzer.wifi.model.WiFiDetail transform(com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail, com.vrem.wifianalyzer.wifi.model.WiFiDetail connection) {
        return null;
    }
    
    private boolean connected(com.vrem.wifianalyzer.wifi.model.WiFiDetail it) {
        return false;
    }
    
    private com.vrem.wifianalyzer.wifi.model.WiFiDetail copy(com.vrem.wifianalyzer.wifi.model.WiFiDetail wiFiDetail) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiData$Companion;", "", "()V", "EMPTY", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "getEMPTY", "()Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.WiFiData getEMPTY() {
            return null;
        }
    }
}