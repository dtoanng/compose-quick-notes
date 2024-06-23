package com.samsung.shrc.dtoanng.compose_quick_notes.core

import android.app.Application
import com.samsung.shrc.dtoanng.compose_quick_notes.BuildConfig
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class QuickNotesApp : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}