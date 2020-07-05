package com.laewoong.jang.blackjack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.laewoong.jang.blackjack.model.Game

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val game = Game()
        game.play()
    }
}