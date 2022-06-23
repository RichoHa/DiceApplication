package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main() {
        val myFirstDice = Dice()
        println(myFirstDice.sides)
        myFirstDice.roll()
    }

    class Dice{
        var sides = 6
        fun roll() {
            val randomNumber = (1..6).random()
            println(randomNumber)
        }
    }
}