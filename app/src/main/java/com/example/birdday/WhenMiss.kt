package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class WhenMiss : AppCompatActivity() {

    private lateinit var ref: DatabaseReference
    private val db = realtimeDatabase()
    var itungan = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_miss)

        ref = Firebase.database.getReference("Miss/missCount")
        val count = findViewById<TextView>(R.id.missCount)
        db.getCount(ref) { countValue ->
            count.text = countValue.toString()
        }
    }

    fun addOne(view: View) {
        val count = findViewById<TextView>(R.id.missCount)
        val countInt = count.text.toString().toInt()
        count.text = (countInt + 1).toString()
        db.saveCount(ref, countInt + 1)
        itungan += 1
        if (itungan == 10){
            Toast.makeText(this, "busett kalemm, kangen banget yahh ??", Toast.LENGTH_SHORT).show()
        } else if (itungan == 15){
            Toast.makeText(this, "iya iyaaa nanti ketemu yaahh", Toast.LENGTH_SHORT).show()
        }
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }




}