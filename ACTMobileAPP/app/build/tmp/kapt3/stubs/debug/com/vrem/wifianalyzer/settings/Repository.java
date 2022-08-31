package com.vrem.wifianalyzer.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J \u0010\f\u001a\u00020\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bJ\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bJ\b\u0010\u001c\u001a\u00020\u000bH\u0002J\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/vrem/wifianalyzer/settings/Repository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "boolean", "", "key", "", "defaultValue", "defaultSharedPreferences", "Landroid/content/SharedPreferences;", "defaultValues", "", "resId", "readAgain", "initializeDefaultValues", "integer", "registerOnSharedPreferenceChangeListener", "onSharedPreferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "resourceBoolean", "save", "value", "", "saveStringSet", "values", "", "sharedPreferences", "string", "stringAsInteger", "stringSet", "app_debug"})
public final class Repository {
    private final android.content.Context context = null;
    
    public Repository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void initializeDefaultValues() {
    }
    
    public final void registerOnSharedPreferenceChangeListener(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
    
    public final void save(int key, int value) {
    }
    
    public final void save(int key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final int stringAsInteger(int key, int defaultValue) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String string(int key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final boolean resourceBoolean(int key) {
        return false;
    }
    
    public final int integer(int key, int defaultValue) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> stringSet(int key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defaultValues) {
        return null;
    }
    
    public final void saveStringSet(int key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> values) {
    }
    
    public final void defaultValues(@org.jetbrains.annotations.Nullable()
    android.content.Context context, int resId, boolean readAgain) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences defaultSharedPreferences(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    private final android.content.SharedPreferences sharedPreferences() {
        return null;
    }
}