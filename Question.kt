package com.example.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast

class Question : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val actionBar = supportActionBar
        actionBar!!.title = "Game 1"
        actionBar.setDisplayHomeAsUpEnabled(true)

        Handler().postDelayed({
            Toast.makeText(applicationContext, "Time's up!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Question1::class.java)
            startActivity(intent)
        }, 2000)
    }
}
