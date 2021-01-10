package com.example.dayplanner.domain

import com.example.dayplanner.domain.constants.QUARTER
import java.io.Serializable

data class QuarterHour(
    val task: Int,
    val quarter: QUARTER,
    val isActive: Boolean
) : Serializable