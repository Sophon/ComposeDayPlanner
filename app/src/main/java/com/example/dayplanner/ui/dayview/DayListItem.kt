package com.example.dayplanner.ui.dayview

import androidx.annotation.IntegerRes

class DayListItem (
    val hourBlockText: String,
    @field:IntegerRes val iconResId: IntArray,
    @field:IntegerRes val bgResId: IntArray,
    val taskNames: Array<String>,
    val type: LIST_ITEM_TYPE
)