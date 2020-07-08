package com.example.differentsdk

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mydifferentsdklibrary.TestClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // Ir a flujo exclusivo para api >= 23
            val test = TestClass()
            Log.d("MIN_SDK_23", "${test.myComment}")
        } else {
            // Ir a flujo alternativo
            Log.d("MIN_SDK_23", "Estás en una versión más baja, pero no pasa nada!")
        }

    }
}