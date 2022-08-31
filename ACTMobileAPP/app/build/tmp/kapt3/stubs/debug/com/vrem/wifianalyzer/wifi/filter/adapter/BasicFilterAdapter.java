package com.vrem.wifianalyzer.wifi.filter.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001b\u0010\u0003\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/filter/adapter/BasicFilterAdapter;", "T", "", "selections", "", "(Ljava/util/Set;)V", "getSelections", "()Ljava/util/Set;", "setSelections", "isActive", "", "reset", "", "save", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "", "([Ljava/lang/Object;)V", "app_debug"})
@com.vrem.annotation.OpenClass()
public abstract class BasicFilterAdapter<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private java.util.Set<? extends T> selections;
    
    public BasicFilterAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> selections) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<T> getSelections() {
        return null;
    }
    
    public void setSelections(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends T> p0) {
    }
    
    public void selections(@org.jetbrains.annotations.NotNull()
    T[] selections) {
    }
    
    public abstract boolean isActive();
    
    public abstract void reset();
    
    public abstract void save(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings);
}