package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn = findViewById<Button>(R.id.btn)

        val textView = findViewById<TextView>(R.id.text)

        textView.text = intent.getStringExtra("name")

        btn.setOnClickListener {
            val resIntent = Intent()
            resIntent.putExtra("upperName",textView.text.toString().uppercase())

            setResult(Activity.RESULT_OK, resIntent)
            finish()
        }
    }
}