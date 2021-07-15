package com.example.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Instructions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        val actionBar = supportActionBar
        actionBar!!.title = "Instructions"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val btn = findViewById<Button>(R.id.btn)
        // set on-click listener

        btn.setOnClickListener {
            val intent = Intent(this, Question::class.java)
            startActivity(intent)
        }
    }
}
