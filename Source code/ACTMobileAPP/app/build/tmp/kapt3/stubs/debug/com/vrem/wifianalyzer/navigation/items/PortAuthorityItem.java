package com.vrem.wifianalyzer.navigation.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0011\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/items/PortAuthorityItem;", "Lcom/vrem/wifianalyzer/navigation/items/NavigationItem;", "()V", "activate", "", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "menuItem", "Landroid/view/MenuItem;", "navigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "redirectToPlayStore", "Landroid/content/Intent;", "Companion", "app_debug"})
@com.vrem.annotation.OpenClass()
public class PortAuthorityItem implements com.vrem.wifianalyzer.navigation.items.NavigationItem {
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.navigation.items.PortAuthorityItem.Companion Companion = null;
    private static final java.lang.String PORT_AUTHORITY = "com.aaronjwood.portauthority.";
    private static final java.lang.String PORT_AUTHORITY_FREE = "com.aaronjwood.portauthority.free";
    private static final java.lang.String PORT_AUTHORITY_DONATE = "com.aaronjwood.portauthority.donate";
    
    public PortAuthorityItem() {
        super();
    }
    
    @java.lang.Override()
    public void activate(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.content.Intent redirectToPlayStore() {
        return null;
    }
    
    public boolean getRegistered() {
        return false;
    }
    
    public int getVisibility() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/items/PortAuthorityItem$Companion;", "", "()V", "PORT_AUTHORITY", "", "PORT_AUTHORITY_DONATE", "PORT_AUTHORITY_FREE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}