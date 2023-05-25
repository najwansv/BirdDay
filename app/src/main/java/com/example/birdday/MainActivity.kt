package com.example.birdday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        songStorage(this).initializeFirebaseApp()
        songStorage(this).initializeFirebaseStorage()
    }
    fun safePlace(view: View) {
        val intent = Intent(this, safePlace::class.java)
        startActivity(intent)
    }
}