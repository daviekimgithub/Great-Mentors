package com.example.greatmentors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val button = findViewById<AppCompatButton>(R.id.next_btn)

        button.setOnClickListener {
            val intent = Intent(this, FindMentor::class.java)
            startActivity(intent)
        }
    }
}