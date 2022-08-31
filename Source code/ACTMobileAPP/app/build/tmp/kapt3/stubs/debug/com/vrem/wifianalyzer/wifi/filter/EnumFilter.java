package com.vrem.wifianalyzer.wifi.filter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B1\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00028\u0000H\u0002\u00a2\u0006\u0002\u0010\u001aR\u0010\u0010\t\u001a\u00028\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/filter/EnumFilter;", "T", "", "U", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/EnumFilterAdapter;", "", "ids", "", "", "filter", "alertDialog", "Landroid/app/AlertDialog;", "id", "(Ljava/util/Map;Lcom/vrem/wifianalyzer/wifi/filter/adapter/EnumFilterAdapter;Landroid/app/AlertDialog;I)V", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/EnumFilterAdapter;", "getIds$app_debug", "()Ljava/util/Map;", "onClickListener", "", "value", "view", "Landroid/view/View;", "(Ljava/lang/Enum;Landroid/view/View;)V", "process", "(Landroid/app/AlertDialog;ILjava/lang/Enum;)V", "setColor", "(Landroid/view/View;Ljava/lang/Enum;)V", "app_debug"})
public abstract class EnumFilter<T extends java.lang.Enum<?>, U extends com.vrem.wifianalyzer.wifi.filter.adapter.EnumFilterAdapter<T>> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<T, java.lang.Integer> ids = null;
    private final U filter = null;
    
    public EnumFilter(@org.jetbrains.annotations.NotNull()
    java.util.Map<T, java.lang.Integer> ids, @org.jetbrains.annotations.NotNull()
    U filter, @org.jetbrains.annotations.NotNull()
    android.app.AlertDialog alertDialog, int id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<T, java.lang.Integer> getIds$app_debug() {
        return null;
    }
    
    private final void setColor(android.view.View view, T value) {
    }
    
    private final void process(android.app.AlertDialog alertDialog, int id, T value) {
    }
    
    private final void onClickListener(T value, android.view.View view) {
    }
}