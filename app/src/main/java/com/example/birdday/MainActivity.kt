package com.example.birdday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SongStorage(this).initializeFirebaseApp()
        SongStorage(this).initializeFirebaseStorage()
    }
    fun safePlaceCard(view: View) {
        val intent1 = Intent(this, SafePlace::class.java)
        startActivity(intent1)
        println("Safe Place Card Clicked")
    }

    fun happyAnnivCard(view: View) {
        val intent2 = Intent(this, HappyAnniv::class.java)
        startActivity(intent2)
        println("Happy Anniversary Card Clicked")
    }

    fun whatASurpriseCard(view: View) {
        val intent3 = Intent(this, whatASurprise::class.java)
        startActivity(intent3)
        println("What a Surprise Card Clicked")
    }
    fun crazyNightCard(view: View) {
        val intent4 = Intent(this, crazyNight::class.java)
        startActivity(intent4)
        println("Crazy Night Card Clicked")
    }

    fun nCard(view: View) {
        val intent5 = Intent(this, N::class.java)
        startActivity(intent5)
        println("N Card Clicked")
    }

    fun usCard(view: View) {
        val intent6 = Intent(this, Us::class.java)
        startActivity(intent6)
        println("Us Card Clicked")
    }
}