package com.example.dayplanner.ui.dayview

sealed class DayViewEvent {
    object OnStart: DayViewEvent()
    data class OnHourSelected(val position: Int): DayViewEvent()
    object OnManageTasksSelected: DayViewEvent()
}