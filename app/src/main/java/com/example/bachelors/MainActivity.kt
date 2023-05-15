package com.example.bachelors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.bachelors.R

class MainActivity : AppCompatActivity() {

    var login :EditText? = null
    var password: EditText? = null
    var signIn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login = findViewById(R.id.editTextLogin)
        password = findViewById(R.id.editTextPassword)
        signIn = findViewById(R.id.buttonSignIn)

        signIn?.setOnClickListener(){
            startFeedActivity()
        }
    }

    private fun startFeedActivity() {
        val intent = Intent(this, StudentPage::class.java)
        startActivity(intent)
    }

}