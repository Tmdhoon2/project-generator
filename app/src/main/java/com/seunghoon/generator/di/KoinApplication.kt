package com.seunghoon.generator.di

import android.app.Application
import org.koin.core.context.startKoin

class KoinApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {}
    }
}
