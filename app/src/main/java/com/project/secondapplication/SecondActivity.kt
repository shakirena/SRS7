package com.project.secondapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
private const val HELLO_KEY = "hello"
lateinit var helloTextView: TextView
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        helloTextView = findViewById(R.id.hello_word_text)

        val helloValue:String? = intent.extras?.getString(HELLO_KEY)
        helloTextView.text = helloValue
    }
}