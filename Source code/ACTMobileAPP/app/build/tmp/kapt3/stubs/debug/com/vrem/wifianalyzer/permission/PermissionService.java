package com.vrem.wifianalyzer.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vrem/wifianalyzer/permission/PermissionService;", "", "activity", "Landroid/app/Activity;", "systemPermission", "Lcom/vrem/wifianalyzer/permission/SystemPermission;", "applicationPermission", "Lcom/vrem/wifianalyzer/permission/ApplicationPermission;", "(Landroid/app/Activity;Lcom/vrem/wifianalyzer/permission/SystemPermission;Lcom/vrem/wifianalyzer/permission/ApplicationPermission;)V", "check", "", "enabled", "", "granted", "requestCode", "", "grantResults", "", "permissionGranted", "systemEnabled", "app_debug"})
@com.vrem.annotation.OpenClass()
public class PermissionService {
    private final android.app.Activity activity = null;
    private final com.vrem.wifianalyzer.permission.SystemPermission systemPermission = null;
    private final com.vrem.wifianalyzer.permission.ApplicationPermission applicationPermission = null;
    
    public PermissionService(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.SystemPermission systemPermission, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.ApplicationPermission applicationPermission) {
        super();
    }
    
    public boolean enabled() {
        return false;
    }
    
    public boolean systemEnabled() {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public void check() {
    }
    
    public boolean granted(int requestCode, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
    
    public boolean permissionGranted() {
        return false;
    }
}