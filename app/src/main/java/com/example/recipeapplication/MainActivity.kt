package com.example.recipeapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val start = findViewById<ImageButton>(R.id.start)
        start.setOnClickListener {
           val int = Intent(this, SignIn::class.java)
           startActivity(int)
        }
    }
}