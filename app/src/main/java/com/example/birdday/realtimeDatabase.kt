package com.example.birdday

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class realtimeDatabase {

    private lateinit var ref: DatabaseReference

    fun saveCount(ref: DatabaseReference, count: Int) {
        ref.setValue(count)
    }

    fun getCount(ref: DatabaseReference, callback: (Int) -> Unit) {
        ref.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val count = dataSnapshot.getValue(Int::class.java) ?: 0
                callback(count)
            }

            override fun onCancelled(databaseError: DatabaseError) {
                println("Error")
                callback(0) // Provide a default value or handle the error case
            }
        })
    }

    fun saveQuestion(ref: DatabaseReference, question: String, kapan: String) {
        val sadID = kapan
        val sad = Sad(sadID, question)
        ref.child(sadID).setValue(sad).addOnCompleteListener {
            println("Success")
        }
    }

}