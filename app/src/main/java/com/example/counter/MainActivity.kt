package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countButton: Button = findViewById(R.id.button)
        val countText: TextView = findViewById(R.id.textView)

        var count: Int = 0
        countButton.setOnClickListener {
            count++
            countText.text = count.toString()
        }
    }
}