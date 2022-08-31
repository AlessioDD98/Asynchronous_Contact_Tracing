package com.vrem.wifianalyzer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001gB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u00020\u0018H\u0016J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020;H\u0016J\u0010\u0010:\u001a\u0002042\u0006\u0010<\u001a\u00020;H\u0016J\b\u0010=\u001a\u000204H\u0016J\u0010\u0010>\u001a\u0002042\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010A\u001a\u00020BH\u0016J\b\u0010C\u001a\u000204H\u0016J\u0010\u0010D\u001a\u0002042\u0006\u0010E\u001a\u00020FH\u0016J\u0012\u0010G\u001a\u0002042\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\u0010\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u000204H\u0016J\u0010\u0010N\u001a\u00020\u00182\u0006\u0010O\u001a\u000209H\u0016J\u0010\u0010P\u001a\u00020\u00182\u0006\u0010Q\u001a\u000209H\u0016J\b\u0010R\u001a\u000204H\u0016J\u0012\u0010S\u001a\u0002042\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J+\u0010T\u001a\u0002042\u0006\u0010U\u001a\u00020@2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\f0W2\u0006\u0010X\u001a\u00020YH\u0016\u00a2\u0006\u0002\u0010ZJ\b\u0010[\u001a\u000204H\u0016J\u0018\u0010\\\u001a\u0002042\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\fH\u0016J\b\u0010`\u001a\u000204H\u0016J\b\u0010a\u001a\u000204H\u0016J\u0010\u0010b\u001a\u0002042\u0006\u0010c\u001a\u00020dH\u0012J\b\u0010e\u001a\u000204H\u0016J\b\u0010f\u001a\u000204H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0090.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0090.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188RX\u0092\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0090.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0090.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0090.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0090.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u0006h"}, d2 = {"Lcom/vrem/wifianalyzer/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/vrem/wifianalyzer/navigation/NavigationMenuControl;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "()V", "connectionView", "Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionView;", "getConnectionView$app_debug", "()Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionView;", "setConnectionView$app_debug", "(Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionView;)V", "currentCountryCode", "", "getCurrentCountryCode", "()Ljava/lang/String;", "setCurrentCountryCode", "(Ljava/lang/String;)V", "drawerNavigation", "Lcom/vrem/wifianalyzer/DrawerNavigation;", "getDrawerNavigation$app_debug", "()Lcom/vrem/wifianalyzer/DrawerNavigation;", "setDrawerNavigation$app_debug", "(Lcom/vrem/wifianalyzer/DrawerNavigation;)V", "largeScreen", "", "getLargeScreen", "()Z", "mainReload", "Lcom/vrem/wifianalyzer/MainReload;", "getMainReload$app_debug", "()Lcom/vrem/wifianalyzer/MainReload;", "setMainReload$app_debug", "(Lcom/vrem/wifianalyzer/MainReload;)V", "navigationMenuController", "Lcom/vrem/wifianalyzer/navigation/NavigationMenuController;", "getNavigationMenuController$app_debug", "()Lcom/vrem/wifianalyzer/navigation/NavigationMenuController;", "setNavigationMenuController$app_debug", "(Lcom/vrem/wifianalyzer/navigation/NavigationMenuController;)V", "optionMenu", "Lcom/vrem/wifianalyzer/navigation/options/OptionMenu;", "getOptionMenu$app_debug", "()Lcom/vrem/wifianalyzer/navigation/options/OptionMenu;", "setOptionMenu$app_debug", "(Lcom/vrem/wifianalyzer/navigation/options/OptionMenu;)V", "permissionService", "Lcom/vrem/wifianalyzer/permission/PermissionService;", "getPermissionService$app_debug", "()Lcom/vrem/wifianalyzer/permission/PermissionService;", "setPermissionService$app_debug", "(Lcom/vrem/wifianalyzer/permission/PermissionService;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "closeDrawer", "currentMenuItem", "Landroid/view/MenuItem;", "currentNavigationMenu", "Lcom/vrem/wifianalyzer/navigation/NavigationMenu;", "navigationMenu", "exportCSV", "mainConnectionVisibility", "visibility", "", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "onBackPressed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onNavigationItemSelected", "menuItem", "onOptionsItemSelected", "item", "onPause", "onPostCreate", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSharedPreferenceChanged", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "onStart", "onStop", "setWiFiChannelPairs", "mainContext", "Lcom/vrem/wifianalyzer/MainContext;", "update", "updateActionBar", "getAllNetworks", "app_debug"})
@com.vrem.annotation.OpenClass()
public class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.vrem.wifianalyzer.navigation.NavigationMenuControl, android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public com.vrem.wifianalyzer.DrawerNavigation drawerNavigation;
    public com.vrem.wifianalyzer.MainReload mainReload;
    public com.vrem.wifianalyzer.navigation.NavigationMenuController navigationMenuController;
    public com.vrem.wifianalyzer.navigation.options.OptionMenu optionMenu;
    public com.vrem.wifianalyzer.permission.PermissionService permissionService;
    public com.vrem.wifianalyzer.wifi.accesspoint.ConnectionView connectionView;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currentCountryCode;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.DrawerNavigation getDrawerNavigation$app_debug() {
        return null;
    }
    
    public void setDrawerNavigation$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.DrawerNavigation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.MainReload getMainReload$app_debug() {
        return null;
    }
    
    public void setMainReload$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainReload p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.navigation.NavigationMenuController getNavigationMenuController$app_debug() {
        return null;
    }
    
    public void setNavigationMenuController$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenuController p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.navigation.options.OptionMenu getOptionMenu$app_debug() {
        return null;
    }
    
    public void setOptionMenu$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.options.OptionMenu p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.permission.PermissionService getPermissionService$app_debug() {
        return null;
    }
    
    public void setPermissionService$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.PermissionService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.vrem.wifianalyzer.wifi.accesspoint.ConnectionView getConnectionView$app_debug() {
        return null;
    }
    
    public void setConnectionView$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.accesspoint.ConnectionView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getCurrentCountryCode() {
        return null;
    }
    
    public void setCurrentCountryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void exportCSV() {
    }
    
    @java.lang.Override()
    public void onPostCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private void setWiFiChannelPairs(com.vrem.wifianalyzer.MainContext mainContext) {
    }
    
    private boolean getLargeScreen() {
        return false;
    }
    
    @java.lang.Override()
    public void onSharedPreferenceChanged(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public void update() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    public boolean closeDrawer() {
        return false;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public void updateActionBar() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.MenuItem currentMenuItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.vrem.wifianalyzer.navigation.NavigationMenu currentNavigationMenu() {
        return null;
    }
    
    @java.lang.Override()
    public void currentNavigationMenu(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.navigation.NavigationMenu navigationMenu) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.android.material.navigation.NavigationView navigationView() {
        return null;
    }
    
    public void mainConnectionVisibility(int visibility) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J-\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/MainActivity$getAllNetworks;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lcom/vrem/wifianalyzer/wifi/database/Network;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "doInBackground", "p0", "", "([Ljava/lang/Void;)Ljava/util/List;", "app_debug"})
    public static final class getAllNetworks extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.List<? extends com.vrem.wifianalyzer.wifi.database.Network>> {
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application application = null;
        
        public getAllNetworks(@org.jetbrains.annotations.NotNull()
        android.app.Application application) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApplication() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.util.List<com.vrem.wifianalyzer.wifi.database.Network> doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... p0) {
            return null;
        }
    }
}