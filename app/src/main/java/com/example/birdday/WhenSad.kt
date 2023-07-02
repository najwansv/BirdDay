package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class WhenSad : AppCompatActivity() {

    private lateinit var ref: DatabaseReference
    private lateinit var ref2: DatabaseReference
    val db = realtimeDatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_sad)
        ref = FirebaseDatabase.getInstance().getReference("Sad/sadCount")
        ref2 = FirebaseDatabase.getInstance().getReference("Sad")

        val count = findViewById<TextView>(R.id.sadCount)
        db.getCount(ref) { countValue ->
            count.text = countValue.toString()
        }
    }

    fun sadButton(view: View){
        val question = findViewById<EditText>(R.id.whySad)

        val questionText = findViewById<EditText>(R.id.whySad).text.toString()
        if (questionText.isEmpty()){
            findViewById<EditText>(R.id.whySad).error = "Di isi dulu ayangg"
            return
        } else {
            val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")
            val sekarang = LocalDateTime.now().format(formatter)
            db.saveQuestion(ref2, questionText, sekarang.toString())
            question.setText("")

            val count = findViewById<TextView>(R.id.sadCount)
            val countInt = count.text.toString().toInt()
            count.text = (countInt + 1).toString()
            db.saveCount(ref, countInt + 1)
        }
    }

    fun backToMain(view: View){
        finishAfterTransition()
    }
}