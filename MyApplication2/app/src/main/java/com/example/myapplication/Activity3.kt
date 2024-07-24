package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class Activity3 : AppCompatActivity() {

    lateinit var searchShowListpg: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        searchShowListpg = findViewById(R.id.searchShowListpg)
        val homeBtnListpg: ImageButton = findViewById(R.id.homeBtnListpg)
        val listBtnListpg: ImageButton = findViewById(R.id.listBtnListpg)
        val searchBtnListpg: ImageButton = findViewById(R.id.searchBtnListpg)
        val recomendationsBtnListpg: ImageButton = findViewById(R.id.recomendationsBtnListpg)

        homeBtnListpg.setOnClickListener {
            goToHome()
        }

        listBtnListpg.setOnClickListener {
            inList()
        }

        searchBtnListpg.setOnClickListener {
            Search()
        }

        recomendationsBtnListpg.setOnClickListener {
            goToRecomendations()
        }
    }

    fun goToHome() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    fun inList() {
        Toast.makeText(this, "You are already in Wish List Page!", Toast.LENGTH_LONG).show()
    }

    fun Search(){
        Toast.makeText(this, "Showing search results for ${searchShowListpg.text.toString()}", Toast.LENGTH_LONG).show()
    }

    fun goToRecomendations(){
        val intent = Intent(this, Activity4::class.java)
        startActivity(intent)
    }
}