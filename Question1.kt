package com.example.memorygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question1.*

class Question1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        val actionBar = supportActionBar
        actionBar!!.title = "Question 1"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val btn = findViewById<Button>(R.id.btn)
        //var rightAnswer1: Int=0
        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener {group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                val check = findViewById<Button>(R.id.check)
                    check.setOnClickListener {
                        var id: Int = radio_group.checkedRadioButtonId
                        val radio:RadioButton = findViewById(id)

                        if (radio.text=="Green"){
                            //rightAnswer1 = rightAnswer1++
                            Toast.makeText(applicationContext, "Correct!",Toast.LENGTH_SHORT).show()
                            //intent.putExtra("Result1", rightAnswer1)
                        }
                        else{
                            Toast.makeText(applicationContext, "Try again",Toast.LENGTH_SHORT).show()
                        }
                    }

            })

        val next = findViewById<Button>(R.id.next)

        next.setOnClickListener {
            val intent = Intent(this, Question2::class.java)
            startActivity(intent)
        }


    }
    }
