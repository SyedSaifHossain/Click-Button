package com.example.click_button

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var signin : Button
    private lateinit var signout : Button
    private lateinit var signup : Button

    private lateinit var textID : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signin = findViewById<Button>(R.id.signin)
        signout = findViewById<Button>(R.id.signout)
        signup = findViewById<Button>(R.id.signup)
        textID = findViewById(R.id.textId)
        signin.setOnClickListener{
            textID.setText("You have clicked signin button")
           }
        signout.setOnClickListener{
            textID.setText("You have clicked signout button")
        }
        signup.setOnClickListener{
            textID.setText("You have clicked signup button")
        }
    }

}