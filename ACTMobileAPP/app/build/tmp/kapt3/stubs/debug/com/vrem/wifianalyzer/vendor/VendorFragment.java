package com.vrem.wifianalyzer.vendor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016\u00a8\u0006\f"}, d2 = {"Lcom/vrem/wifianalyzer/vendor/VendorFragment;", "Landroidx/fragment/app/ListFragment;", "()V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Listener", "app_debug"})
public final class VendorFragment extends androidx.fragment.app.ListFragment {
    
    public VendorFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/vrem/wifianalyzer/vendor/VendorFragment$Listener;", "Landroid/widget/SearchView$OnQueryTextListener;", "vendorAdapter", "Lcom/vrem/wifianalyzer/vendor/VendorAdapter;", "(Lcom/vrem/wifianalyzer/vendor/VendorAdapter;)V", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "app_debug"})
    public static final class Listener implements android.widget.SearchView.OnQueryTextListener {
        private final com.vrem.wifianalyzer.vendor.VendorAdapter vendorAdapter = null;
        
        public Listener(@org.jetbrains.annotations.NotNull()
        com.vrem.wifianalyzer.vendor.VendorAdapter vendorAdapter) {
            super();
        }
        
        @java.lang.Override()
        public boolean onQueryTextSubmit(@org.jetbrains.annotations.NotNull()
        java.lang.String query) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onQueryTextChange(@org.jetbrains.annotations.NotNull()
        java.lang.String newText) {
            return false;
        }
    }
}