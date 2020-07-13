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
            oak.toGrow()
            Toast.makeText(this, "Дуб растет",Toast.LENGTH_LONG).show()
        }
        btnmaple.setOnClickListener {
            maple.toGrow()
            Toast.makeText(this, "Клён растет",Toast.LENGTH_LONG).show()
        }
        btnAsh.setOnClickListener {
            ash.toGrow()
            Toast.makeText(this,"Ясень растет",Toast.LENGTH_LONG).show()
        }
    }
}