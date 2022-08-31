package com.vrem.wifianalyzer.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0005\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0006H&J#\u0010\t\u001a\u0002H\n\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH&\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/NavigationMenuControl;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;", "currentMenuItem", "Landroid/view/MenuItem;", "currentNavigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "", "navigationMenu", "findViewById", "T", "Landroid/view/View;", "id", "", "(I)Landroid/view/View;", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "app_debug"})
public abstract interface NavigationMenuControl extends com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener, com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.view.MenuItem currentMenuItem();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.vrem.wifianalyzer.navigation.NavigationMenu currentNavigationMenu();
    
    public abstract void currentNavigationMenu(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.google.android.material.navigation.NavigationView navigationView();
    
    public abstract <T extends android.view.View>T findViewById(@androidx.annotation.IdRes()
    int id);
}