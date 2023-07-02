package com.example.birdday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WhenLonely : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_lonely)

        val btnOpenWhatsApp: Button = findViewById(R.id.lonelyButton)
        btnOpenWhatsApp.setOnClickListener {
            val phoneNumber = "62 81293378651"
//            62 81293378651
//            62 82124494795
            // Open WhatsApp with the specific phone number
            openWhatsAppToNumber(phoneNumber)
        }

    }

    private fun openWhatsAppToNumber(number: String) {
        val packageManager = packageManager
        val intent = Intent(Intent.ACTION_VIEW)

        // Check if WhatsApp is installed on the device
        val url = "https://api.whatsapp.com/send?phone=$number"
        intent.data = Uri.parse(url)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // WhatsApp not installed, show an error message or redirect to Play Store
        }
    }

    fun backToMain(view: android.view.View) {
        finishAfterTransition()
    }

}