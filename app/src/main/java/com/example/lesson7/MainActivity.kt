package com.example.lesson7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnoak = findViewById<Button>(R.id.oak)
        val btnmaple = findViewById<Button>(R.id.maple)
        val btnAsh = findViewById<Button>(R.id.ash)

        val oak = Oak()
        val maple = Maple()
        val ash = Ash()

        btnoak.setOnClickListener {
            oak.toGrow(this)

        }
        btnmaple.setOnClickListener {
            maple.toGrow(this)

        }
        btnAsh.setOnClickListener {
            ash.toGrow(this)

        }
    }
}