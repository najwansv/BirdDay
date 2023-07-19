package com.example.birdday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class UsDiary : AppCompatActivity() {

    private lateinit var refHappy: DatabaseReference
    private lateinit var refSad: DatabaseReference

    private val db = realtimeDatabase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_us_diary)

        refHappy = FirebaseDatabase.getInstance().getReference("Diary/Happy")
        refSad = FirebaseDatabase.getInstance().getReference("Diary/Sad")
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }

    fun HappyDiary(view: View) {
        val intent = Intent(this, HappyDiary::class.java)
        startActivity(intent)
        db.getCount(refHappy){ count ->
            db.saveCount(refHappy, count+1)
        }
    }

    fun SadDiary(view: View) {
        val intent = Intent(this, SadDiary::class.java)
        startActivity(intent)
        db.getCount(refSad){ count ->
            db.saveCount(refSad, count+1)
        }
    }
}