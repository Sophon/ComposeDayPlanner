package com.example.dayplanner

import android.content.Context
import com.example.dayplanner.domain.`interface`.DayStorage
import com.example.dayplanner.domain.`interface`.TaskStorage

class StorageServiceLocator(
    context: Context,
    val exec = ApplicationExecutors(),
    val dayStorageImpl: DayStorage = DateStorageImpl(context.filesDir.path, exec),
    val timeStorageImpl: TaskStorage = TaskStorageImpl(context.filesDir.path, exec)
) {}