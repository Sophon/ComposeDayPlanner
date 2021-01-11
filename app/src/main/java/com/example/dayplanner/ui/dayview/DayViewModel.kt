package com.example.dayplanner.ui.dayview

import com.example.dayplanner.domain.data.Day
import com.example.dayplanner.domain.data.Tasks

class DayViewModel: DayViewContract.ViewModel {

    override lateinit var day: Day

    override lateinit var tasks: Tasks
}