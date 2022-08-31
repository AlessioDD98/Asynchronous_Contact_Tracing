package com.vrem.wifianalyzer.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/permission/ApplicationPermission;", "", "activity", "Landroid/app/Activity;", "permissionDialog", "Lcom/vrem/wifianalyzer/permission/PermissionDialog;", "(Landroid/app/Activity;Lcom/vrem/wifianalyzer/permission/PermissionDialog;)V", "check", "", "granted", "", "requestCode", "", "grantResults", "", "grantedAndroidM", "Companion", "app_debug"})
@com.vrem.annotation.OpenClass()
public class ApplicationPermission {
    private final android.app.Activity activity = null;
    private final com.vrem.wifianalyzer.permission.PermissionDialog permissionDialog = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.permission.ApplicationPermission.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String[] PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
    public static final int REQUEST_CODE = 1;
    
    public ApplicationPermission(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.permission.PermissionDialog permissionDialog) {
        super();
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public void check() {
    }
    
    public boolean granted(int requestCode, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
    
    public boolean granted() {
        return false;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
    private boolean grantedAndroidM() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vrem/wifianalyzer/permission/ApplicationPermission$Companion;", "", "()V", "PERMISSIONS", "", "", "getPERMISSIONS$app_debug", "()[Ljava/lang/String;", "[Ljava/lang/String;", "REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String[] getPERMISSIONS$app_debug() {
            return null;
        }
    }
}