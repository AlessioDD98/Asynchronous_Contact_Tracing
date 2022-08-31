package com.vrem.wifianalyzer.navigation.items;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/navigation/items/ExportItem;", "Lcom/vrem/wifianalyzer/navigation/items/NavigationItem;", "export", "Lcom/vrem/wifianalyzer/export/Export;", "(Lcom/vrem/wifianalyzer/export/Export;)V", "activate", "", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "menuItem", "Landroid/view/MenuItem;", "navigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "exportAvailable", "", "chooser", "Landroid/content/Intent;", "app_debug"})
public final class ExportItem implements com.vrem.wifianalyzer.navigation.items.NavigationItem {
    private final com.vrem.wifianalyzer.export.Export export = null;
    
    public ExportItem(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.export.Export export) {
        super();
    }
    
    @java.lang.Override()
    public void activate(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
    
    private final boolean exportAvailable(com.vrem.wifianalyzer.MainActivity mainActivity, android.content.Intent chooser) {
        return false;
    }
    
    public boolean getRegistered() {
        return false;
    }
    
    public int getVisibility() {
        return 0;
    }
}