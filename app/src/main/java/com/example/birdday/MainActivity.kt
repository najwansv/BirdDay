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
        val intent = Intent(this, SafePlace::class.java)
        startActivity(intent)
    }

    fun happyAnnivCard(view: View) {
        val intent = Intent(this, HappyAnniv::class.java)
        startActivity(intent)
    }
}