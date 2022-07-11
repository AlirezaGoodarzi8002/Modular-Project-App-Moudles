package com.example.appmodules.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.appmodules.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_cash)?.setOnClickListener {
            Toast.makeText(this, "You have your money", Toast.LENGTH_SHORT).show()
        }
    }
}