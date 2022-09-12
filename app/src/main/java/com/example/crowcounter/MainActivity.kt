package com.example.crowcounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counter = findViewById<TextView>(R.id.counter)
        val btnplus = findViewById<Button>(R.id.button)
        val btnminus = findViewById<Button>(R.id.button2)

        btnplus.setOnClickListener {
            num++
            counter.text = num.toString()
        }

        btnminus.setOnClickListener {
            num--
            counter.text = num.toString()

        }
    }
}


