package com.vrem.wifianalyzer.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BN\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012-\b\u0002\u0010\u0007\u001a\'\u0012#\u0012!\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tj\u0002`\u000f0\b\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R6\u0010\u0007\u001a\'\u0012#\u0012!\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tj\u0002`\u000f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012j\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(\u00a8\u0006)"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "", "icon", "", "title", "navigationItem", "Lcom/vrem/wifianalyzer/navigation/items/NavigationItem;", "navigationOptions", "", "Lkotlin/Function1;", "Lcom/vrem/wifianalyzer/MainActivity;", "Lkotlin/ParameterName;", "name", "mainActivity", "", "Lcom/vrem/wifianalyzer/navigation/availability/NavigationOption;", "(Ljava/lang/String;IIILcom/vrem/wifianalyzer/navigation/items/NavigationItem;Ljava/util/List;)V", "getIcon", "()I", "getNavigationItem", "()Lcom/vrem/wifianalyzer/navigation/items/NavigationItem;", "getNavigationOptions", "()Ljava/util/List;", "getTitle", "activateNavigationMenu", "menuItem", "Landroid/view/MenuItem;", "activateOptions", "registered", "", "wiFiBandSwitchable", "ACCESS_POINTS", "CHANNEL_RATING", "CHANNEL_GRAPH", "TIME_GRAPH", "EXPORT", "CHANNEL_AVAILABLE", "VENDORS", "PORT_AUTHORITY", "SETTINGS", "ABOUT", "app_debug"})
public enum NavigationMenu {
    /*public static final*/ ACCESS_POINTS /* = new ACCESS_POINTS(0, 0, null, null) */,
    /*public static final*/ CHANNEL_RATING /* = new CHANNEL_RATING(0, 0, null, null) */,
    /*public static final*/ CHANNEL_GRAPH /* = new CHANNEL_GRAPH(0, 0, null, null) */,
    /*public static final*/ TIME_GRAPH /* = new TIME_GRAPH(0, 0, null, null) */,
    /*public static final*/ EXPORT /* = new EXPORT(0, 0, null, null) */,
    /*public static final*/ CHANNEL_AVAILABLE /* = new CHANNEL_AVAILABLE(0, 0, null, null) */,
    /*public static final*/ VENDORS /* = new VENDORS(0, 0, null, null) */,
    /*public static final*/ PORT_AUTHORITY /* = new PORT_AUTHORITY(0, 0, null, null) */,
    /*public static final*/ SETTINGS /* = new SETTINGS(0, 0, null, null) */,
    /*public static final*/ ABOUT /* = new ABOUT(0, 0, null, null) */;
    private final int icon = 0;
    private final int title = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.vrem.wifianalyzer.navigation.items.NavigationItem navigationItem = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.MainActivity, kotlin.Unit>> navigationOptions = null;
    
    NavigationMenu(int icon, int title, com.vrem.wifianalyzer.navigation.items.NavigationItem navigationItem, java.util.List<? extends kotlin.jvm.functions.Function1<? super com.vrem.wifianalyzer.MainActivity, kotlin.Unit>> navigationOptions) {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final int getTitle() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.navigation.items.NavigationItem getNavigationItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.MainActivity, kotlin.Unit>> getNavigationOptions() {
        return null;
    }
    
    public final void activateNavigationMenu(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
    }
    
    public final void activateOptions(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity) {
    }
    
    public final boolean wiFiBandSwitchable() {
        return false;
    }
    
    public final boolean registered() {
        return false;
    }
}