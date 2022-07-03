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

        val rollButton: Button = findViewById(R.id.roll)
        rollButton.setOnClickListener { rollDice() }

        // Do a dice roll when the app starts
        rollDice()

    }

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

/**
 * Roll the dice and update the screen with the result.
 */
private fun rollDice() {
    // Create new Dice object with 6 sides and roll the dice
    val dice = MainActivity.Dice(6)
    val diceRoll = dice.roll()

    // Find the ImageView in the layout
    val diceImage: ImageView = findViewById(R.id.imageView)

    // Determine which drawable resource ID to use based on the dice roll
    val drawableResource = when (diceRoll) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    // Update the ImageView with the correct drawable resource ID
    diceImage.setImageResource(drawableResource)

    // Update the content description
    diceImage.contentDescription = diceRoll.toString()
}



//TODO Give your Dice class another attribute of color and create multiple instances of dice with different numbers of sides and colors!
//to include an additional attribute, include "val colour: String" in the Dice attributes and include the additional colour when creating an instance of Dice.
//e.g. "val mySecondDice = Dice(20, "White")" note all instances will have to include an additional attribute.

//TODO Create a Coin class, give it the ability to flip, create an instance of the class and flip some coins! How would you use the random() function with a range to accomplish the coin flip?
//reduce the range to two and depending on 1 or 2, create an if function to return heads or tail instead.