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

    fun saveCount(count: Int){
        ref = FirebaseDatabase.getInstance().getReference("Happy/happyCount")
        ref.setValue(count)
    }

    fun getCount(callback: (Int) -> Unit) {
        ref = FirebaseDatabase.getInstance().getReference("Happy/happyCount")
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

}
