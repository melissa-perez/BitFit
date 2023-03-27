package com.codepath.bitfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.codepath.bitfit.R.id
import com.codepath.bitfit.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var sleepEntryBtn: Button
    private var binding: ActivityMainBinding? = null
    private lateinit var hoursDashboard: TextView
    private lateinit var feelingDashboard: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        // dashboard/button part of root activity main
        // recyclerview
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.content, SleepEntryFragment(), null).commit()

        // set on click listener for log sleep entry btn
        sleepEntryBtn = findViewById<Button>(R.id.sleep_record_btn)
        feelingDashboard = findViewById(R.id.average_feelings_tv)
        hoursDashboard = findViewById(R.id.average_hours_tv)
        sleepEntryBtn.setOnClickListener {
            val sleepEntryIntent = Intent(this, LogActivity::class.java)
            startActivity(sleepEntryIntent)
            /*let {
                lifecycleScope.launch(Dispatchers.IO) {
                    val feelingAverage = (application as SleepEntryApplication).db.sleepEntryDao()
                        .getFeelingAverage()
                    val sleepAverage =
                        (application as SleepEntryApplication).db.sleepEntryDao().getHoursAverage()
                    Log.d("dashbord", "$feelingAverage,$sleepAverage")

                    hoursDashboard.text = sleepAverage.toString()
                    feelingDashboard.text = feelingAverage.toString()
                }

            }*/
        }
    }
}