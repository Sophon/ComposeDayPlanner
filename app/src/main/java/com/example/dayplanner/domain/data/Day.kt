package com.example.dayplanner.domain.data

import com.example.dayplanner.domain.constants.HOUR_MODE
import java.io.Serializable

data class Day(
    val mode: HOUR_MODE,
    val hours: List<Hour>
) : Serializable