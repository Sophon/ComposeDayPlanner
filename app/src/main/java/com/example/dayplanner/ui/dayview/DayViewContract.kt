package com.example.dayplanner.ui.dayview

import com.example.dayplanner.domain.data.Day
import com.example.dayplanner.domain.data.Tasks

interface DayViewContract {

    interface View {
        fun setData(day: Day, tasks: Tasks)
        fun navigateToHourView(hourInteger: Int)
        fun navigateToTaskView()
        fun showMessage(message: String)
        fun restartFeature()
    }

    interface ViewModel {
        var day: Day
        var tasks: Tasks
    }
}