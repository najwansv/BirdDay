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
}