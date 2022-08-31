package com.vrem.wifianalyzer.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 C2\u00020\u0001:\u0001CB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J;\u0010\u0011\u001a\u0002H\u0012\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u0002H\u0012H\u0012\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016JA\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001a\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u0002H\u0012H\u0012\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001aH\u0016J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\bH\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\u0010H\u0016J\u0010\u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020/H\u0016J\u0016\u00100\u001a\u00020\'2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J\u0016\u00101\u001a\u00020\'2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u000204H\u0016J.\u00105\u001a\u00020\'\"\u000e\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0016\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u001aH\u0012J\u0016\u00106\u001a\u00020\'2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020 0\u001aH\u0016J\u0016\u00107\u001a\u00020\'2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\"0\u001aH\u0016J\b\u00108\u001a\u00020\u0010H\u0016J\b\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\"H\u0016J\u0010\u0010@\u001a\u00020\'2\u0006\u0010@\u001a\u00020\"H\u0016J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lcom/vrem/wifianalyzer/settings/Settings;", "", "repository", "Lcom/vrem/wifianalyzer/settings/Repository;", "(Lcom/vrem/wifianalyzer/settings/Repository;)V", "accessPointView", "Lcom/vrem/wifianalyzer/wifi/accesspoint/AccessPointViewType;", "cacheOff", "", "channelGraphLegend", "Lcom/vrem/wifianalyzer/wifi/graphutils/GraphLegend;", "connectionViewType", "Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionViewType;", "countryCode", "", "distance", "", "find", "T", "", "values", "", "key", "defaultValue", "([Ljava/lang/Enum;ILjava/lang/Enum;)Ljava/lang/Enum;", "findSSIDs", "", "findSecurities", "Lcom/vrem/wifianalyzer/wifi/model/Security;", "findSet", "([Ljava/lang/Enum;ILjava/lang/Enum;)Ljava/util/Set;", "findStrengths", "Lcom/vrem/wifianalyzer/wifi/model/Strength;", "findWiFiBands", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "graphMaximumY", "groupBy", "Lcom/vrem/wifianalyzer/wifi/model/GroupBy;", "initializeDefaultValues", "", "keepScreenOn", "languageLocale", "Ljava/util/Locale;", "minVersionQ", "posScanSpeed", "registerOnSharedPreferenceChangeListener", "onSharedPreferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "saveSSIDs", "saveSecurities", "saveSelectedMenu", "navigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "saveSet", "saveStrengths", "saveWiFiBands", "scanSpeed", "selectedMenu", "sortBy", "Lcom/vrem/wifianalyzer/wifi/model/SortBy;", "themeStyle", "Lcom/vrem/wifianalyzer/settings/ThemeStyle;", "timeGraphLegend", "versionP", "wiFiBand", "wiFiOffOnExit", "wiFiThrottleDisabled", "Companion", "app_debug"})
@com.vrem.annotation.OpenClass()
public class Settings {
    private final com.vrem.wifianalyzer.settings.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.settings.Settings.Companion Companion = null;
    private static final int SCAN_SPEED_DEFAULT = 5;
    private static final int GRAPH_Y_MULTIPLIER = -10;
    private static final int GRAPH_Y_DEFAULT = 2;
    private static final int SCAN_POS_SPEED_DEFAULT = 5;
    private static final int DISTANCE_DEFAULT = 30;
    
    public Settings(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.settings.Repository repository) {
        super();
    }
    
    public void initializeDefaultValues() {
    }
    
    public void registerOnSharedPreferenceChangeListener(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
    
    public int scanSpeed() {
        return 0;
    }
    
    public int posScanSpeed() {
        return 0;
    }
    
    public int distance() {
        return 0;
    }
    
    public boolean wiFiThrottleDisabled() {
        return false;
    }
    
    public boolean cacheOff() {
        return false;
    }
    
    public int graphMaximumY() {
        return 0;
    }
    
    public void wiFiBand(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String countryCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Locale languageLocale() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.SortBy sortBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.model.GroupBy groupBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.accesspoint.AccessPointViewType accessPointView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.accesspoint.ConnectionViewType connectionViewType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.graphutils.GraphLegend channelGraphLegend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.graphutils.GraphLegend timeGraphLegend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand() {
        return null;
    }
    
    public boolean wiFiOffOnExit() {
        return false;
    }
    
    public boolean keepScreenOn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.settings.ThemeStyle themeStyle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.navigation.NavigationMenu selectedMenu() {
        return null;
    }
    
    public void saveSelectedMenu(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<java.lang.String> findSSIDs() {
        return null;
    }
    
    public void saveSSIDs(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<com.vrem.wifianalyzer.wifi.band.WiFiBand> findWiFiBands() {
        return null;
    }
    
    public void saveWiFiBands(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.vrem.wifianalyzer.wifi.band.WiFiBand> values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<com.vrem.wifianalyzer.wifi.model.Strength> findStrengths() {
        return null;
    }
    
    public void saveStrengths(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.vrem.wifianalyzer.wifi.model.Strength> values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<com.vrem.wifianalyzer.wifi.model.Security> findSecurities() {
        return null;
    }
    
    public void saveSecurities(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.vrem.wifianalyzer.wifi.model.Security> values) {
    }
    
    private <T extends java.lang.Enum<T>>T find(T[] values, int key, T defaultValue) {
        return null;
    }
    
    private <T extends java.lang.Enum<T>>java.util.Set<T> findSet(T[] values, int key, T defaultValue) {
        return null;
    }
    
    private <T extends java.lang.Enum<T>>void saveSet(int key, java.util.Set<? extends T> values) {
    }
    
    public boolean minVersionQ() {
        return false;
    }
    
    public boolean versionP() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vrem/wifianalyzer/settings/Settings$Companion;", "", "()V", "DISTANCE_DEFAULT", "", "GRAPH_Y_DEFAULT", "GRAPH_Y_MULTIPLIER", "SCAN_POS_SPEED_DEFAULT", "SCAN_SPEED_DEFAULT", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}