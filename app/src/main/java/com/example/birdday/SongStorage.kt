package com.example.birdday

import com.google.firebase.FirebaseApp
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import android.content.Context
import com.google.firebase.storage.FirebaseStorage

class SongStorage(private val context: Context) {

    private var storageRef = Firebase.storage.reference

    fun initializeFirebaseApp() {
        if (FirebaseApp.getApps(context).isEmpty()) {
            FirebaseApp.initializeApp(context)
        }
    }

    fun initializeFirebaseStorage() {
        storageRef = FirebaseStorage.getInstance().reference
    }

    fun playSong(filePath: String, onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit) {
        storageRef.child(filePath).downloadUrl.addOnSuccessListener { uri ->
            val audioFileUrl = uri.toString()
            println(audioFileUrl)
            onSuccess(audioFileUrl)
        }.addOnFailureListener { exception ->
            onFailure(exception)
        }
    }
}