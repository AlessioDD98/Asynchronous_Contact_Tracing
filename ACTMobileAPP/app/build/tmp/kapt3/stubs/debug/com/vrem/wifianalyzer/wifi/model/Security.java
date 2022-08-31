package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/Security;", "", "imageResource", "", "additional", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getAdditional", "()Ljava/lang/String;", "getImageResource", "()I", "NONE", "WPS", "WEP", "WPA", "WPA2", "WPA3", "Companion", "app_debug"})
public enum Security {
    /*public static final*/ NONE /* = new NONE(0, null) */,
    /*public static final*/ WPS /* = new WPS(0, null) */,
    /*public static final*/ WEP /* = new WEP(0, null) */,
    /*public static final*/ WPA /* = new WPA(0, null) */,
    /*public static final*/ WPA2 /* = new WPA2(0, null) */,
    /*public static final*/ WPA3 /* = new WPA3(0, null) */;
    private final int imageResource = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String additional = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.Security.Companion Companion = null;
    private static final kotlin.text.Regex regex = null;
    
    Security(@androidx.annotation.DrawableRes()
    int imageResource, java.lang.String additional) {
    }
    
    public final int getImageResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdditional() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/Security$Companion;", "", "()V", "regex", "Lkotlin/text/Regex;", "findAll", "", "Lcom/vrem/wifianalyzer/wifi/model/Security;", "capabilities", "", "findOne", "parse", "", "transform", "Lkotlin/Function1;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Set<com.vrem.wifianalyzer.wifi.model.Security> findAll(@org.jetbrains.annotations.NotNull()
        java.lang.String capabilities) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.Security findOne(@org.jetbrains.annotations.NotNull()
        java.lang.String capabilities) {
            return null;
        }
        
        private final kotlin.jvm.functions.Function1<java.lang.String, com.vrem.wifianalyzer.wifi.model.Security> transform() {
            return null;
        }
        
        private final java.util.List<java.lang.String> parse(java.lang.String capabilities) {
            return null;
        }
    }
}