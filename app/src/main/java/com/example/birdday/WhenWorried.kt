package com.example.birdday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WhenWorried : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_worried)

        val chatBtn = findViewById<View>(R.id.chatButton)
        chatBtn.setOnClickListener {
            val phoneNumber = "62 81293378651"
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

    fun backToMain(view: View) {
        finishAfterTransition()
    }
}