package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class JawabanSalahActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jawaban_salah)

        Handler().postDelayed({
            finish()
        }, 5000)
    }
}