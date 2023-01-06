package com.ferrero.applay.cdodis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferrero.applay.databinding.ActivityAgtssuiidsjwBinding
import kotlin.random.Random

class Agtssuiidsjw : AppCompatActivity() {
    private lateinit var xzkxichhus : ActivityAgtssuiidsjwBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xzkxichhus = ActivityAgtssuiidsjwBinding.inflate(layoutInflater)
        setContentView(xzkxichhus.root)
        val listRes = listOf(
            "You won 50 nature points",
            "You won 100 nature points",
            "You won 150 nature points",
            "You won 180 nature points",
            "You won 250 nature points",
            "You won 300 nature points",
            "You won 350 nature points",
            "You won 500 nature points",
            "You won 800 nature points",
            "You won 1000 nature points",
        )
        xzkxichhus.button2.setOnClickListener {
            startActivity(Intent(this,Noxizxpsdij::class.java))
        }
        xzkxichhus.tvRes.text = listRes[Random.nextInt(10)]
    }
}