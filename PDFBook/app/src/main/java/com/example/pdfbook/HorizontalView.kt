package com.example.pdfbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class HorizontalView : AppCompatActivity() {
    private lateinit var pdfview2: PDFView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horizontal_view)

        pdfview2 = findViewById(R.id.pdfView2)
        pdfview2.fromAsset("kotlin.pdf")
            .enableSwipe(true)
            .swipeHorizontal(true)
            .load()
    }
}