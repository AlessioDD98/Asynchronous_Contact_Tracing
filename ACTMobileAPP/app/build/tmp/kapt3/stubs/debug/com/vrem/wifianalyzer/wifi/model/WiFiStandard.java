package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\'\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiStandard;", "", "wiFiStandardId", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiStandardId;", "textResource", "imageResource", "(Ljava/lang/String;IIII)V", "getImageResource", "()I", "getTextResource", "getWiFiStandardId", "UNKNOWN", "LEGACY", "N", "AC", "AX", "Companion", "app_debug"})
public enum WiFiStandard {
    /*public static final*/ UNKNOWN /* = new UNKNOWN(0, 0, 0) */,
    /*public static final*/ LEGACY /* = new LEGACY(0, 0, 0) */,
    /*public static final*/ N /* = new N(0, 0, 0) */,
    /*public static final*/ AC /* = new AC(0, 0, 0) */,
    /*public static final*/ AX /* = new AX(0, 0, 0) */;
    private final int wiFiStandardId = 0;
    private final int textResource = 0;
    private final int imageResource = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.WiFiStandard.Companion Companion = null;
    
    WiFiStandard(int wiFiStandardId, @androidx.annotation.StringRes()
    int textResource, @androidx.annotation.DrawableRes()
    int imageResource) {
    }
    
    public final int getWiFiStandardId() {
        return 0;
    }
    
    public final int getTextResource() {
        return 0;
    }
    
    public final int getImageResource() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiStandard$Companion;", "", "()V", "findOne", "Lcom/vrem/wifianalyzer/wifi/model/WiFiStandard;", "wiFiStandardId", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiStandardId;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.WiFiStandard findOne(int wiFiStandardId) {
            return null;
        }
    }
}