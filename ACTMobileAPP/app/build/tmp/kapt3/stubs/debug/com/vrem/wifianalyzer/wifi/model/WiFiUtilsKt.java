package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0016\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003\u001a\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003\u001a\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003\u001a\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"DISTANCE_MHZ_M", "", "MAX_RSSI", "", "MIN_RSSI", "QUOTE", "", "calculateDistance", "frequency", "level", "calculateSignalLevel", "rssi", "numLevels", "convertIpAddress", "ipAddress", "convertSSID", "ssid", "app_debug"})
public final class WiFiUtilsKt {
    private static final double DISTANCE_MHZ_M = 27.55;
    private static final int MIN_RSSI = -100;
    private static final int MAX_RSSI = -55;
    private static final java.lang.String QUOTE = "\"";
    
    public static final double calculateDistance(int frequency, int level) {
        return 0.0;
    }
    
    public static final int calculateSignalLevel(int rssi, int numLevels) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertSSID(@org.jetbrains.annotations.NotNull()
    java.lang.String ssid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String convertIpAddress(int ipAddress) {
        return null;
    }
}