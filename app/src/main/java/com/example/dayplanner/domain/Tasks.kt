package com.example.dayplanner.domain

import java.io.Serializable

class Tasks(private val tasks: List<Task>): Serializable {

    fun getFirstHalf(): List<Task> = tasks.chunked(5)[0]
    fun getSecondHalf(): List<Task> = tasks.chunked(5)[1]

    fun getTaskById(taskId: Int): Task? {
        tasks.forEach { task ->
            if (task.Id == taskId) {
                return task
            }
        }

        return null
    }
}