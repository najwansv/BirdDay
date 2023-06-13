package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class JawabanBenarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jawaban_benar)

        Handler().postDelayed({
            finish()
        }, 5000)
    }
}