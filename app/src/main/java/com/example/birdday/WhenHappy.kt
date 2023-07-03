package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class WhenHappy : AppCompatActivity() {

    private lateinit var ref: DatabaseReference
    private val db = realtimeDatabase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_happy)

        ref = FirebaseDatabase.getInstance().getReference("Happy/happyCount")

        val count = findViewById<TextView>(R.id.happyCount)
        db.getCount(ref) { countValue ->
            count.text = countValue.toString()
        }
    }

    fun addOne(view: View) {
        val count = findViewById<TextView>(R.id.happyCount)
        val countInt = count.text.toString().toInt()
        count.text = (countInt + 1).toString()
        db.saveCount(ref, countInt + 1)
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }

}