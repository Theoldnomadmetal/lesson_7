package com.example.lesson7

import android.util.Log

class Maple: Plants() {
    override fun toGrow() {
        Log.d("_____", "Maple is growing")
    }
}