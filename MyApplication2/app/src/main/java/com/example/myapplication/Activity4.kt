package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val homeBtnRecspg: ImageButton = findViewById(R.id.homeBtnRecspg)
        val listBtnRecspg: ImageButton = findViewById(R.id.listBtnRecspg)
        val recomendationsBtnRecspg: ImageButton = findViewById(R.id.recommendationsBtnRecspg)

        homeBtnRecspg.setOnClickListener {
            goToHome()
        }

        listBtnRecspg.setOnClickListener {
            goToList()
        }

        recomendationsBtnRecspg.setOnClickListener {
            inRecomendations()
        }
    }

    fun goToHome() {
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

    fun goToList() {
        val intent = Intent(this, Activity3::class.java)
        startActivity(intent)
    }

    fun inRecomendations(){
        Toast.makeText(this, "You are already in Recommendations Page!", Toast.LENGTH_LONG).show()
    }
}