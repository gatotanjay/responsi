package com.example.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class halaman : AppCompatActivity() {
    private lateinit var img: ImageView
    private lateinit var img2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman)
        img = findViewById(R.id.gitar_akustik)
        img2= findViewById(R.id.gitar_elektrik)
        img.setOnClickListener {
            startActivity(Intent(this, gitar_akustik::class.java))
        }
        img2.setOnClickListener {
            startActivity(Intent(this, gitar_elektrik::class.java))
        }
    }
}