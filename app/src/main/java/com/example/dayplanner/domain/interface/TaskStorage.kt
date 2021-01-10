package com.example.dayplanner.domain.`interface`

import com.example.dayplanner.domain.data.Day
import com.example.dayplanner.domain.data.Task
import com.example.dayplanner.domain.data.Tasks

interface TaskStorage {

    fun getTasks(
        onSuccess: (Tasks) -> Unit,
        onError: (Exception) -> Unit
    )

    fun getTask(
        day: Day,
        onSuccess: (Task) -> Unit,
        onError: (Exception) -> Unit
    )

    fun updateTask(
        task: Task,
        onSuccess: () -> Unit,
        onError: (Exception) -> Unit
    )
}