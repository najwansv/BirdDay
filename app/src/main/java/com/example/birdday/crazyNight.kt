package com.example.birdday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer

class crazyNight : AppCompatActivity() {
    private var song = SongStorage(this)
    private lateinit var player: ExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crazy_night)
        player = ExoPlayer.Builder(this).build()
    }

    fun backToMain(view: View) {
        finishAfterTransition()
    }

    fun playASong(view: View){
        val filePath = "Versace on the Floor.mp3"
        song.playSong(filePath,
            onSuccess = { audioFileUrl ->
                // Prepare ExoPlayer with MediaSource
                val audioUri = Uri.parse(audioFileUrl)
                // Build the media item.
                val mediaItem = MediaItem.fromUri(audioUri)

                player.setMediaItem(mediaItem)
                player.prepare()
                player.play()
            },
            onFailure = { exception ->

            }
        )
    }

    fun answer1(view: View) {
//        Toast.makeText(this, "jawaban benar", Toast.LENGTH_SHORT).show()
        Handler().postDelayed({
            val intent = Intent(this, JawabanBenarActivity::class.java)
            startActivity(intent)
        }, 500)
    }

    fun answer2(view: View) {
        Handler().postDelayed({
            val intent = Intent(this, JawabanSalahActivity::class.java)
            startActivity(intent)
        }, 500)

    }

    fun answer3(view: View) {
        Handler().postDelayed({
            val intent = Intent(this, JawabanSalahActivity::class.java)
            startActivity(intent)
        }, 500)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Release the player
        player.release()
    }
}