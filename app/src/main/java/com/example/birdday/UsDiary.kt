package com.example.birdday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class UsDiary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_us_diary)
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }

    fun HappyDiary(view: View) {
        val intent = Intent(this, WhenHappy::class.java)
        startActivity(intent)
    }

    fun SadDiary(view: View) {
        val intent = Intent(this, SadDiary::class.java)
        startActivity(intent)
    }
}