package com.example.dayplanner.common

import android.content.Context
import androidx.core.content.ContextCompat
import com.example.dayplanner.R
import com.example.dayplanner.domain.constants.COLOR
import com.example.dayplanner.domain.constants.ICON

fun getResIdFromEnum(context: Context, icon: ICON?): Int {
    return when(icon) {
        ICON.FREE_TIME -> getId("ic_free_time", context)
        ICON.BREAK -> getId("ic_break", context)
        ICON.STUDY -> getId("ic_study", context)
        ICON.WORK -> getId("ic_work", context)
        ICON.EXERCISE -> getId("ic_exercise", context)
        ICON.MENTAL_CULTIVATION -> getId("ic_bhavana", context)
        ICON.EAT -> getId("ic_eat", context)
        ICON.SLEEP -> getId("ic_sleep", context)
        ICON.SHOP -> getId("ic_shop", context)
        else -> getId("ic_free_time", context)
    }
}

fun getId(resource: String, context: Context): Int {
    return context.resources.getIdentifier(
        resource,
        "drawable",
        context.packageName
    )
}

fun getColorResId(context: Context, color: COLOR?): Int {
    return when (color) {
        COLOR.DARK_BLUE -> {
            ContextCompat.getColor(context, R.color.darkBlue)
        }

        COLOR.BURNT_ORANGE -> {
            ContextCompat.getColor(context, R.color.darkBlue)
        }

        COLOR.GREEN -> {
            ContextCompat.getColor(context, R.color.green)
        }

        COLOR.DARK_RED -> {
            ContextCompat.getColor(context, R.color.red)
        }

        COLOR.LIME -> {
            ContextCompat.getColor(context, R.color.lime)
        }

        COLOR.LIGHT_BLUE -> {
            ContextCompat.getColor(context, R.color.lightBlue)
        }

        COLOR.MAUVE -> {
            ContextCompat.getColor(context, R.color.mauve)
        }

        COLOR.BROWN -> {
            ContextCompat.getColor(context, R.color.brown)
        }

        COLOR.TEAL -> {
            ContextCompat.getColor(context, R.color.teal)
        }

        else -> {
            ContextCompat.getColor(context, R.color.lightBlue)
        }
    }
}