package com.example.button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondActbutton=findViewById<Button>(R.id.btnflights);
        secondActbutton.setOnClickListener{
            val Intent = Intent(this,SecondActivity::class.java)
            startActivity(Intent)
        }
    }


}