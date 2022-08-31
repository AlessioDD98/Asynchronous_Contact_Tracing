package com.vrem.wifianalyzer.wifi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/Strength;", "", "imageResource", "", "colorResource", "(Ljava/lang/String;III)V", "getColorResource", "()I", "getImageResource", "weak", "", "ZERO", "ONE", "TWO", "THREE", "FOUR", "Companion", "app_debug"})
public enum Strength {
    /*public static final*/ ZERO /* = new ZERO(0, 0) */,
    /*public static final*/ ONE /* = new ONE(0, 0) */,
    /*public static final*/ TWO /* = new TWO(0, 0) */,
    /*public static final*/ THREE /* = new THREE(0, 0) */,
    /*public static final*/ FOUR /* = new FOUR(0, 0) */;
    private final int imageResource = 0;
    private final int colorResource = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.wifi.model.Strength.Companion Companion = null;
    public static final int colorResourceDefault = com.vrem.wifianalyzer.R.color.regular;
    
    Strength(@androidx.annotation.DrawableRes()
    int imageResource, @androidx.annotation.ColorRes()
    int colorResource) {
    }
    
    public final int getImageResource() {
        return 0;
    }
    
    public final int getColorResource() {
        return 0;
    }
    
    public final boolean weak() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/model/Strength$Companion;", "", "()V", "colorResourceDefault", "", "calculate", "Lcom/vrem/wifianalyzer/wifi/model/Strength;", "level", "reverse", "strength", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.Strength calculate(int level) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.vrem.wifianalyzer.wifi.model.Strength reverse(@org.jetbrains.annotations.NotNull()
        com.vrem.wifianalyzer.wifi.model.Strength strength) {
            return null;
        }
    }
}