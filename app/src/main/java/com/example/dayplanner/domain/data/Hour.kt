package com.example.dayplanner.domain.data

import java.io.Serializable

data class Hour(
    val quarters: List<QuarterHour>,
    val hourInt: Int
) : Serializable