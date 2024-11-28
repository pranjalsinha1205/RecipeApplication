package com.example.recipeapplication

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        val username = findViewById<EditText>(R.id.username)

        val signin = findViewById<ImageButton>(R.id.signin)
        signin.setOnClickListener { proceed(username.text.toString()) }
        val signText = findViewById<TextView>(R.id.signText)
        signText.setOnClickListener { proceed(username.text.toString()) }

    }
    fun proceed(name : String){
        val int = Intent(this, RecipePage::class.java)
        startActivity(int)
        Toast.makeText(this, "Welcome, $name!", Toast.LENGTH_LONG).show()
    }
}