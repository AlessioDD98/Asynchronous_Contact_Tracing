package com.vrem.wifianalyzer.wifi.channelrating;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001+B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ#\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0000\u00a2\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\"\u001a\u00020\fH\u0002J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\fH\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020(H\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u0018H\u0002J\u0014\u0010*\u001a\u00020\u001e*\u00020%2\u0006\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/channelrating/ChannelRatingAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/vrem/wifianalyzer/wifi/band/WiFiChannel;", "Lcom/vrem/wifianalyzer/wifi/scanner/UpdateNotifier;", "context", "Landroid/content/Context;", "bestChannels", "Landroid/widget/TextView;", "channelRating", "Lcom/vrem/wifianalyzer/wifi/model/ChannelRating;", "(Landroid/content/Context;Landroid/widget/TextView;Lcom/vrem/wifianalyzer/wifi/model/ChannelRating;)V", "maxChannelsToDisplay", "", "Lcom/vrem/wifianalyzer/wifi/channelrating/ChannelRatingAdapter$Message;", "wiFiBand", "Lcom/vrem/wifianalyzer/wifi/band/WiFiBand;", "wiFiChannels", "", "bestChannels$app_debug", "create", "Lcom/vrem/wifianalyzer/databinding/ChannelRatingDetailsBinding;", "parent", "Landroid/view/ViewGroup;", "errorMessage", "", "getView", "Landroid/view/View;", "position", "view", "ratingBar", "", "wiFiChannel", "Landroid/widget/RatingBar;", "ratingBarColor", "color", "setRatingBarColorLegacy", "drawable", "Landroid/graphics/drawable/Drawable;", "update", "wiFiData", "Lcom/vrem/wifianalyzer/wifi/model/WiFiData;", "countryCode", "colorFilter", "Message", "app_debug"})
public final class ChannelRatingAdapter extends android.widget.ArrayAdapter<com.vrem.wifianalyzer.wifi.band.WiFiChannel> implements com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier {
    private final android.widget.TextView bestChannels = null;
    private final com.vrem.wifianalyzer.wifi.model.ChannelRating channelRating = null;
    private final int maxChannelsToDisplay = 11;
    
    public ChannelRatingAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.TextView bestChannels, @org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.ChannelRating channelRating) {
        super(null, 0);
    }
    
    @java.lang.Override()
    public void update(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.model.WiFiData wiFiData) {
    }
    
    private final java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannels(com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, java.lang.String countryCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final void ratingBar(com.vrem.wifianalyzer.wifi.band.WiFiChannel wiFiChannel, android.widget.RatingBar ratingBar) {
    }
    
    private final void ratingBarColor(android.widget.RatingBar ratingBar, int color) {
    }
    
    private final void setRatingBarColorLegacy(android.graphics.drawable.Drawable drawable, int color) {
    }
    
    private final void colorFilter(android.graphics.drawable.Drawable $this$colorFilter, int color) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.vrem.wifianalyzer.wifi.channelrating.ChannelRatingAdapter.Message bestChannels$app_debug(@org.jetbrains.annotations.NotNull()
    com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand, @org.jetbrains.annotations.NotNull()
    java.util.List<com.vrem.wifianalyzer.wifi.band.WiFiChannel> wiFiChannels) {
        return null;
    }
    
    private final java.lang.String errorMessage(com.vrem.wifianalyzer.wifi.band.WiFiBand wiFiBand) {
        return null;
    }
    
    private final com.vrem.wifianalyzer.databinding.ChannelRatingDetailsBinding create(android.view.ViewGroup parent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/channelrating/ChannelRatingAdapter$Message;", "", "message", "", "color", "", "(Ljava/lang/String;I)V", "getColor", "()I", "getMessage", "()Ljava/lang/String;", "app_debug"})
    public static final class Message {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        private final int color = 0;
        
        public Message(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @androidx.annotation.ColorRes()
        int color) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final int getColor() {
            return 0;
        }
    }
}