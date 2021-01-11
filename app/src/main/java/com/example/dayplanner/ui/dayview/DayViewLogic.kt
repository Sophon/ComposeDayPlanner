package com.example.dayplanner.ui.dayview

import com.example.dayplanner.common.BaseViewLogic
import com.example.dayplanner.domain.`interface`.DayStorage
import com.example.dayplanner.domain.`interface`.TaskStorage
import com.example.dayplanner.domain.constants.Messages
import com.example.dayplanner.domain.data.Day
import com.example.dayplanner.domain.data.Tasks

class DayViewLogic(
    private val view: DayViewContract.View,
    private val vm: DayViewContract.ViewModel,
    private val dayStorage: DayStorage,
    private val taskStorage: TaskStorage
): BaseViewLogic<DayViewEvent>() {

    override fun onViewEvent(event: DayViewEvent) {
        when(event) {
            DayViewEvent.OnStart -> {
                dayStorage.getDay(
                    { day -> getTasks(day) },
                    {
                        view.showMessage(Messages.GENERIC_ERROR_MESSAGE)
                        view.restartFeature()
                    }
                )
            }

            is DayViewEvent.OnHourSelected -> {
                view.navigateToHourView(hourInteger = event.position)
            }

            DayViewEvent.OnManageTasksSelected -> {
                view.navigateToTaskView()
            }
        }
    }

    private fun getTasks(day: Day) {
        taskStorage.getTasks(
            { tasks -> bindData(day, tasks) },
            {
                view.showMessage(Messages.GENERIC_ERROR_MESSAGE)
                view.restartFeature()
            }
        )
    }

    private fun bindData(dayResult: Day, taskResult: Tasks) {
        vm.day = dayResult
        vm.tasks = taskResult
        view.setData(dayResult, taskResult)
    }
}