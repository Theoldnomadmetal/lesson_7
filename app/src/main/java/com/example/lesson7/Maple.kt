package com.example.lesson7

import android.content.Context
import android.util.Log
import android.widget.Toast

class Maple: Plants() {
    override fun toGrow(context: Context) {
        showToast(context,"Клён растет")
    }

}