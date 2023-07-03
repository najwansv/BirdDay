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

    fun whenLonely(view: View){
        val lonelyImage = findViewById<ImageView>(R.id.whenLonelyImage)
        val intent11 = Intent(this, WhenLonely::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, lonelyImage, ViewCompat.getTransitionName(lonelyImage)!!
        )
        startActivity(intent11, options.toBundle())
        println("When Lonely Card Clicked")
    }

    fun whenCompliment(view: View){
        val complimentImage = findViewById<ImageView>(R.id.whenComplimentImage)
        val intent12 = Intent(this, WhenCompliment::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, complimentImage, ViewCompat.getTransitionName(complimentImage)!!
        )
        startActivity(intent12, options.toBundle())
        println("When Compliment Card Clicked")
    }
//
//    fun whenMiss(view: View){
//        val missImage = findViewById<ImageView>(R.id.whenMissImage)
//        val intent13 = Intent(this, WhenMiss::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, missImage, ViewCompat.getTransitionName(missImage)!!
//        )
//        startActivity(intent13, options.toBundle())
//        println("When Miss Card Clicked")
//    }
//
//    fun whenFrustate(view: View){
//        val frustateImage = findViewById<ImageView>(R.id.whenFrustateImage)
//        val intent14 = Intent(this, WhenFrustate::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, frustateImage, ViewCompat.getTransitionName(frustateImage)!!
//        )
//        startActivity(intent14, options.toBundle())
//        println("When Frustate Card Clicked")
//    }
//
//    fun whenSick(view: View){
//        val sickImage = findViewById<ImageView>(R.id.whenSickImage)
//        val intent15 = Intent(this, WhenSick::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, sickImage, ViewCompat.getTransitionName(sickImage)!!
//        )
//        startActivity(intent15, options.toBundle())
//        println("When Sick Card Clicked")
//    }
//
//    fun whenCantSleep(view: View){
//        val cantSleepImage = findViewById<ImageView>(R.id.whenCantSleepImage)
//        val intent16 = Intent(this, WhenCantSleep::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, cantSleepImage, ViewCompat.getTransitionName(cantSleepImage)!!
//        )
//        startActivity(intent16, options.toBundle())
//        println("When Can't Sleep Card Clicked")
//    }
//
//    fun whenWorried(view: View){
//        val worriedImage = findViewById<ImageView>(R.id.whenWorriedImage)
//        val intent17 = Intent(this, WhenWorried::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, worriedImage, ViewCompat.getTransitionName(worriedImage)!!
//        )
//        startActivity(intent17, options.toBundle())
//        println("When Worried Card Clicked")
//    }
//
//    fun whenInsecure(view: View){
//        val insecureImage = findViewById<ImageView>(R.id.whenInsecureImage)
//        val intent18 = Intent(this, WhenInsecure::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, insecureImage, ViewCompat.getTransitionName(insecureImage)!!
//        )
//        startActivity(intent18, options.toBundle())
//        println("When Insecure Card Clicked")
//    }
//
//    fun whenBored(view: View){
//        val boredImage = findViewById<ImageView>(R.id.whenBoredImage)
//        val intent19 = Intent(this, WhenBored::class.java)
//        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
//            this@MainActivity, boredImage, ViewCompat.getTransitionName(boredImage)!!
//        )
//        startActivity(intent19, options.toBundle())
//        println("When Bored Card Clicked")
//    }
}