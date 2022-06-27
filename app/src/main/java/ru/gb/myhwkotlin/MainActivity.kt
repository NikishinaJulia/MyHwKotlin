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
            test()
        }

        val person = Person("Misha", 23 )


        fun somePerson() {
            textView.append(person.firstName)
            textView.append(" ")
            textView.append(person.someVal.toString())
        }

        somePerson();

    }

    fun test() {
        val person = Person("Misha", 23 )
        val human = person.copy()
        Log.i("MainActivity", human.toString())
        val personList: List<Person> = arrayListOf(person, Person("Oleg", 43))
        for (personVal in personList) {
            Log.i("MainActivity1",personVal.firstName)
        }

        for (i in 1..10) {
            Log.i("MainActivity2","Hello Kotlin!")
        }

        for (i in 10 downTo 1 step 2) {
            Log.i("MainActivity3","Hello Kotlin!")
        }

        for (i in 0 until personList.size) {
            Log.i("MainActivity4", personList[i].age.toString())
        }


    }
}