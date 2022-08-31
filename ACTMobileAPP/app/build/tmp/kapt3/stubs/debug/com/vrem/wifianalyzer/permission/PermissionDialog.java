package com.vrem.wifianalyzer.permission;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0007\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/vrem/wifianalyzer/permission/PermissionDialog;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "show", "", "CancelClick", "OkClick", "app_debug"})
@com.vrem.annotation.OpenClass()
public class PermissionDialog {
    private final android.app.Activity activity = null;
    
    public PermissionDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
    
    public void show() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/vrem/wifianalyzer/permission/PermissionDialog$OkClick;", "Landroid/content/DialogInterface$OnClickListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "backgroundPermission", "", "onClick", "alertDialog", "Landroid/content/DialogInterface;", "which", "", "requestPermissionsAndroidM", "app_debug"})
    public static final class OkClick implements android.content.DialogInterface.OnClickListener {
        private final android.app.Activity activity = null;
        
        public OkClick(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.content.DialogInterface alertDialog, int which) {
        }
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
        public final void backgroundPermission() {
        }
        
        @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.M)
        private final void requestPermissionsAndroidM() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vrem/wifianalyzer/permission/PermissionDialog$CancelClick;", "Landroid/content/DialogInterface$OnClickListener;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "onClick", "", "alertDialog", "Landroid/content/DialogInterface;", "which", "", "app_debug"})
    public static final class CancelClick implements android.content.DialogInterface.OnClickListener {
        private final android.app.Activity activity = null;
        
        public CancelClick(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.content.DialogInterface alertDialog, int which) {
        }
    }
}