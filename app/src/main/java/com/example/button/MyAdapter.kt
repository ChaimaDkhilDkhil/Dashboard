package com.example.button

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(private val flightsList :ArrayList<Flights>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val flightsView = LayoutInflater.from(parent.context).inflate(R.layout.activity_second,parent,false)
        return MyViewHolder(flightsView)
    }

    override fun getItemCount(): Int {
        return flightsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val currentItem = flightsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
    }
    class MyViewHolder(flightView : View) :RecyclerView.ViewHolder(flightView){
        val titleImage : ShapeableImageView = flightView.findViewById(R.id.title_image)
        val tvHeading : TextView = flightView.findViewById(R.id.tvHeading)


    }
}