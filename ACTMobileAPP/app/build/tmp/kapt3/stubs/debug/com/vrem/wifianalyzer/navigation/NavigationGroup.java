package com.vrem.wifianalyzer.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/NavigationGroup;", "", "navigationMenus", "", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "(Ljava/lang/String;ILjava/util/List;)V", "getNavigationMenus", "()Ljava/util/List;", "next", "navigationMenu", "populateMenuItems", "", "menu", "Landroid/view/Menu;", "previous", "GROUP_FEATURE", "GROUP_OTHER", "GROUP_SETTINGS", "app_debug"})
public enum NavigationGroup {
    /*public static final*/ GROUP_FEATURE /* = new GROUP_FEATURE(null) */,
    /*public static final*/ GROUP_OTHER /* = new GROUP_OTHER(null) */,
    /*public static final*/ GROUP_SETTINGS /* = new GROUP_SETTINGS(null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.vrem.wifianalyzer.navigation.NavigationMenu> navigationMenus = null;
    
    NavigationGroup(java.util.List<? extends com.vrem.wifianalyzer.navigation.NavigationMenu> navigationMenus) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.vrem.wifianalyzer.navigation.NavigationMenu> getNavigationMenus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.navigation.NavigationMenu next(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.navigation.NavigationMenu previous(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
        return null;
    }
    
    public final void populateMenuItems(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
}