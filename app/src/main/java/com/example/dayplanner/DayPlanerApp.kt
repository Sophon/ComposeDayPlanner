package com.example.dayplanner

import android.app.Application

class DayPlanerApp: Application() {

    lateinit var serviceLocator: StorageServiceLocator

    override fun onCreate() {
        super.onCreate()

        serviceLocator = StorageServiceLocator(this)
    }
}