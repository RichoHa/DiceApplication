package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice(6)
        println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

        //Extra Task
        val mySecondDice = Dice(20)
        println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")
    }

    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}
//TODO Give your Dice class another attribute of color and create multiple instances of dice with different numbers of sides and colors!
//to include an additional attribute, include "val colour: String" in the Dice attributes and include the additional colour when creating an instance of Dice.
//e.g. "val mySecondDice = Dice(20, "White")" note all instances will have to include an additional attribute.