package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class PlaySound :AppCompatActivity() {
    private val playSnd: Button get() = findViewById(R.id.play)
    private val rootView: View get() = findViewById(android.R.id.content)
    override fun onCreate(savedInstanceState: Bundle?) {
//        ranBtn.setOnClickListener { randNumGen() }
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_play_sound)
        val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.fanfare_trumpets)
        mediaPlayer.isLooping
        mediaPlayer.start()


        playSnd.setOnClickListener {
            val mediaPlayer: MediaPlayer = MediaPlayer.create(applicationContext, R.raw.fanfare_trumpets)
            mediaPlayer.isLooping
            mediaPlayer.start()
            rootView.setBackgroundColor(Color.GREEN)
        }
    }

}
