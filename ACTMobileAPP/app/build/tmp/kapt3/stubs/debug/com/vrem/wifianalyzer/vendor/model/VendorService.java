package com.vrem.wifianalyzer.vendor.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH\u0012J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0016J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0010\u00a2\u0006\u0002\b\u0013J\u0012\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0012J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068RX\u0092\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lcom/vrem/wifianalyzer/vendor/model/VendorService;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "vendorData", "Lcom/vrem/wifianalyzer/vendor/model/VendorService$VendorData;", "getVendorData", "()Lcom/vrem/wifianalyzer/vendor/model/VendorService$VendorData;", "vendorData$delegate", "Lkotlin/Lazy;", "filter", "", "source", "", "findMacAddresses", "", "vendorName", "findMacs", "findMacs$app_debug", "findVendorName", "address", "findVendors", "load", "macContains", "VendorData", "app_debug"})
@com.vrem.annotation.OpenClass()
public class VendorService {
    private final android.content.res.Resources resources = null;
    private final kotlin.Lazy vendorData$delegate = null;
    
    public VendorService(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        super();
    }
    
    private com.vrem.wifianalyzer.vendor.model.VendorService.VendorData getVendorData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String findVendorName(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> findMacAddresses(@org.jetbrains.annotations.NotNull()
    java.lang.String vendorName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> findVendors(@org.jetbrains.annotations.NotNull()
    java.lang.String vendorName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> findMacs$app_debug() {
        return null;
    }
    
    private boolean filter(java.lang.String source, java.lang.String filter) {
        return false;
    }
    
    private boolean macContains(java.lang.String source, java.lang.String filter) {
        return false;
    }
    
    private com.vrem.wifianalyzer.vendor.model.VendorService.VendorData load(android.content.res.Resources resources) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0007R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/vrem/wifianalyzer/vendor/model/VendorService$VendorData;", "", "vendors", "", "", "", "macs", "(Ljava/util/Map;Ljava/util/Map;)V", "getMacs", "()Ljava/util/Map;", "getVendors", "app_debug"})
    static final class VendorData {
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> vendors = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> macs = null;
        
        public VendorData(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> vendors, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> macs) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getVendors() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getMacs() {
            return null;
        }
    }
}