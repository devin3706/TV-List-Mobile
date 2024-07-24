package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var forgotPw: Button
    lateinit var btnLogin: Button
    lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        btnLogin = findViewById(R.id.loginBtn)
        btnSignup = findViewById(R.id.btnSignup)
        forgotPw = findViewById(R.id.forgotPw)



        forgotPw.setOnClickListener {
            forgotPassword()
        }

        btnLogin.setOnClickListener{
            goToHomePg()
        }

        btnSignup.setOnClickListener {
            signup()
        }
    }

    fun forgotPassword(){
        Toast.makeText(this, "An email was sent to ${email.text.toString()}", Toast.LENGTH_LONG).show()
    }

    fun goToHomePg(){
        val Intent = Intent(this, Activity2::class.java)
        startActivity(Intent)
    }

    fun signup(){
        Toast.makeText(this, "Lets get you signed up ${email.text.toString()}", Toast.LENGTH_LONG).show()
    }
}