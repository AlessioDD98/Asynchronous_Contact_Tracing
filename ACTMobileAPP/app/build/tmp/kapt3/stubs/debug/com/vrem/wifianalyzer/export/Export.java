package com.vrem.wifianalyzer.export;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\fJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0011\u001a\u00020\u0012J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u000b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/vrem/wifianalyzer/export/Export;", "", "exportIntent", "Lcom/vrem/wifianalyzer/export/ExportIntent;", "(Lcom/vrem/wifianalyzer/export/ExportIntent;)V", "header", "", "data", "wiFiDetails", "", "Lcom/vrem/wifianalyzer/wifi/model/WiFiDetail;", "timestamp", "data$app_debug", "export", "Landroid/content/Intent;", "mainActivity", "Lcom/vrem/wifianalyzer/MainActivity;", "date", "Ljava/util/Date;", "timestamp$app_debug", "title", "title$app_debug", "toExportString", "Lkotlin/Function1;", "Companion", "app_debug"})
public final class Export {
    private final com.vrem.wifianalyzer.export.ExportIntent exportIntent = null;
    private final java.lang.String header = "Time Stamp|SSID|BSSID|Strength|Primary Channel|Primary Frequency|Center Channel|Center Frequency|Width (Range)|Distance|802.11mc|Security\n";
    @org.jetbrains.annotations.NotNull()
    public static final com.vrem.wifianalyzer.export.Export.Companion Companion = null;
    private static final java.lang.String TIME_STAMP_FORMAT = "yyyy/MM/dd-HH:mm:ss";
    
    public Export() {
        super();
    }
    
    public Export(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.export.ExportIntent exportIntent) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent export(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent export(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, @org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String data$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.model.WiFiDetail> wiFiDetails, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String title$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.MainActivity mainActivity, @org.jetbrains.annotations.NotNull()
    java.lang.String timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String timestamp$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    private final kotlin.jvm.functions.Function1<com.vrem.wifianalyzer.wifi.model.WiFiDetail, java.lang.String> toExportString(java.lang.String timestamp) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/vrem/wifianalyzer/export/Export$Companion;", "", "()V", "TIME_STAMP_FORMAT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}