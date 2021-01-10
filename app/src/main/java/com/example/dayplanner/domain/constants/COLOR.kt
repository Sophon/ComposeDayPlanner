package com.example.dayplanner.domain.constants

import android.content.Context
import androidx.core.content.ContextCompat
import com.example.dayplanner.R

enum class COLOR(val rgb: Long) {
    DARK_BLUE(0xff1A237E),
    BURNT_ORANGE(0xffD84315),
    GREEN(0xff388E3c),
    DARK_RED(0xffB71C1C),
    LIME(0xff827717),
    LIGHT_BLUE(0xff0288D1),
    MAUVE(0xffBA68C8),
    BROWN(0xff795548),
    TEAL(0xff00897B);

    companion object {
        fun getId(color: COLOR, context: Context): Int {
            return when(color) {
                DARK_BLUE -> {
                    ContextCompat.getColor(context, R.color.darkBlue)
                }

                BURNT_ORANGE -> {
                    ContextCompat.getColor(context, R.color.darkBlue)
                }

                GREEN -> {
                    ContextCompat.getColor(context, R.color.green)
                }

                DARK_RED -> {
                    ContextCompat.getColor(context, R.color.red)
                }

                LIME -> {
                    ContextCompat.getColor(context, R.color.lime)
                }

                LIGHT_BLUE -> {
                    ContextCompat.getColor(context, R.color.lightBlue)
                }

                MAUVE -> {
                    ContextCompat.getColor(context, R.color.mauve)
                }

                BROWN -> {
                    ContextCompat.getColor(context, R.color.brown)
                }

                TEAL -> {
                    ContextCompat.getColor(context, R.color.teal)
                }
            }
        }
    }
}