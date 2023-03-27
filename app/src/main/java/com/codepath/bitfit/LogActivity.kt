package com.codepath.bitfit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.codepath.bitfit.databinding.SleepLogActivityBinding
import com.google.android.material.slider.Slider

class LogActivity : AppCompatActivity() {
    private var binding: SleepLogActivityBinding? = null
    private lateinit var sleptHoursSlider:Slider
    private lateinit var feelingRatingSlider:Slider
    private lateinit var notesEditText:EditText
    private lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SleepLogActivityBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        sleptHoursSlider = findViewById(R.id.sleptSlider)
        feelingRatingSlider = findViewById(R.id.feelingSlider)
        notesEditText = findViewById(R.id.notes)
        saveBtn = findViewById(R.id.save_entry_btn)

        saveBtn.setOnClickListener {
            val hours = sleptHoursSlider.value.toFloat()
            val feelings = feelingRatingSlider.value.toInt()
            val notes = notesEditText.text.toString()


        }

    }


}