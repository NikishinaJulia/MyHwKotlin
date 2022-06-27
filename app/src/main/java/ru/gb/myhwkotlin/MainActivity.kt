package ru.gb.myhwkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var closeMe: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        closeMe = findViewById(R.id.close_me)
        textView = findViewById(R.id.textView)


        closeMe.setOnClickListener {
            Log.i("MainActivity", "Hello World")
            textView.text = ""
            for(i in 10 downTo 1 step 2) {
                textView.append("Hello Kotlin!")
            }
        }
    }
}