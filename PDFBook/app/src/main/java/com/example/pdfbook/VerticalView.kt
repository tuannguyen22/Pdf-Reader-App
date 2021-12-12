package com.example.pdfbook


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class  VerticalView : AppCompatActivity() {
    private lateinit var pdfview: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        pdfview = findViewById(R.id.pdfView)
        pdfview.fromAsset("mastering_kotlin.pdf")
            .pages(0,4,9,14,19)
            .load()

    }



}