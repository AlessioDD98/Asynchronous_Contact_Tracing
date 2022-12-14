package com.vrem.wifianalyzer.wifi.accesspoint;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/vrem/wifianalyzer/wifi/accesspoint/ConnectionViewType;", "", "layout", "", "(Ljava/lang/String;II)V", "hide", "", "getHide", "()Z", "getLayout", "()I", "COMPLETE", "COMPACT", "HIDE", "app_debug"})
public enum ConnectionViewType {
    /*public static final*/ COMPLETE /* = new COMPLETE(0) */,
    /*public static final*/ COMPACT /* = new COMPACT(0) */,
    /*public static final*/ HIDE /* = new HIDE(0) */;
    private final int layout = 0;
    
    ConnectionViewType(@androidx.annotation.LayoutRes()
    int layout) {
    }
    
    public final int getLayout() {
        return 0;
    }
    
    public final boolean getHide() {
        return false;
    }
}