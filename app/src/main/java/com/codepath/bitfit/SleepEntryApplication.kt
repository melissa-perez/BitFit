package com.codepath.bitfit

import android.app.Application
import androidx.core.content.ContentProviderCompat.requireContext

class SleepEntryApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}

