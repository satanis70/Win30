package com.example.win30

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.win30.databinding.ActivityMainBinding
import com.example.win30.databinding.ActivitySplashScreenBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addImage()
        binding.buttonStart.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }

    private fun addImage(){
        Glide.with(this).load("http://49.12.202.175/win30/backgroundphone.jpg")
            .into(object : SimpleTarget<Drawable?>() {
                override fun onResourceReady(
                    resource: Drawable,
                    transition: Transition<in Drawable?>?
                ) {
                    binding.mainLayout.background = resource
                }
            })
    }
}