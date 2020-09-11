package dev.gcode.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var resultImage : ImageView
    lateinit var secondResultImage : ImageView
    var randomNumber : Int? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.roll_button)
        secondResultImage = findViewById(R.id.second_dice_image)
        resultImage = findViewById(R.id.dice_image)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            randomNumber =  Random().nextInt(6) + 1
            rollDice()
            rollSecondDice()
        }
    }

    private fun rollSecondDice() {
        randomNumber =  Random().nextInt(6) + 1
        val drawableResource = when (randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        secondResultImage.setImageResource(drawableResource)
    }

    private fun rollDice() {
        randomNumber =  Random().nextInt(6) + 1
        val drawableResource = when (randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        resultImage.setImageResource(drawableResource)
    }
}
