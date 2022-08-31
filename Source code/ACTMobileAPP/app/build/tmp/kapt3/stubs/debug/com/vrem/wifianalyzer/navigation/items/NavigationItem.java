package com.vrem.wifianalyzer.navigation.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/items/NavigationItem;", "", "registered", "", "getRegistered", "()Z", "visibility", "", "getVisibility", "()I", "activate", "", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "menuItem", "Landroid/view/MenuItem;", "navigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "app_debug"})
public abstract interface NavigationItem {
    
    public abstract void activate(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu);
    
    public abstract boolean getRegistered();
    
    public abstract int getVisibility();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static boolean getRegistered(@org.jetbrains.annotations.NotNull()
        com.vrem.wifianalyzer.navigation.items.NavigationItem $this) {
            return false;
        }
        
        public static int getVisibility(@org.jetbrains.annotations.NotNull()
        com.vrem.wifianalyzer.navigation.items.NavigationItem $this) {
            return 0;
        }
    }
}