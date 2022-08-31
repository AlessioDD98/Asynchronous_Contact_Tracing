package com.vrem.wifianalyzer.vendor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0012J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/vrem/wifianalyzer/vendor/VendorAdapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", "vendorService", "Lcom/vrem/wifianalyzer/vendor/model/VendorService;", "(Landroid/content/Context;Lcom/vrem/wifianalyzer/vendor/model/VendorService;)V", "create", "Lcom/vrem/wifianalyzer/databinding/VendorDetailsBinding;", "parent", "Landroid/view/ViewGroup;", "getView", "Landroid/view/View;", "position", "", "view", "update", "", "filter", "Binding", "app_debug"})
@com.vrem.annotation.OpenClass()
public class VendorAdapter extends android.widget.ArrayAdapter<java.lang.String> {
    private final com.vrem.wifianalyzer.vendor.model.VendorService vendorService = null;
    
    public VendorAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.vendor.model.VendorService vendorService) {
        super(null, 0);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    public void update(@org.jetbrains.annotations.NotNull()
    java.lang.String filter) {
    }
    
    private com.vrem.wifianalyzer.databinding.VendorDetailsBinding create(android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/vrem/wifianalyzer/vendor/VendorAdapter$Binding;", "", "binding", "Lcom/vrem/wifianalyzer/databinding/VendorDetailsBinding;", "(Lcom/vrem/wifianalyzer/databinding/VendorDetailsBinding;)V", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "root", "getRoot", "()Landroid/view/View;", "vendorMacs", "Landroid/widget/TextView;", "getVendorMacs", "()Landroid/widget/TextView;", "vendorName", "getVendorName", "app_debug"})
    static final class Binding {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View root = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView vendorName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView vendorMacs = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getRoot() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getVendorName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getVendorMacs() {
            return null;
        }
        
        public Binding(@org.jetbrains.annotations.NotNull()
        com.vrem.wifianalyzer.databinding.VendorDetailsBinding binding) {
            super();
        }
        
        public Binding(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super();
        }
    }
}