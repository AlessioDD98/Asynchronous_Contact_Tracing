package com.vrem.wifianalyzer.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0012R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0092.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/NavigationMenuController;", "", "navigationMenuControl", "Lcom/vrem/wifianalyzer/navigation/NavigationMenuControl;", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "bottomNavigationView", "Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "(Lcom/vrem/wifianalyzer/navigation/NavigationMenuControl;Lcom/google/android/material/navigation/NavigationView;Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V", "getBottomNavigationView", "()Lcom/google/android/material/bottomnavigation/BottomNavigationView;", "currentNavigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "getNavigationView", "()Lcom/google/android/material/navigation/NavigationView;", "currentMenuItem", "Landroid/view/MenuItem;", "", "navigationMenu", "selectCurrentMenuItem", "menu", "Landroid/view/Menu;", "app_debug"})
@com.vrem.annotation.OpenClass()
public class NavigationMenuController {
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.navigation.NavigationView navigationView = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView = null;
    private com.vrem.wifianalyzer.navigation.NavigationMenu currentNavigationMenu;
    
    public NavigationMenuController(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenuControl navigationMenuControl, @org.jetbrains.annotations.NotNull()
    com.google.android.material.navigation.NavigationView navigationView, @org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomnavigation.BottomNavigationView bottomNavigationView) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.navigation.NavigationView getNavigationView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.google.android.material.bottomnavigation.BottomNavigationView getBottomNavigationView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.view.MenuItem currentMenuItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.navigation.NavigationMenu currentNavigationMenu() {
        return null;
    }
    
    public void currentNavigationMenu(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
    
    private void selectCurrentMenuItem(com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu, android.view.Menu menu) {
    }
}