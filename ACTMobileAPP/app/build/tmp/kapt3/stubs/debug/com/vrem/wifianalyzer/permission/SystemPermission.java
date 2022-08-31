package com.vrem.wifianalyzer.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0012J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0012J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0013J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0012J\b\u0010\r\u001a\u00020\u0006H\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/permission/SystemPermission;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "enabled", "", "gpsProviderEnabled", "locationManager", "Landroid/location/LocationManager;", "locationEnabled", "locationEnabledAndroidP", "networkProviderEnabled", "providerEnabledAndroidM", "app_debug"})
@com.vrem.annotation.OpenClass()
public class SystemPermission {
    private final android.app.Activity activity = null;
    
    public SystemPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    public boolean enabled() {
        return false;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    private boolean providerEnabledAndroidM() {
        return false;
    }
    
    private boolean gpsProviderEnabled(android.location.LocationManager locationManager) {
        return false;
    }
    
    private boolean networkProviderEnabled(android.location.LocationManager locationManager) {
        return false;
    }
    
    private boolean locationEnabled(android.location.LocationManager locationManager) {
        return false;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.P)
    private boolean locationEnabledAndroidP(android.location.LocationManager locationManager) {
        return false;
    }
}