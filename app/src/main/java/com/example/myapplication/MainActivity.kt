package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragOne = findViewById<Button>(R.id.frag_one)
        val fragTwo = findViewById<Button>(R.id.frag_two)



        fragOne.setOnClickListener {
            val fragManager = supportFragmentManager
            val transc = fragManager.beginTransaction()
            transc.replace(R.id.fragment, fragment1())
            transc.commit()
        }

        fragTwo.setOnClickListener {
            val fragManager = supportFragmentManager
            val transc = fragManager.beginTransaction()
            transc.replace(R.id.fragment, fragment2())
            transc.commit()
        }
    }

}