package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class WhenCompliment : AppCompatActivity() {

    private lateinit var ref: DatabaseReference
    private val db = realtimeDatabase()

    private var udahBaca = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_compliment)

        ref = FirebaseDatabase.getInstance().getReference("Compliment/complimentCount")
        val count = findViewById<TextView>(R.id.readCount)
        db.getCount(ref) { countValue ->
            count.text = countValue.toString()
        }
    }

    fun addOne(view: View) {
        if (udahBaca == 0) {
            val count = findViewById<TextView>(R.id.readCount)
            val countInt = count.text.toString().toInt()
            count.text = (countInt + 1).toString()
            db.saveCount(ref, countInt + 1)
            udahBaca = 1
        } else {
            Toast.makeText(this, "pencetnya sekali aja kalii😅, kan udah bacaa", Toast.LENGTH_LONG).show()
        }
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }
}