package com.example.chronometer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chmeter = findViewById<Chronometer>(R.id.chrono) as Chronometer
        val startBtn = findViewById<Button>(R.id.start)as Button
        val stopBtn = findViewById<Button>(R.id.stop)as Button

        startBtn.setOnClickListener {
            chmeter.base = SystemClock.elapsedRealtime()
            chmeter.start()
        }
        stopBtn.setOnClickListener {
            chmeter.stop()
        }
    }
}