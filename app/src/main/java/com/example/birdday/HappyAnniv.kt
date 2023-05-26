package com.example.birdday

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer

class HappyAnniv : AppCompatActivity() {
    private var song = SongStorage(this)
    private lateinit var player: ExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_anniv)
        player = ExoPlayer.Builder(this).build()
    }

    fun backToMain(view: View) {
        finish()
    }

    fun playASong(view: View){
        val filePath = "Til Death Do Us Part.mp3"
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

    override fun onDestroy() {
        super.onDestroy()
        // Release the player
        player.release()
    }
}