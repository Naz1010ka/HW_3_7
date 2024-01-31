package com.example.hw_3_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container_1,  FragmentSongs()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_2,  FragmentSongsList()).commit()

    }
}