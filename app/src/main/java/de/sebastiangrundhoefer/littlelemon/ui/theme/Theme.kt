package de.sebastiangrundhoefer.littlelemon.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColors(
    primary = LittleLemonGreen,
    primaryVariant = Purple700,
    secondary = LittleLemonSalmon
)

private val LightColorPalette = lightColors(
    primary = LittleLemonYellow,
    primaryVariant = Purple700,
    secondary = LittleLemonBeige,

)

private val LittleLemonYellowButton = lightColors(
    background = LittleLemonYellow
)

@Composable
fun LittleLemonTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}