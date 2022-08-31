package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B.\b\u0002\u0012%\u0010\u0002\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R0\u0010\u0002\u001a!\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/GraphLegend;", "", "legendDisplay", "Lkotlin/Function1;", "Lcom/jjoe64/graphview/LegendRenderer;", "Lkotlin/ParameterName;", "name", "legendRenderer", "", "Lcom/vrem/wifianalyzer/wifi/graphutils/LegendDisplay;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "getLegendDisplay", "()Lkotlin/jvm/functions/Function1;", "display", "LEFT", "RIGHT", "HIDE", "app_debug"})
public enum GraphLegend {
    /*public static final*/ LEFT /* = new LEFT(null) */,
    /*public static final*/ RIGHT /* = new RIGHT(null) */,
    /*public static final*/ HIDE /* = new HIDE(null) */;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.jjoe64.graphview.LegendRenderer, kotlin.Unit> legendDisplay = null;
    
    GraphLegend(kotlin.jvm.functions.Function1<? super com.jjoe64.graphview.LegendRenderer, kotlin.Unit> legendDisplay) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.jjoe64.graphview.LegendRenderer, kotlin.Unit> getLegendDisplay() {
        return null;
    }
    
    public final void display(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.LegendRenderer legendRenderer) {
    }
}