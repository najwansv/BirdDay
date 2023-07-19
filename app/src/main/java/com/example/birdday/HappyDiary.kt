package com.example.birdday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class HappyDiary : AppCompatActivity() {

    private lateinit var ref: DatabaseReference
    private val itemList: ArrayList<String> = ArrayList()
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_diary)

        val listView = findViewById<ListView>(R.id.happyList)
        adapter = ArrayAdapter(this, R.layout.custom_list, itemList)
        listView.adapter = adapter

        ref = FirebaseDatabase.getInstance().getReference("Happy")

        ref.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                itemList.clear()
                val dataCount = snapshot.childrenCount.toInt()
                var index = 0;

                for (data in snapshot.children) {
                    val date = data.child("id").getValue(String::class.java)
                    val why = data.child("why").getValue(String::class.java)

                    if (index < dataCount - 1) {
                        itemList.add("Date: $date\n\n$why\n")
                    }
                    index++
                }
                adapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@HappyDiary, "Error", Toast.LENGTH_SHORT).show()
            }
        })
    }


    fun backToMain(view: View) {
        finish()
    }
}