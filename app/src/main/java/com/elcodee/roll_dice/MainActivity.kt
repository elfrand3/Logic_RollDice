package com.elcodee.roll_dice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.motion.utils.StopLogic
import com.elcodee.roll_dice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnAngka1.setOnClickListener {
            startActivity(Intent(this@MainActivity, RollMathActivity::class.java))
        }
        binding.btnAngka2.setOnClickListener {
            startActivity(Intent(this@MainActivity, LogicActivity::class.java))
        }
        binding.btnRoll.setOnClickListener {
//            val dice = rollDice(6)
//            val listDice = when(dice.imageDice()){
//                1 -> R.drawable.dice_one
//                2 -> R.drawable.dice_two
//                3 -> R.drawable.dice_three
//                4 -> R.drawable.dice_four
//                5 -> R.drawable.dice_five
//                else -> R.drawable.dice_six
//            }
//            binding.ivDice.setImageResource(listDice)

            val dice = rollDice(6)
            val spinDice = dice.imageDice()
            val listDice = when(spinDice){
                1 -> R.drawable.dice_one
                2 -> R.drawable.dice_two
                3 -> R.drawable.dice_three
                4 -> R.drawable.dice_four
                5 -> R.drawable.dice_five
                else -> R.drawable.dice_six
            }
            if (spinDice == 6){
                binding.btnRoll.isEnabled = false
            }else{
                binding.ivDice.setImageResource(listDice)
            }
        }
    }
}
class rollDice(private val runDice: Int){
    fun imageDice(): Int{
        return (1 .. runDice).random()
    }
}