package com.vrem.wifianalyzer.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/settings/CustomPreference;", "Landroidx/preference/ListPreference;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "values", "", "Lcom/vrem/wifianalyzer/settings/Data;", "defaultValue", "", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/util/List;Ljava/lang/String;)V", "codes", "", "", "data", "(Ljava/util/List;)[Ljava/lang/CharSequence;", "names", "app_debug"})
public abstract class CustomPreference extends androidx.preference.ListPreference {
    
    public CustomPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.settings.Data> values, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        super(null, null, 0, 0);
    }
    
    private final java.lang.CharSequence[] codes(java.util.List<com.vrem.wifianalyzer.settings.Data> data) {
        return null;
    }
    
    private final java.lang.CharSequence[] names(java.util.List<com.vrem.wifianalyzer.settings.Data> data) {
        return null;
    }
}