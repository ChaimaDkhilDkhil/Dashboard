package com.example.button

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Flights>
    private val imageIds = arrayOf(
        R.drawable.turkie,
        R.drawable.italie,
        R.drawable.london,
        R.drawable.allmagne,
        R.drawable.bali,
        R.drawable.espagne,
        R.drawable.japan,
        R.drawable.france
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        newRecyclerView = findViewById(R.id.RecycleView) // Correct the ID to match your XML
        newRecyclerView.layoutManager = LinearLayoutManager(this) // Use lowercase "layoutManager"
        newRecyclerView.setHasFixedSize(true)
        newArrayList = ArrayList()

        for (i in imageIds.indices) {
            val flight = Flights(imageIds[i])
            newArrayList.add(flight)
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}
