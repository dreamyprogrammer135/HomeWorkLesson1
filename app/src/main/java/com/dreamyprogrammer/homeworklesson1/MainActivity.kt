package com.dreamyprogrammer.homeworklesson1

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.simple_button).setOnClickListener {
            Toast.makeText(this, getString(R.string.hello), Toast.LENGTH_LONG).show()
        }
    }
}