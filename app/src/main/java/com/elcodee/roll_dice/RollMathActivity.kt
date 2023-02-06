package com.elcodee.roll_dice

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elcodee.roll_dice.databinding.ActivityRollMathBinding

class RollMathActivity : AppCompatActivity() {
    private val binding: ActivityRollMathBinding by lazy {
        ActivityRollMathBinding.inflate(layoutInflater)
    }
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnRiset.setOnClickListener {
            binding.tvMath.text = "0"
            binding.tvMath.setBackgroundColor(Color.WHITE)
        }

        binding.btnPutar.setOnClickListener{
            val a = putar(100)
            val b = a.putarMath()
            binding.tvMath.text = b.toString()
            if (b <= 20){
                binding.tvMath.setBackgroundColor(Color.BLUE)
            }else if (b in 20..40){
                binding.tvMath.setBackgroundColor(Color.RED)
            }else if (b in 41..60){
                binding.tvMath.setBackgroundColor(Color.GREEN)
            }else if (b in 61..80){
                binding.tvMath.setBackgroundColor(Color.CYAN)
            }else if (b in 81..100){
                binding.tvMath.setBackgroundColor(Color.DKGRAY)
            }
        }
    }
}
class putar(private val runMath: Int){
    fun putarMath(): Int{
        return (1 .. runMath).random()
    }
}