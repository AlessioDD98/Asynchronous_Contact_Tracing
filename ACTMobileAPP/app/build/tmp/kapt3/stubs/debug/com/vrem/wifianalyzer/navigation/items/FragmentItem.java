package com.vrem.wifianalyzer.navigation.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/items/FragmentItem;", "Lcom/vrem/wifianalyzer/navigation/items/NavigationItem;", "fragment", "Landroidx/fragment/app/Fragment;", "registered", "", "visibility", "", "(Landroidx/fragment/app/Fragment;ZI)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getRegistered", "()Z", "getVisibility", "()I", "activate", "", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "menuItem", "Landroid/view/MenuItem;", "navigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "startFragment", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "updateMainActivity", "app_debug"})
public final class FragmentItem implements com.vrem.wifianalyzer.navigation.items.NavigationItem {
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.Fragment fragment = null;
    private final boolean registered = false;
    private final int visibility = 0;
    
    public FragmentItem(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, boolean registered, int visibility) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragment() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getRegistered() {
        return false;
    }
    
    @java.lang.Override()
    public int getVisibility() {
        return 0;
    }
    
    @java.lang.Override()
    public void activate(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
    
    private final void startFragment(androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    private final void updateMainActivity(com.vrem.wifianalyzer.MainActivity mainActivity, android.view.MenuItem menuItem, com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
}