package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class WhenHappy : AppCompatActivity() {

    private lateinit var ref: DatabaseReference
    private lateinit var ref2: DatabaseReference
    private val db = realtimeDatabase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_happy)

        ref = FirebaseDatabase.getInstance().getReference("Happy/happyCount")
        ref2 = FirebaseDatabase.getInstance().getReference("Happy")

        val count = findViewById<TextView>(R.id.happyCount)
        db.getCount(ref) { countValue ->
            count.text = countValue.toString()
        }
    }

    fun addOne(view: View) {
        val whyHappy = findViewById<EditText>(R.id.whyHappy)

        val whyText = findViewById<EditText>(R.id.whyHappy).text.toString()

        if (whyText.isEmpty()) {
            findViewById<EditText>(R.id.whyHappy).error = "Di isi dulu ayangg"
            return
        } else {
            val formatter = java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
            val sekarang = java.util.Calendar.getInstance().time
            db.saveQuestion(ref2, whyText, formatter.format(sekarang).toString())
            whyHappy.setText("")
            val count = findViewById<TextView>(R.id.happyCount)
            val countInt = count.text.toString().toInt()
            count.text = (countInt + 1).toString()
            db.saveCount(ref, countInt + 1)
        }
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }

}