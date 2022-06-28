package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice()
        val diceRoll = myFirstDice.roll()
        println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")
    }

    class Dice {
        var sides = 6

        fun roll(): Int {
            val randomNumber = (1..6).random()
            return randomNumber
        }
    }
}