package com.samsung.shrc.dtoanng.compose_quick_notes

import android.app.Activity
import android.content.Intent
import androidx.test.runner.AndroidJUnitRunner
import dagger.hilt.android.testing.HiltTestApplication

class HiltTestRunner : AndroidJUnitRunner() {
    override fun newActivity(cl: ClassLoader?, className: String?, intent: Intent?): Activity {
        return super.newActivity(cl, HiltTestApplication::class.java.name, intent)
    }
}