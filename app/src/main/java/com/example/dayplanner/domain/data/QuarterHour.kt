package com.example.dayplanner.domain.data

import com.example.dayplanner.domain.constants.QUARTER
import java.io.Serializable

data class QuarterHour(
    val taskId: Int,
    val quarter: QUARTER,
    val isActive: Boolean
) : Serializable