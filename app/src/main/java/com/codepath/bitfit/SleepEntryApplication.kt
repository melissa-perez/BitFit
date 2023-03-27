package com.codepath.bitfit

import android.app.Application

class SleepEntryApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}

