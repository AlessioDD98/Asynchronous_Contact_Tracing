package com.vrem.wifianalyzer.wifi.graphutils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bJ\f\u0010\u001f\u001a\u00020\u0019*\u00020\u0019H\u0002J\f\u0010 \u001a\u00020\u0019*\u00020\u0019H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/graphutils/GraphViewBuilder;", "", "numHorizontalLabels", "", "maximumY", "themeStyle", "Lcom/vrem/wifianalyzer/settings/ThemeStyle;", "horizontalLabelsVisible", "", "(IILcom/vrem/wifianalyzer/settings/ThemeStyle;Z)V", "horizontalTitle", "", "labelFormatter", "Lcom/jjoe64/graphview/LabelFormatter;", "layoutParams", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "maximumPortY", "getMaximumPortY", "()I", "numVerticalLabels", "getNumVerticalLabels", "verticalTitle", "build", "Lcom/jjoe64/graphview/GraphView;", "context", "Landroid/content/Context;", "setHorizontalTitle", "setLabelFormatter", "setVerticalTitle", "gridLabelInitialize", "viewportInitialize", "app_debug"})
public final class GraphViewBuilder {
    private final int numHorizontalLabels = 0;
    private final int maximumY = 0;
    private final com.vrem.wifianalyzer.settings.ThemeStyle themeStyle = null;
    private final boolean horizontalLabelsVisible = false;
    private com.jjoe64.graphview.LabelFormatter labelFormatter;
    private java.lang.String verticalTitle;
    private java.lang.String horizontalTitle;
    @org.jetbrains.annotations.NotNull()
    private final android.view.ViewGroup.LayoutParams layoutParams = null;
    
    public GraphViewBuilder(int numHorizontalLabels, int maximumY, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.ThemeStyle themeStyle, boolean horizontalLabelsVisible) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.graphutils.GraphViewBuilder setLabelFormatter(@org.jetbrains.annotations.NotNull()
    com.jjoe64.graphview.LabelFormatter labelFormatter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.graphutils.GraphViewBuilder setVerticalTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String verticalTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.graphutils.GraphViewBuilder setHorizontalTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String horizontalTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jjoe64.graphview.GraphView build(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final com.jjoe64.graphview.GraphView viewportInitialize(com.jjoe64.graphview.GraphView $this$viewportInitialize) {
        return null;
    }
    
    private final com.jjoe64.graphview.GraphView gridLabelInitialize(com.jjoe64.graphview.GraphView $this$gridLabelInitialize) {
        return null;
    }
    
    public final int getNumVerticalLabels() {
        return 0;
    }
    
    public final int getMaximumPortY() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.ViewGroup.LayoutParams getLayoutParams() {
        return null;
    }
}