package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WhenFrustate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_frustate)
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }
}