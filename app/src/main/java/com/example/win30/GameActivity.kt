package com.example.win30

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.win30.databinding.ActivityGameBinding
import com.onesignal.OneSignal

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
    var listButtons = ArrayList<AppCompatButton?>()
    val playerX = "X"
    var currentPlayer = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId("714b9f14-381d-4fc4-a93c-28d480557381")
        button1 = binding.button1
        button2 = binding.button2
        button3 = binding.button3
        button4 = binding.button4
        button5 = binding.button5
        button6 = binding.button6
        button7 = binding.button7
        button8 = binding.button8
        button9 = binding.button9
        listButtons.add(button1)
        listButtons.add(button2)
        listButtons.add(button3)
        listButtons.add(button4)
        listButtons.add(button5)
        listButtons.add(button6)
        listButtons.add(button7)
        listButtons.add(button8)
        listButtons.add(button9)
        binding.buttonPlayAgain.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
        addImage()
        putX()
    }

    fun putX(){
        button1?.setOnClickListener {
            button1?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button1!!)
        }
        button2?.setOnClickListener {
            button2?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button2!!)
        }
        button3?.setOnClickListener {
            button3?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button3!!)
        }
        button4?.setOnClickListener {
            button4?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button4!!)
        }
        button5?.setOnClickListener {
            button5?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button5!!)
        }
        button6?.setOnClickListener {
            button6?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button6!!)
        }
        button7?.setOnClickListener {
            button7?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button7!!)
        }
        button8?.setOnClickListener {
            button8?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button8!!)
        }
        button9?.setOnClickListener {
            button9?.text = "X"
            currentPlayer = "X"
            victory()
            random0(button9!!)
        }
    }

    private fun random0(button: AppCompatButton) {
        currentPlayer="O"
        if (button1!!.text==playerX&&button2!!.text==playerX&&button3!!.text==""){
            button3!!.text = "O"
            victory()
            listButtons.remove(button3)
            listButtons.remove(button1)
            listButtons.remove(button2)
            button3!!.isEnabled = false
            button1!!.isEnabled = false
            button2!!.isEnabled = false
        } else if (button4!!.text==playerX&&button5!!.text==playerX&&button6!!.text==""){
            button6!!.text = "O"
            victory()
            listButtons.remove(button6)
            listButtons.remove(button4)
            listButtons.remove(button5)
            button6!!.isEnabled = false
            button4!!.isEnabled = false
            button5!!.isEnabled = false
        } else if(button7!!.text==playerX&&button8!!.text==playerX&&button9!!.text==""){
            button9!!.text = "O"
            victory()
            listButtons.remove(button9)
            listButtons.remove(button7)
            listButtons.remove(button8)
            button9!!.isEnabled = false
            button7!!.isEnabled = false
            button9!!.isEnabled = false
        } else if(button1!!.text==playerX&&button5!!.text==playerX&&button9!!.text==""){
            button9!!.text = "O"
            victory()
            listButtons.remove(button1)
            listButtons.remove(button5)
            listButtons.remove(button9)
            button1!!.isEnabled = false
            button5!!.isEnabled = false
            button9!!.isEnabled = false
        } else if(button3!!.text==playerX&&button5!!.text==playerX&&button7!!.text==""){
            button7!!.text = "O"
            victory()
            listButtons.remove(button3)
            listButtons.remove(button5)
            listButtons.remove(button7)
            button3!!.isEnabled = false
            button5!!.isEnabled = false
            button7!!.isEnabled = false
        } else if(button1!!.text==playerX&&button4!!.text==playerX&&button7!!.text==""){
            button7!!.text = "O"
            victory()
            listButtons.remove(button1)
            listButtons.remove(button4)
            listButtons.remove(button7)
            button1!!.isEnabled = false
            button4!!.isEnabled = false
            button7!!.isEnabled = false
        } else if(button2!!.text==playerX&&button5!!.text==playerX&&button8!!.text==""){
            button8!!.text = "O"
            victory()
            listButtons.remove(button2)
            listButtons.remove(button5)
            listButtons.remove(button8)
            button2!!.isEnabled = false
            button5!!.isEnabled = false
            button8!!.isEnabled = false
        } else if(button3!!.text==playerX&&button6!!.text==playerX&&button9!!.text==""){
            button9!!.text = "O"
            victory()
            listButtons.remove(button3)
            listButtons.remove(button6)
            listButtons.remove(button9)
            button3!!.isEnabled = false
            button6!!.isEnabled = false
            button9!!.isEnabled = false
        }else{
            if (listButtons.size!=1){
                listButtons.remove(button)
                button.isEnabled = false
                listButtons.shuffle()
                listButtons[0]?.text = "O"
                listButtons[0]?.isEnabled = false
                victory()
                listButtons.remove(listButtons[0])
                Log.i("list", listButtons.size.toString())
            }
            button.isEnabled = false
        }
    }

    private fun disableButtons(){
        button1?.isEnabled = false
        button2?.isEnabled = false
        button3?.isEnabled = false
        button4?.isEnabled = false
        button5?.isEnabled = false
        button6?.isEnabled = false
        button7?.isEnabled = false
        button8?.isEnabled = false
        button9?.isEnabled = false
    }

    private fun victory(){
        if (button1!!.text==currentPlayer&&button4!!.text==currentPlayer&&button7!!.text==currentPlayer){
            if (currentPlayer=="X"){
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button4?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button7?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button4?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button7?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button2!!.text==currentPlayer&&button5!!.text==currentPlayer&&button8!!.text==currentPlayer){
            if (currentPlayer=="X"){
                button2?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button8?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button2?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button8?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button3!!.text==currentPlayer&&button6!!.text==currentPlayer&&button9!!.text==currentPlayer){
            if (currentPlayer=="X"){
                button3?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button6?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button3?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button6?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button1!!.text==currentPlayer&&button2!!.text==currentPlayer&&button3!!.text==currentPlayer){
            if (currentPlayer=="X"){
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button2?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button3?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button2?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button3?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button4!!.text==currentPlayer&&button5!!.text==currentPlayer&&button6!!.text==currentPlayer){
            if (currentPlayer=="X"){
                button4?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button6?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button4?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button6?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button7!!.text==currentPlayer&&button8!!.text==currentPlayer&&button9!!.text==currentPlayer){
            if (currentPlayer=="X"){
                button7?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button8?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button7?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button8?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button1!!.text==currentPlayer&&button5!!.text==currentPlayer&&button9!!.text==currentPlayer){
            if (currentPlayer=="X"){
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button1!!.text==currentPlayer&&button5!!.text==currentPlayer&&button9!!.text==currentPlayer){
            if (currentPlayer=="X"){
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                disableButtons()
            } else {
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                disableButtons()
            }
        } else if (button3!!.text==currentPlayer&&button5!!.text==currentPlayer&&button7!!.text==currentPlayer){
            if (currentPlayer=="X"){
                button3?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                button7?.setBackgroundColor(ContextCompat.getColor(this, R.color.green))
                Toast.makeText(this, "Victory", Toast.LENGTH_SHORT).show()
                disableButtons()
            } else {
                button1?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button5?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                button9?.setBackgroundColor(ContextCompat.getColor(this, R.color.red))
                Toast.makeText(this, "Loss", Toast.LENGTH_SHORT).show()
                disableButtons()
            }
        }
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

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}