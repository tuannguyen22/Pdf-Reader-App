package com.example.pdfbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnVer: Button
    private lateinit var btnHor: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVer = findViewById(R.id.showBtn)
        btnVer.setOnClickListener {
            val intent = Intent(this, VerticalView::class.java)
            startActivity(intent)
        }
        btnHor = findViewById(R.id.showBtn2)
        btnHor.setOnClickListener {
            val intent2 = Intent(this, HorizontalView::class.java)
            startActivity(intent2)
        }

    }
}