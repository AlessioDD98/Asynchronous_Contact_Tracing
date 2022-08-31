package com.vrem.wifianalyzer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/vrem/wifianalyzer/MainReload;", "", "settings", "Lcom/vrem/wifianalyzer/settings/Settings;", "(Lcom/vrem/wifianalyzer/settings/Settings;)V", "<set-?>", "Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionViewType;", "connectionViewType", "getConnectionViewType", "()Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionViewType;", "Ljava/util/Locale;", "languageLocale", "getLanguageLocale", "()Ljava/util/Locale;", "Lcom/vrem/wifianalyzer/settings/ThemeStyle;", "themeStyle", "getThemeStyle", "()Lcom/vrem/wifianalyzer/settings/ThemeStyle;", "connectionViewTypeChanged", "", "languageChanged", "shouldReload", "themeChanged", "app_debug"})
public final class MainReload {
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.settings.ThemeStyle themeStyle;
    @org.jetbrains.annotations.NotNull()
    private com.vrem.wifianalyzer.wifi.accesspoint.ConnectionViewType connectionViewType;
    @org.jetbrains.annotations.NotNull()
    private java.util.Locale languageLocale;
    
    public MainReload(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.settings.ThemeStyle getThemeStyle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.accesspoint.ConnectionViewType getConnectionViewType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale getLanguageLocale() {
        return null;
    }
    
    public final boolean shouldReload(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Settings settings) {
        return false;
    }
    
    private final boolean connectionViewTypeChanged(com.vrem.wifianalyzer.settings.Settings settings) {
        return false;
    }
    
    private final boolean themeChanged(com.vrem.wifianalyzer.settings.Settings settings) {
        return false;
    }
    
    private final boolean languageChanged(com.vrem.wifianalyzer.settings.Settings settings) {
        return false;
    }
}