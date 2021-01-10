package com.example.dayplanner.domain

import java.io.Serializable

data class Hour(
    val quarters: List<QuarterHour>,
    val hourInt: Int
) : Serializable