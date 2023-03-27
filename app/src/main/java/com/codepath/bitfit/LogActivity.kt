package com.codepath.bitfit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codepath.bitfit.databinding.SleepLogActivityBinding

class LogActivity : AppCompatActivity() {
    private var binding: SleepLogActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SleepLogActivityBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }


}