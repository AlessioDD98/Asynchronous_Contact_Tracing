package com.vrem.wifianalyzer.navigation.options;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u00a2\u0006\u0002\u0010\bR\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012\u00a8\u0006\u0014"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/options/OptionAction;", "", "key", "", "action", "Lkotlin/Function0;", "", "Lcom/vrem/wifianalyzer/navigation/options/Action;", "(Ljava/lang/String;IILkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getKey", "()I", "NO_ACTION", "SCANNER", "FILTER", "WIFI_BAND_2", "WIFI_BAND_5", "WIFI_BAND_6", "Companion", "app_debug"})
public enum OptionAction {
    /*public static final*/ NO_ACTION /* = new NO_ACTION(0, null) */,
    /*public static final*/ SCANNER /* = new SCANNER(0, null) */,
    /*public static final*/ FILTER /* = new FILTER(0, null) */,
    /*public static final*/ WIFI_BAND_2 /* = new WIFI_BAND_2(0, null) */,
    /*public static final*/ WIFI_BAND_5 /* = new WIFI_BAND_5(0, null) */,
    /*public static final*/ WIFI_BAND_6 /* = new WIFI_BAND_6(0, null) */;
    private final int key = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> action = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.navigation.options.OptionAction.Companion Companion = null;
    
    OptionAction(int key, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public final int getKey() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getAction() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/options/OptionAction$Companion;", "", "()V", "findOptionAction", "Lcom/vrem/wifianalyzer/navigation/options/OptionAction;", "key", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.navigation.options.OptionAction findOptionAction(int key) {
            return null;
        }
    }
}