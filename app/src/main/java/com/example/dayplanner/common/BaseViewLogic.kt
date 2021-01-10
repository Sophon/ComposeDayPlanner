package com.example.dayplanner.common

abstract class BaseViewLogic<T> {

    private var isCancelled = false

    fun onCancel() {
        isCancelled = true
    }

    abstract fun onViewEvent(event: T)
}