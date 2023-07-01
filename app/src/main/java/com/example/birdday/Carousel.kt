package com.example.birdday

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class Carousel(private val carouselDataList: ArrayList<Int>) :
    RecyclerView.Adapter<Carousel.CarouselItemViewHolder>() {

    class CarouselItemViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselItemViewHolder {
        val viewHolder = LayoutInflater.from(parent.context).inflate(R.layout.xaviera_carousel, parent, false)
        return CarouselItemViewHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: CarouselItemViewHolder, position: Int) {
        val imageView = holder.itemView.findViewById<ImageView>(R.id.carouselAyang1)
        imageView.setImageResource(carouselDataList[position])
    }

    override fun getItemCount(): Int {
        return carouselDataList.size
    }

}