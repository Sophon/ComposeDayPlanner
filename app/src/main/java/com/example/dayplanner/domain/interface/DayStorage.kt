package com.example.dayplanner.domain.`interface`

import com.example.dayplanner.domain.constants.HOUR_MODE
import com.example.dayplanner.domain.data.Day
import com.example.dayplanner.domain.data.Hour
import java.lang.Exception

interface DayStorage {

    fun getDay(
        onSuccess: (Day) -> Unit,
        onError: (Exception) -> Unit
    )

    fun updateDay(
        day: Day,
        onSuccess: (Day) -> Unit,
        onError: (Exception) -> Unit
    )

    fun getHourWithMode(
        hourId: Int,
        onSuccess: (Hour, HOUR_MODE) -> Unit,
        onError: (Exception) -> Unit
    )

    fun updateHour(
        hour: Hour,
        onSuccess: () -> Unit,
        onError: (Exception) -> Unit
    )
}