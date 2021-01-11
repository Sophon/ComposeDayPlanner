package com.example.dayplanner.ui.dayview

/*
 * 0 - full hour
 * 1 - half half
 * 2 - quarter quarter half
 * 3 - quarter half quarter
 * 4 - half quarter quarter
 * 5 - quarter quarter quarter quarter
 */
enum class LIST_ITEM_TYPE {
    FULL_HOUR,
    HALF_HALF,
    QUARTER_QUARTER,
    QUARTER_HALF_QUARTER,
    HALF_QUARTER_QUARTER,
    QUARTER_THREE_QUARTER,
    THREE_QUARTER_QUARTER,
    QUARTERS
}