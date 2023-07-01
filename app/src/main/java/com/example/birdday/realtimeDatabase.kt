package com.example.birdday

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class realtimeDatabase {

    private lateinit var ref: DatabaseReference

    fun saveCount(count: Int){
        ref = FirebaseDatabase.getInstance().getReference("Happy/happyCount")
        ref.setValue(count)
    }

    fun getCount(): Int{
        var count = 0
        ref = FirebaseDatabase.getInstance().getReference("Happy/happyCount")
        ref.get().addOnSuccessListener {
            count = it.getValue(Int::class.java)!!
        }.addOnFailureListener{
            println("Error")
        }
        return count
    }



}
