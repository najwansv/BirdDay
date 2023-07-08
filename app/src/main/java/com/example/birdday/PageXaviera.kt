package com.example.birdday

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2

class PageXaviera : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_xaviera)

        Toast.makeText(this, "u can slide the image!", Toast.LENGTH_SHORT).show()

        val viewPager = findViewById<ViewPager2>(R.id.gambarAyangPage)

        viewPager.apply {
            clipChildren = false  // No clipping the left and right items
            clipToPadding = false  // Show the viewpager in full width without clipping the padding
            offscreenPageLimit = 3  // Render the left and right items
            (getChildAt(0) as RecyclerView).overScrollMode =
                RecyclerView.OVER_SCROLL_NEVER // Remove the scroll effect
        }

        val carouselDataList = ArrayList<Int>()
        carouselDataList.add(R.drawable.ayang1)
        carouselDataList.add(R.drawable.ayang_flower)
        carouselDataList.add(R.drawable.ayang_picnic)
        carouselDataList.add(R.drawable.ayang_dimsum)
        carouselDataList.add(R.drawable.ayang_1)
        carouselDataList.add(R.drawable.ayang_2)
        carouselDataList.add(R.drawable.ayang_3)
        carouselDataList.add(R.drawable.ayang_4)
        carouselDataList.add(R.drawable.ayang_5)
        carouselDataList.add(R.drawable.ayang_6)
        carouselDataList.add(R.drawable.ayang_7)
        carouselDataList.add(R.drawable.ayang_8)
        carouselDataList.add(R.drawable.ayang_9)
        carouselDataList.add(R.drawable.ayang_10)
        carouselDataList.add(R.drawable.ayang_11)
        carouselDataList.add(R.drawable.ayang_12)
        carouselDataList.add(R.drawable.ayang_13)
        carouselDataList.add(R.drawable.ayang_14)
        carouselDataList.add(R.drawable.ayang_15)
        carouselDataList.add(R.drawable.ayang_16)
        carouselDataList.add(R.drawable.ayang_17)
        carouselDataList.add(R.drawable.ayang_18)
        carouselDataList.add(R.drawable.ayang_19)
        carouselDataList.add(R.drawable.ayang_20)
        carouselDataList.add(R.drawable.ayang_21)
        carouselDataList.add(R.drawable.ayang_22)
        carouselDataList.add(R.drawable.ayang_23)
        carouselDataList.add(R.drawable.ayang_24)
        carouselDataList.add(R.drawable.ayang_25)
        carouselDataList.add(R.drawable.ayang_26)
        carouselDataList.add(R.drawable.ayang_27)

        viewPager.adapter = Carousel(carouselDataList)

        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer((40 * Resources.getSystem().displayMetrics.density).toInt()))
        compositePageTransformer.addTransformer { page, position ->
            val r = 1 - kotlin.math.abs(position)
            page.scaleY = (0.80f + r * 0.20f)
        }
        viewPager.setPageTransformer(compositePageTransformer)
    }

    fun backToMain(view: View) {
        finish()
    }
}