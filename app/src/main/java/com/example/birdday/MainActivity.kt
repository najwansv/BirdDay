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
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    private lateinit var refSafeplace: DatabaseReference
    private lateinit var refAnniv: DatabaseReference
    private lateinit var refSurprise: DatabaseReference
    private lateinit var refCrazy: DatabaseReference
    private lateinit var refN: DatabaseReference
    private lateinit var refUs: DatabaseReference

    private lateinit var refXaviera: DatabaseReference
    private lateinit var refNajwan: DatabaseReference
    private lateinit var refDiary: DatabaseReference

    private lateinit var refHappy: DatabaseReference
    private lateinit var refSad: DatabaseReference
    private lateinit var refLonely: DatabaseReference
    private lateinit var refCompliment: DatabaseReference
    private lateinit var refMiss: DatabaseReference
    private lateinit var refFrustate: DatabaseReference
    private lateinit var refSick: DatabaseReference
    private lateinit var refCantSleep: DatabaseReference
    private lateinit var refWorried: DatabaseReference
    private lateinit var refInsecure: DatabaseReference

    private val db = realtimeDatabase()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        refSafeplace = FirebaseDatabase.getInstance().getReference("Card/safePlace")
        refAnniv = FirebaseDatabase.getInstance().getReference("Card/Anniv")
        refSurprise = FirebaseDatabase.getInstance().getReference("Card/Surprise")
        refCrazy = FirebaseDatabase.getInstance().getReference("Card/Crazy")
        refN = FirebaseDatabase.getInstance().getReference("Card/N")
        refUs = FirebaseDatabase.getInstance().getReference("Card/Us")

        refXaviera = FirebaseDatabase.getInstance().getReference("justUs/Xaviera")
        refNajwan = FirebaseDatabase.getInstance().getReference("justUs/Najwan")
        refDiary = FirebaseDatabase.getInstance().getReference("justUs/Diary")

        refHappy = FirebaseDatabase.getInstance().getReference("When/Happy")
        refSad = FirebaseDatabase.getInstance().getReference("When/Sad")
        refLonely = FirebaseDatabase.getInstance().getReference("When/Lonely")
        refCompliment = FirebaseDatabase.getInstance().getReference("When/Compliment")
        refMiss = FirebaseDatabase.getInstance().getReference("When/Miss")
        refFrustate = FirebaseDatabase.getInstance().getReference("When/Frustate")
        refSick = FirebaseDatabase.getInstance().getReference("When/Sick")
        refCantSleep = FirebaseDatabase.getInstance().getReference("When/CantSleep")
        refWorried = FirebaseDatabase.getInstance().getReference("When/Worried")
        refInsecure = FirebaseDatabase.getInstance().getReference("When/Insecure")

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
        db.getCount(refSafeplace) { countValue ->
            db.saveCount(refSafeplace, countValue + 1)
        }
    }

    fun happyAnnivCard(view: View) {
        
        val annivImage = findViewById<ImageView>(R.id.annivImage)
        val intent2 = Intent(this, HappyAnniv::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, annivImage, ViewCompat.getTransitionName(annivImage)!!
        )
        startActivity(intent2, options.toBundle())
        println("Happy Anniversary Card Clicked")
        db.getCount(refAnniv) { countValue ->
            db.saveCount(refAnniv, countValue + 1)
        }
    }

    fun whatASurpriseCard(view: View) {
        val surpriseImage = findViewById<ImageView>(R.id.surpriseImage)
        val intent3 = Intent(this, whatASurprise::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, surpriseImage, ViewCompat.getTransitionName(surpriseImage)!!
        )
        startActivity(intent3, options.toBundle())
        println("What a Surprise Card Clicked")
        db.getCount(refSurprise) { countValue ->
            db.saveCount(refSurprise, countValue + 1)
        }
    }
    fun crazyNightCard(view: View) {
        val crazyNightImage = findViewById<ImageView>(R.id.crazyNightImage)
        val intent4 = Intent(this, crazyNight::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, crazyNightImage, ViewCompat.getTransitionName(crazyNightImage)!!
        )
        startActivity(intent4, options.toBundle())
        println("Crazy Night Card Clicked")
        db.getCount(refCrazy) { countValue ->
            db.saveCount(refCrazy, countValue + 1)
        }
    }

    fun nCard(view: View) {
        val nImage = findViewById<ImageView>(R.id.nImage)
        val intent5 = Intent(this, N::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, nImage, ViewCompat.getTransitionName(nImage)!!
        )
        startActivity(intent5, options.toBundle())
        println("N Card Clicked")
        db.getCount(refN) { countValue ->
            db.saveCount(refN, countValue + 1)
        }
    }

    fun usCard(view: View) {
        val usImage = findViewById<ImageView>(R.id.usImage)
        val intent6 = Intent(this, Us::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, usImage, ViewCompat.getTransitionName(usImage)!!
        )
        startActivity(intent6, options.toBundle())
        println("Us Card Clicked")
        db.getCount(refUs) { countValue ->
            db.saveCount(refUs, countValue + 1)
        }
    }

    fun xavieraSayang(view: View){
        val intent7 = Intent(this, PageXaviera::class.java)
        startActivity(intent7)
        db.getCount(refXaviera) { countValue ->
            db.saveCount(refXaviera, countValue + 1)
        }
    }

    fun najwanSayang(view: View){
        val intent8 = Intent(this, PageNajwan::class.java)
        startActivity(intent8)
        db.getCount(refNajwan) { countValue ->
            db.saveCount(refNajwan, countValue + 1)
        }
    }

    fun UsDiary(view: View){
        val intent11 = Intent(this, UsDiary::class.java)
        startActivity(intent11)
        db.getCount(refDiary) { countValue ->
            db.saveCount(refDiary, countValue + 1)
        }
    }

    fun whenHappy(view: View){
        val happyImage = findViewById<ImageView>(R.id.whenHappyImage)
        val intent9 = Intent(this, WhenHappy::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, happyImage, ViewCompat.getTransitionName(happyImage)!!
        )
        startActivity(intent9, options.toBundle())
        println("When Happy Card Clicked")
        db.getCount(refHappy) { countValue ->
            db.saveCount(refHappy, countValue + 1)
        }
    }

    fun whenSad(view: View){
        val sadImage = findViewById<ImageView>(R.id.whenSadImage)
        val intent10 = Intent(this, WhenSad::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, sadImage, ViewCompat.getTransitionName(sadImage)!!
        )
        startActivity(intent10, options.toBundle())
        println("When Sad Card Clicked")
        db.getCount(refSad) { countValue ->
            db.saveCount(refSad, countValue + 1)
        }
    }

    fun whenLonely(view: View){
        val lonelyImage = findViewById<ImageView>(R.id.whenLonelyImage)
        val intent11 = Intent(this, WhenLonely::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, lonelyImage, ViewCompat.getTransitionName(lonelyImage)!!
        )
        startActivity(intent11, options.toBundle())
        println("When Lonely Card Clicked")
        db.getCount(refLonely) { countValue ->
            db.saveCount(refLonely, countValue + 1)
        }
    }

    fun whenCompliment(view: View){
        val complimentImage = findViewById<ImageView>(R.id.whenComplimentImage)
        val intent12 = Intent(this, WhenCompliment::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, complimentImage, ViewCompat.getTransitionName(complimentImage)!!
        )
        startActivity(intent12, options.toBundle())
        println("When Compliment Card Clicked")
        db.getCount(refCompliment) { countValue ->
            db.saveCount(refCompliment, countValue + 1)
        }
    }

    fun whenMiss(view: View){
        val missImage = findViewById<ImageView>(R.id.whenMissImage)
        val intent13 = Intent(this, WhenMiss::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, missImage, ViewCompat.getTransitionName(missImage)!!
        )
        startActivity(intent13, options.toBundle())
        println("When Miss Card Clicked")
        db.getCount(refMiss) { countValue ->
            db.saveCount(refMiss, countValue + 1)
        }
    }

    fun whenFrustate(view: View){
        val frustateImage = findViewById<ImageView>(R.id.whenFrustateImage)
        val intent14 = Intent(this, WhenFrustate::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, frustateImage, ViewCompat.getTransitionName(frustateImage)!!
        )
        startActivity(intent14, options.toBundle())
        println("When Frustate Card Clicked")
        db.getCount(refFrustate) { countValue ->
            db.saveCount(refFrustate, countValue + 1)
        }
    }

    fun whenSick(view: View){
        val sickImage = findViewById<ImageView>(R.id.whenSickImage)
        val intent15 = Intent(this, WhenSick::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, sickImage, ViewCompat.getTransitionName(sickImage)!!
        )
        startActivity(intent15, options.toBundle())
        println("When Sick Card Clicked")
        db.getCount(refSick) { countValue ->
            db.saveCount(refSick, countValue + 1)
        }
    }

    fun whenCantSleep(view: View){
        val cantSleepImage = findViewById<ImageView>(R.id.whenCantSleepImage)
        val intent16 = Intent(this, WhenCantSleep::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, cantSleepImage, ViewCompat.getTransitionName(cantSleepImage)!!
        )
        startActivity(intent16, options.toBundle())
        println("When Can't Sleep Card Clicked")
        db.getCount(refCantSleep) { countValue ->
            db.saveCount(refCantSleep, countValue + 1)
        }
    }

    fun whenWorried(view: View){
        val worriedImage = findViewById<ImageView>(R.id.whenWorriedImage)
        val intent17 = Intent(this, WhenWorried::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, worriedImage, ViewCompat.getTransitionName(worriedImage)!!
        )
        startActivity(intent17, options.toBundle())
        println("When Worried Card Clicked")
        db.getCount(refWorried) { countValue ->
            db.saveCount(refWorried, countValue + 1)
        }
    }

    fun whenInsecure(view: View){
        val insecureImage = findViewById<ImageView>(R.id.whenInsecureImage)
        val intent18 = Intent(this, WhenInsecure::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
            this@MainActivity, insecureImage, ViewCompat.getTransitionName(insecureImage)!!
        )
        startActivity(intent18, options.toBundle())
        println("When Insecure Card Clicked")
        db.getCount(refInsecure) { countValue ->
            db.saveCount(refInsecure, countValue + 1)
        }
    }

}