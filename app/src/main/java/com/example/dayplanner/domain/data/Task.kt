package com.example.dayplanner.domain.data

import com.example.dayplanner.domain.constants.COLOR
import com.example.dayplanner.domain.constants.ICON

data class Task(
    val Id: Int,
    val name: String,
    val icon: ICON,
    val color: COLOR
)