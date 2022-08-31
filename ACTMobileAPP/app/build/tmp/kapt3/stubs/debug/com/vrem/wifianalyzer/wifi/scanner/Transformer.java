package com.vrem.wifianalyzer.wifi.scanner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0010\u00a2\u0006\u0002\b\u000bJ\u0019\u0010\f\u001a\u00060\u0006j\u0002`\r2\u0006\u0010\u0007\u001a\u00020\bH\u0010\u00a2\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0010\u00a2\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0010H\u0010\u00a2\u0006\u0002\b\u0013J\r\u0010\u0014\u001a\u00020\u0010H\u0010\u00a2\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0012J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bH\u0010\u00a2\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u001eH\u0010\u00a2\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020!H\u0010\u00a2\u0006\u0002\b\"J\u0019\u0010#\u001a\u00060\u0006j\u0002`$2\u0006\u0010\u0007\u001a\u00020\bH\u0010\u00a2\u0006\u0002\b%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/scanner/Transformer;", "", "cache", "Lcom/vrem/wifianalyzer/wifi/scanner/Cache;", "(Lcom/vrem/wifianalyzer/wifi/scanner/Cache;)V", "centerFrequency", "", "scanResult", "Landroid/net/wifi/ScanResult;", "wiFiWidth", "Lcom/vrem/wifianalyzer/wifi/model/WiFiWidth;", "centerFrequency$app_debug", "channelWidth", "Lcom/vrem/wifianalyzer/wifi/model/ChannelWidth;", "channelWidth$app_debug", "mc80211", "", "mc80211$app_debug", "minVersionM", "minVersionM$app_debug", "minVersionR", "minVersionR$app_debug", "transform", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "cacheResult", "Lcom/vrem/wifianalyzer/wifi/scanner/CacheResult;", "transformCacheResults", "", "transformCacheResults$app_debug", "transformToWiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "transformToWiFiData$app_debug", "transformWifiInfo", "Lcom/vrem/wifianalyzer/wifi/model/WiFiConnection;", "transformWifiInfo$app_debug", "wiFiStandard", "Lcom/vrem/wifianalyzer/wifi/model/WiFiStandardId;", "wiFiStandard$app_debug", "app_debug"})
@com.vrem.annotation.OpenClass()
public class Transformer {
    private final com.vrem.wifianalyzer.wifi.scanner.Cache cache = null;
    
    public Transformer(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.scanner.Cache cache) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiConnection transformWifiInfo$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> transformCacheResults$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.WiFiData transformToWiFiData$app_debug() {
        return null;
    }
    
    public int channelWidth$app_debug(@org.jetbrains.annotations.NotNull()
    android.net.wifi.ScanResult scanResult) {
        return 0;
    }
    
    public int wiFiStandard$app_debug(@org.jetbrains.annotations.NotNull()
    android.net.wifi.ScanResult scanResult) {
        return 0;
    }
    
    public int centerFrequency$app_debug(@org.jetbrains.annotations.NotNull()
    android.net.wifi.ScanResult scanResult, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiWidth wiFiWidth) {
        return 0;
    }
    
    public boolean mc80211$app_debug(@org.jetbrains.annotations.NotNull()
    android.net.wifi.ScanResult scanResult) {
        return false;
    }
    
    public boolean minVersionM$app_debug() {
        return false;
    }
    
    public boolean minVersionR$app_debug() {
        return false;
    }
    
    private com.vrem.wifianalyzer.wifi.model.WiFiDetail transform(com.vrem.wifianalyzer.wifi.scanner.CacheResult cacheResult) {
        return null;
    }
}