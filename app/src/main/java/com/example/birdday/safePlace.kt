package com.example.birdday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer

class safePlace : AppCompatActivity() {
    private var song = songStorage(this)
    private lateinit var player: ExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safe_place)


        player = ExoPlayer.Builder(this).build()


    }

    fun backToMain(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun playASong(view: View){
        val filePath = "My Chemical Romance - Disenchanted.mp3"
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
                // Handle any error that occurred while retrieving the URL
            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        // Release the player
        player.release()
    }
}