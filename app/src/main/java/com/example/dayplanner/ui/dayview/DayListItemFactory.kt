package com.example.dayplanner.ui.dayview

import android.content.Context
import com.example.dayplanner.common.getHourBlockText
import com.example.dayplanner.domain.constants.COLOR
import com.example.dayplanner.domain.constants.ICON
import com.example.dayplanner.domain.data.Day
import com.example.dayplanner.domain.data.Hour
import com.example.dayplanner.domain.data.Tasks

object DayListItemFactory {

    fun getItemList(
        context: Context,
        day: Day,
        tasks: Tasks
    ): List<DayListItem> {
        val list: MutableList<DayListItem> = ArrayList()

        day.hours.forEach { hour ->
            list.add(
                DayListItem(
                    getHourBlockText(hour.hourInt, day.mode),
                    getIconResIds(hour, tasks, context),
                    getBackgroundResIds(hour, tasks, context),
                    getTaskNames(hour, tasks),
                    getListItemType(hour)
                )
            )
        }

        return list
    }

    private fun getListItemType(hour: Hour): LIST_ITEM_TYPE {
        var activeTasks = 0

        hour.quarters.forEach { quarterHour ->
            if(quarterHour.isActive) {
                activeTasks++
            }

            if(activeTasks == 1) {
                return LIST_ITEM_TYPE.FULL_HOUR
            }

            if(activeTasks == 2) {
                val one = hour.quarters[1].isActive
                val two = hour.quarters[2].isActive
                val three = hour.quarters[3].isActive

                if(!one && two && !three) return LIST_ITEM_TYPE.HALF_HALF
                if(one && !two && !three) return LIST_ITEM_TYPE.QUARTER_THREE_QUARTER
                if(!one && !two && three) return LIST_ITEM_TYPE.THREE_QUARTER_QUARTER
            }

            if(activeTasks == 3) {
                val first = hour.quarters[0].isActive
                val second = hour.quarters[1].isActive
                val third = hour.quarters[2].isActive
                val fourth = hour.quarters[3].isActive

                if(first && second && !third && fourth)
                    return LIST_ITEM_TYPE.QUARTER_HALF_QUARTER
                if(first && !second && third && fourth)
                    return LIST_ITEM_TYPE.HALF_QUARTER_QUARTER
                if(first && second && third && !fourth)
                    return LIST_ITEM_TYPE.QUARTER_QUARTER_HALF

            }
        }

        return LIST_ITEM_TYPE.QUARTERS
    }

    private fun getTaskNames(hour: Hour, tasks: Tasks): Array<String> {
        val taskNames = Array(4) { "" }

        hour.quarters.forEachIndexed { index, quarterHour ->
            taskNames[index] = tasks.getTaskById(quarterHour.taskId)!!.name
        }

        return taskNames
    }

    private fun getBackgroundResIds(hour: Hour, tasks: Tasks, context: Context): IntArray {
        val resIds = IntArray(4)

        hour.quarters.forEachIndexed { index, quarterHour ->
            resIds[index] = COLOR.getId(
                tasks.getTaskById(quarterHour.taskId)!!.color,
                context
            )
        }

        return resIds
    }

    private fun getIconResIds(hour: Hour, tasks: Tasks, context: Context): IntArray {
        val resIds = IntArray(4)
        var index = 0

        hour.quarters.forEachIndexed { index, quarterHour ->
            resIds[index] = ICON.getId(
                tasks.getTaskById(quarterHour.taskId)!!.icon,
                context
            )
        }

        return resIds
    }


}