package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB_\b\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012:\u0010\u0007\u001a6\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bj\u0002`\r\u00a2\u0006\u0002\u0010\u000eRE\u0010\u0007\u001a6\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00030\bj\u0002`\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b\u00a8\u0006\u001d"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiWidth;", "", "channelWidth", "", "Lcom/vrem/wifianalyzer/wifi/model/ChannelWidth;", "frequencyWidth", "guardBand", "calculateCenter", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "primary", "center", "Lcom/vrem/wifianalyzer/wifi/model/CalculateCenter;", "(Ljava/lang/String;IIIILkotlin/jvm/functions/Function2;)V", "getCalculateCenter", "()Lkotlin/jvm/functions/Function2;", "getChannelWidth", "()I", "getFrequencyWidth", "frequencyWidthHalf", "getFrequencyWidthHalf", "getGuardBand", "MHZ_20", "MHZ_40", "MHZ_80", "MHZ_160", "MHZ_80_PLUS", "Companion", "app_debug"})
public enum WiFiWidth {
    /*public static final*/ MHZ_20 /* = new MHZ_20(0, 0, 0, null) */,
    /*public static final*/ MHZ_40 /* = new MHZ_40(0, 0, 0, null) */,
    /*public static final*/ MHZ_80 /* = new MHZ_80(0, 0, 0, null) */,
    /*public static final*/ MHZ_160 /* = new MHZ_160(0, 0, 0, null) */,
    /*public static final*/ MHZ_80_PLUS /* = new MHZ_80_PLUS(0, 0, 0, null) */;
    private final int channelWidth = 0;
    private final int frequencyWidth = 0;
    private final int guardBand = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> calculateCenter = null;
    private final int frequencyWidthHalf = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.WiFiWidth.Companion Companion = null;
    
    WiFiWidth(int channelWidth, int frequencyWidth, int guardBand, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, java.lang.Integer> calculateCenter) {
    }
    
    public final int getChannelWidth() {
        return 0;
    }
    
    public final int getFrequencyWidth() {
        return 0;
    }
    
    public final int getGuardBand() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, java.lang.Integer> getCalculateCenter() {
        return null;
    }
    
    public final int getFrequencyWidthHalf() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u00a8\u0006\b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/WiFiWidth$Companion;", "", "()V", "findOne", "Lcom/vrem/wifianalyzer/wifi/model/WiFiWidth;", "channelWidth", "", "Lcom/vrem/wifianalyzer/wifi/model/ChannelWidth;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.WiFiWidth findOne(int channelWidth) {
            return null;
        }
    }
}