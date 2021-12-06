package com.project.secondapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
private const val HELLO_KEY = "HELLO"
lateinit var nextActivityButton: Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.button_new_text)

        nextActivityButton.setOnClickListener {
            val secondActivityIntent:Intent = Intent(this,SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY,"Hello from MainActivity")
            startActivity(secondActivityIntent)
        }

        nextActivityButton.setOnClickListener {
            val googleLink = Uri.parse("https://google.com")
            val openBrowserIntent:Intent = Intent(Intent.ACTION_VIEW,googleLink)
            startActivity(openBrowserIntent)
        }


    }

}