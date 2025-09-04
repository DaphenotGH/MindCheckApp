package com.example.mindcheck

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mindcheck.R.id.flashcardquestion1
import com.example.mindcheck.R.id.reponse1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val flashcardQuestion = findViewById<TextView>(R.id.flashcardquestion1)
        val flashcardAnswer = findViewById<TextView>(R.id.reponse1)
        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }
    }
}

