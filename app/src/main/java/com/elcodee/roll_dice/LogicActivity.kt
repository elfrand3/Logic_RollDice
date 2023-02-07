package com.elcodee.roll_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elcodee.roll_dice.databinding.ActivityLogicBinding

class LogicActivity : AppCompatActivity() {
    private val binding: ActivityLogicBinding by lazy {
        ActivityLogicBinding.inflate(layoutInflater)
    }
    val bd1 = arrayListOf<Int>(1,12,31,5,3,23,4,5,22)
    val bd2 = arrayListOf<Int>(98,12,42,13,13,59,100,99)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.apply {
            btnOutput1.setOnClickListener {
                val run1 = bd1[5]
                tvLogic1.text = run1.toString()
            }
            btnOutput2.setOnClickListener {
                val run2 = bd2[7]
                tvLogic2.text = run2.toString()
            }
        }
    }
}