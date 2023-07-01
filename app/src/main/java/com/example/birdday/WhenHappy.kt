package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class WhenHappy : AppCompatActivity() {
    val db = realtimeDatabase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_happy)
    }

    override fun onStart() {
        super.onStart()
        val count = findViewById<TextView>(R.id.happyCount)
        count.text = db.getCount().toString()
    }


    fun addOne(view: View) {
        val count = findViewById<TextView>(R.id.happyCount)
        val countInt = count.text.toString().toInt()
        count.text = (countInt + 1).toString()
        db.saveCount(countInt + 1)
    }

    fun backToMain(view: View) {
        finish()
    }

}