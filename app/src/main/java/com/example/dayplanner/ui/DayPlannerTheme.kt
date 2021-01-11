package com.example.dayplanner.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.example.dayplanner.R
import com.example.dayplanner.domain.constants.COLOR

internal val primary = Color(0xff333333)
internal val primaryDark = Color(0xff121212)
internal val accent = Color(0xffBB86FC)

internal val darkBlue = Color(COLOR.DARK_BLUE.rgb)
internal val burntOrange = Color(COLOR.BURNT_ORANGE.rgb)
internal val green = Color(COLOR.GREEN.rgb)
internal val red = Color(COLOR.DARK_RED.rgb)
internal val lime = Color(COLOR.LIME.rgb)
internal val lightBlue = Color(COLOR.LIGHT_BLUE.rgb)
internal val mauve = Color(COLOR.MAUVE.rgb)
internal val brown = Color(COLOR.BROWN.rgb)
internal val teal = Color(COLOR.TEAL.rgb)

val dayPlannerColors = darkColors(
    primary = primary,
    primaryVariant = primaryDark,
    secondary = accent
)

private val RobotoCondensed = fontFamily(
    font(R.font.robotocondensed_regular),
    font(R.font.robotocondensed_light),
    font(R.font.robotocondensed_bold)
)

@Composable
fun DayPlannerTheme(content: @Composable() () -> Unit) {
    val typography = Typography(
        defaultFontFamily = RobotoCondensed,
        h4 = TextStyle(fontWeight = FontWeight.W700),
        h6 = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp,
            lineHeight = 20.sp,
            fontFamily = RobotoCondensed,
            letterSpacing = 3.sp
        )
    )

    MaterialTheme(
        colors = dayPlannerColors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}