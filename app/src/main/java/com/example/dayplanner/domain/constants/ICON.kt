package com.example.dayplanner.domain.constants

import android.content.Context

enum class ICON(val iconName: String) {
    FREE_TIME("ic_free_time"),
    BREAK("ic_break"),
    STUDY("ic_study"),
    WORK("ic_work"),
    EXERCISE("ic_exercise"),
    MENTAL_CULTIVATION("ic_bhavana"),
    EAT("ic_eat"),
    SLEEP("ic_sleep"),
    SHOP("ic_shop");

    companion object {
        fun getId(icon: ICON, context: Context): Int {
            return context.resources.getIdentifier(
                icon.iconName,
                "drawable",
                context.packageName
            )
        }
    }
}