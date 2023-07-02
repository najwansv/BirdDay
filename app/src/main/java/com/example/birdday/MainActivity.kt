package com.example.birdday

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat


class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SongStorage(this).initializeFirebaseApp()
        SongStorage(this).initializeFirebaseStorage()
    }
    fun safePlaceCard(view: View) {
        val safePlaceImage = findViewById<ImageView>(R.id.safePlaceImage)
        val intent1 = Intent(this, SafePlace::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, safePlaceImage, ViewCompat.getTransitionName(safePlaceImage)!!
        )
        startActivity(intent1, options.toBundle())
        println("Safe Place Card Clicked")
    }

    fun happyAnnivCard(view: View) {
        
        val annivImage = findViewById<ImageView>(R.id.annivImage)
        val intent2 = Intent(this, HappyAnniv::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, annivImage, ViewCompat.getTransitionName(annivImage)!!
        )
        startActivity(intent2, options.toBundle())
        println("Happy Anniversary Card Clicked")
    }

    fun whatASurpriseCard(view: View) {
        val surpriseImage = findViewById<ImageView>(R.id.surpriseImage)
        val intent3 = Intent(this, whatASurprise::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, surpriseImage, ViewCompat.getTransitionName(surpriseImage)!!
        )
        startActivity(intent3, options.toBundle())
        println("What a Surprise Card Clicked")
    }
    fun crazyNightCard(view: View) {
        val crazyNightImage = findViewById<ImageView>(R.id.crazyNightImage)
        val intent4 = Intent(this, crazyNight::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, crazyNightImage, ViewCompat.getTransitionName(crazyNightImage)!!
        )
        startActivity(intent4, options.toBundle())
        println("Crazy Night Card Clicked")
    }

    fun nCard(view: View) {
        val nImage = findViewById<ImageView>(R.id.nImage)
        val intent5 = Intent(this, N::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, nImage, ViewCompat.getTransitionName(nImage)!!
        )
        startActivity(intent5, options.toBundle())
        println("N Card Clicked")
    }

    fun usCard(view: View) {
        val usImage = findViewById<ImageView>(R.id.usImage)
        val intent6 = Intent(this, Us::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, usImage, ViewCompat.getTransitionName(usImage)!!
        )
        startActivity(intent6, options.toBundle())
        println("Us Card Clicked")
    }

    fun xavieraSayang(view: View){
        val intent7 = Intent(this, PageXaviera::class.java)
        startActivity(intent7)
    }

    fun najwanSayang(view: View){
        val intent8 = Intent(this, PageNajwan::class.java)
        startActivity(intent8)
    }
    fun whenHappy(view: View){
        val happyImage = findViewById<ImageView>(R.id.whenHappyImage)
        val intent9 = Intent(this, WhenHappy::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, happyImage, ViewCompat.getTransitionName(happyImage)!!
        )
        startActivity(intent9, options.toBundle())
        println("When Happy Card Clicked")
    }

    fun whenSad(view: View){
        val sadImage = findViewById<ImageView>(R.id.whenSadImage)
        val intent10 = Intent(this, WhenSad::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, sadImage, ViewCompat.getTransitionName(sadImage)!!
        )
        startActivity(intent10, options.toBundle())
        println("When Sad Card Clicked")
    }
}