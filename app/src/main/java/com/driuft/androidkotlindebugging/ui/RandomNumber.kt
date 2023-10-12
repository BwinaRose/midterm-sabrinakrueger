package com.driuft.androidkotlindebugging.ui

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import kotlin.random.Random

class RandomNumber : AppCompatActivity() {

    private val randNum: TextView get() = findViewById(R.id.randNum)
    private val ranBtn: Button get() = findViewById(R.id.ranBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
//        ranBtn.setOnClickListener { randNumGen() }
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_random_number)
        val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.fanfare_trumpets)
        mediaPlayer.isLooping
        mediaPlayer.start()

        ranBtn.setOnClickListener {
            val rand: Int = (0..9).random()
            randNum.text = "$rand"
            val toast = Toast.makeText(this, "Today's lucky number is $rand", Toast.LENGTH_SHORT) // in Activity
            toast.show()
            val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.fanfare_trumpets)
            mediaPlayer.isLooping
            mediaPlayer.start()
        }


        val rand: Int = (0..9).random()
        randNum.text = "$rand"
        val toast = Toast.makeText(this, "Today's lucky number is $rand", Toast.LENGTH_SHORT) // in Activity
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.fanfare_trumpets)

        mediaPlayer.stop()
        mediaPlayer.prepare()
    }

    private fun randNumGen(){

    }
}