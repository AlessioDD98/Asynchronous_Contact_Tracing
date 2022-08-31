package com.vrem.wifianalyzer.wifi.filter.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0012R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/filter/adapter/EnumFilterAdapter;", "T", "", "Lcom/vrem/wifianalyzer/wifi/filter/adapter/BasicFilterAdapter;", "selections", "", "defaults", "", "(Ljava/util/Set;[Ljava/lang/Enum;)V", "getDefaults", "()[Ljava/lang/Enum;", "[Ljava/lang/Enum;", "color", "", "selection", "(Ljava/lang/Enum;)I", "contains", "", "(Ljava/lang/Enum;)Z", "isActive", "reset", "", "toggle", "app_debug"})
public abstract class EnumFilterAdapter<T extends java.lang.Enum<?>> extends com.vrem.wifianalyzer.wifi.filter.adapter.BasicFilterAdapter<T> {
    @org.jetbrains.annotations.NotNull()
    private final T[] defaults = null;
    
    public EnumFilterAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> selections, @org.jetbrains.annotations.NotNull()
    T[] defaults) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public T[] getDefaults() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isActive() {
        return false;
    }
    
    public boolean toggle(@org.jetbrains.annotations.NotNull()
    T selection) {
        return false;
    }
    
    @java.lang.Override()
    public void reset() {
    }
    
    public int color(@org.jetbrains.annotations.NotNull()
    T selection) {
        return 0;
    }
    
    public boolean contains(@org.jetbrains.annotations.NotNull()
    T selection) {
        return false;
    }
}