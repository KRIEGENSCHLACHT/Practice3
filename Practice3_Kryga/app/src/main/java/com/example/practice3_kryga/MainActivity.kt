package com.example.practice3_kryga

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView2)
        var editText: EditText = findViewById(R.id.editTextTextInputName)
        var imageButton: ImageButton = findViewById(R.id.imageButton)
        imageButton.setOnClickListener{
            if (editText.text.isEmpty()) {
                textView.text = "Здравствуй, друг!"
            }else{
                textView.text = "Здравствуй, " + editText.text
            }
        }
    }
}