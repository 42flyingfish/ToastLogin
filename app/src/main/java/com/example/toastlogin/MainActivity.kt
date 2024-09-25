package com.example.toastlogin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // See https://developer.android.com/reference/android/widget/Button
        // For reference on using a button in kotlin

        // See https://developer.android.com/guide/topics/ui/notifiers/toasts.html
        // For reference on using Toast

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val text = "Login Successful"
            val toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}