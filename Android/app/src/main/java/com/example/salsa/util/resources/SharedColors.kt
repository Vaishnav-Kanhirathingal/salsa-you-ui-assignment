package com.example.salsa.util.resources

import androidx.annotation.ColorInt
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

enum class SharedColors(
    @ColorInt private val darkColor: Long,
    @ColorInt private val lightColor: Long
) {
    SURFACE(
        darkColor = 0xFF121212,
        lightColor = 0xFFEDEDED
    ),
    ON_SURFACE(
        darkColor = 0xFFFCFCFC,
        lightColor = 0xFF030303
    ),
    SURFACE_CONTAINER(
        darkColor = 0xFF2A2A2A,
        lightColor = 0xffD5D5D5
    ),
    ON_SURFACE_CONTAINER(
        darkColor = 0xFF727272,
        lightColor = 0xFF8D8D8D
    ),
    CURSOR(
        darkColor = 0xFFFFFFFF,
        lightColor = 0xFF000000
    ),
    PROFILE_CONTAINER(
        darkColor = 0xFF1A1A1A,
        lightColor = 0xFFE5E5E5
    ),
    NOTIFICATION_CIRCLE(
        darkColor = 0xFFFEBE24,
        lightColor = 0xFFFEBE24
    ),
    HOME_CARD_SHADE(
        darkColor = 0x80100F0F,
        lightColor = 0x80100F0F
    ),
    HOME_CARD_TEXT(
        darkColor = 0xFFFCFCFC,
        lightColor = 0xFFFCFCFC
    ),
    SEARCH_CARD_SHADE(
        darkColor = 0xB2100F0F,
        lightColor = 0xB2100F0F
    ),
    SEARCH_CARD_TEXT(
        darkColor = 0xFFFCFCFC,
        lightColor = 0xFFFCFCFC
    );

    val color: Color @Composable get() = Color(color = if (isSystemInDarkTheme()) this.darkColor else this.lightColor)

}