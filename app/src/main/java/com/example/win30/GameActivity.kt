package com.example.win30

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.win30.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    var button1: AppCompatButton? = null
    var button2: AppCompatButton? = null
    var button3: AppCompatButton? = null
    var button4: AppCompatButton? = null
    var button5: AppCompatButton? = null
    var button6: AppCompatButton? = null
    var button7: AppCompatButton? = null
    var button8: AppCompatButton? = null
    var button9: AppCompatButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        button1 = binding.button1
        button2 = binding.button2
        button3 = binding.button3
        button4 = binding.button4
        button5 = binding.button5
        button6 = binding.button6
        button7 = binding.button7
        button8 = binding.button8
        button9 = binding.button9
        addImage()
    }

    private fun addImage(){
        Glide.with(this).load("http://49.12.202.175/win30/backgroundphone.jpg")
            .into(object : SimpleTarget<Drawable?>() {
                override fun onResourceReady(
                    resource: Drawable,
                    transition: Transition<in Drawable?>?
                ) {
                    binding.gameLayout.background = resource
                }
            })
    }
}