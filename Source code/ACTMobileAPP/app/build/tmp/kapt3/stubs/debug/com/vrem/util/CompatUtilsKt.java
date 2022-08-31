package com.vrem.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0001\u001a\u0012\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u0014\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0003\u001a\u0014\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0002\u00a8\u0006\r"}, d2 = {"compatColor", "", "Landroid/content/Context;", "id", "compatTint", "", "Landroid/graphics/drawable/Drawable;", "tint", "createContext", "newLocale", "Ljava/util/Locale;", "createContextAndroidN", "createContextLegacy", "app_debug"})
public final class CompatUtilsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Context createContext(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$createContext, @org.jetbrains.annotations.NotNull()
    java.util.Locale newLocale) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private static final android.content.Context createContextAndroidN(android.content.Context $this$createContextAndroidN, java.util.Locale newLocale) {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private static final android.content.Context createContextLegacy(android.content.Context $this$createContextLegacy, java.util.Locale newLocale) {
        return null;
    }
    
    @androidx.annotation.ColorInt()
    public static final int compatColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$compatColor, @androidx.annotation.ColorRes()
    int id) {
        return 0;
    }
    
    public static final void compatTint(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$compatTint, @androidx.annotation.ColorInt()
    int tint) {
    }
}