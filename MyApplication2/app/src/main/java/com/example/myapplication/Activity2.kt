package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Activity2 : AppCompatActivity() {

    lateinit var searchShow:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        searchShow = findViewById(R.id.searchShow)
        val homeBtn: ImageButton = findViewById(R.id.homeBtn)
        val listBtn: ImageButton = findViewById(R.id.listBtn)
        val searchBtn: ImageButton = findViewById(R.id.searchBtn)
        val recomendationsBtn: ImageButton = findViewById(R.id.recomendationsBtn)

        homeBtn.setOnClickListener {
            inHome()
        }

        listBtn.setOnClickListener {
            goToList()
        }

        searchBtn.setOnClickListener {
            Search()
        }

        recomendationsBtn.setOnClickListener {
            goToRecomendations()
        }
    }

    fun inHome() {
        Toast.makeText(this, "You are already in Home Page!", Toast.LENGTH_LONG).show()
    }

    fun goToList() {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }

    fun Search(){
        Toast.makeText(this, "Showing search results for ${searchShow.text.toString()}", Toast.LENGTH_LONG).show()
    }

    fun goToRecomendations(){
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}