package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun rollDice() {
            val dice = Dice(6)
            val diceRoll = dice.roll()
            val diceImage: ImageView = findViewById(R.id.imageView)

            when (diceRoll) {
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                6 -> diceImage.setImageResource(R.drawable.dice_6)
            }

        }

        val btnRoll = findViewById<Button>(R.id.roll)

            btnRoll.setOnClickListener {
                rollDice()
            }

//        when (rollResult) {
//            luckyNumber -> println("You won!")
//            1 -> println("So sorry! You rolled a 1. Try again!")
//            2 -> println("Sadly, you rolled a 2. Try again!")
//            3 -> println("Unfortunately, you rolled a 3. Try again!")
//            5 -> println("Don't cry! You rolled a 5. Try again!")
//            6 -> println("Apologies! You rolled a 6. Try again!")
//        }

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

//TODO Create a Coin class, give it the ability to flip, create an instance of the class and flip some coins! How would you use the random() function with a range to accomplish the coin flip?
//reduce the range to two and depending on 1 or 2, create an if function to return heads or tail instead.