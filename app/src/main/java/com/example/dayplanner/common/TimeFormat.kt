package com.example.dayplanner.common

import com.example.dayplanner.domain.constants.HOUR_MODE
import com.example.dayplanner.domain.constants.QUARTER

fun getHourBlockText(hour: Int, mode: HOUR_MODE): String {
    var suffix = ""
    var hourText = hour.toString()

    if(mode == HOUR_MODE.TWELVE_HOUR) {
        if(hour == 0) {
            suffix = "AM"
            hourText = "12"
        }

        when {
            hour == 12 -> {
                suffix = "PM"
            }
            hour > 12 -> {
                //13-23
                suffix = "PM"
                hourText = (hour - 12).toString()
            }
            else -> {
                //1-11
                suffix = "AM"
            }
        }
    } else {
        if(hour == 0) {
            hourText = "00"
        }

        suffix = ":00"
    }

    return hourText + suffix
}

fun getHourToggleText(quarter: QUARTER, hour: Int, mode: HOUR_MODE): String {
    var suffix = ""
    var quarterText = getQuarterText(quarter)
    var hourText = hour.toString()

    if(mode == HOUR_MODE.TWELVE_HOUR) {
        when {
            hour == 0 -> {
                suffix = "AM"
                hourText = "12"
            }
            hour == 12 -> {
                suffix = "PM"
            }
            hour > 12 -> {
                suffix = "PM"
                hourText = (hour - 12).toString()
            }
            else -> {
                suffix = "AM"
            }
        }
    } else {
        suffix = ":00"
    }

    return hourText + suffix
}

fun getQuarterText(quarter: QUARTER): String {
    return when(quarter) {
        QUARTER.ZERO -> ":00"
        QUARTER.FIFTEEN -> ":15"
        QUARTER.THIRTY -> ":30"
        QUARTER.FORTY_FIVE -> ":45"
    }
}
