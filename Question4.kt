package com.example.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question1.*

class Question4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        val actionBar = supportActionBar
        actionBar!!.title = "Question 4"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val btn = findViewById<Button>(R.id.btn)
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                val check = findViewById<Button>(R.id.check)
                check.setOnClickListener {
                    var id: Int = radio_group.checkedRadioButtonId
                    val radio: RadioButton = findViewById(id)

                    if (radio.text == "2") {
                        Toast.makeText(applicationContext, "Correct!", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "Try again", Toast.LENGTH_SHORT).show()
                    }
                }

            })

        val results = findViewById<Button>(R.id.results)

        results.setOnClickListener {
            val intent = Intent(this, Results::class.java)
            startActivity(intent)
        }
    }
}


