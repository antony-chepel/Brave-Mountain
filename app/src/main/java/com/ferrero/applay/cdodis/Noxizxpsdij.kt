package com.ferrero.applay.cdodis

import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import com.ferrero.applay.R
import com.ferrero.applay.databinding.ActivityNoxizxpsdijBinding
import kotlin.random.Random

class Noxizxpsdij : AppCompatActivity() {
    private var wopsplsd = 0
    private var sidjasdi = 0
    private lateinit var sijdsij : ActivityNoxizxpsdijBinding
    private var doskdkos: Long = 0



    val listBrave = listOf(
        R.drawable.br_m_1,
        R.drawable.br_m_2,
        R.drawable.br_m_3,
        R.drawable.br_m_4,
        R.drawable.br_m_5,
        R.drawable.br_m_6,
        R.drawable.br_m_7,
    )
    private var opwkodko: ValueAnimator? = null
    private var xicjxji = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sijdsij  = ActivityNoxizxpsdijBinding.inflate(layoutInflater)
        setContentView(sijdsij.root)
        orijdjfjid()
        sijdsij.ovkbv.progress = xicjxji
        sijdsij.fokcijvjic.text = "Nature power : $xicjxji"
        sidjsdji()

    }


    @SuppressLint("ClickableViewAccessibility")
    private fun sidjsdji() = with(sijdsij){
        zoxkzjis.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, sdsoksd: MotionEvent?): Boolean {
                if(sdsoksd?.action == MotionEvent.ACTION_DOWN) {
                    xicjxji +=10
                    rokdfko.setImageResource(listBrave[Random.nextInt(7)])
                    if(xicjxji == 100){
                        startActivity(Intent(this@Noxizxpsdij,Agtssuiidsjw::class.java))
                        xicjxji = 0
                    }
                    fokcijvjic.text = "Nature power : $xicjxji"
                    ovkbv.progress = xicjxji
                    v?.animate()?.scaleX(0.99f)?.scaleY(0.99f)?.setDuration(0)
                } else if(sdsoksd?.action == MotionEvent.ACTION_UP){
                    v?.animate()?.scaleX(1.0f)?.scaleY(1.0f)?.setDuration(0)
                }

                return true
            }

        })
    }

    private fun orijdjfjid() {
        doskdkos = System.currentTimeMillis() + 1000
        opwkodko?.setRepeatCount(ValueAnimator.INFINITE)
        opwkodko?.addUpdateListener({
            wopsplsd++
            if (System.currentTimeMillis() > doskdkos) {
                sidjasdi++
                if (sidjasdi > 1)
                    Log.i("Giisso", "Count:$wopsplsd")
                wopsplsd = 0
                doskdkos = System.currentTimeMillis() + 1000
            }
        })
        opwkodko?.start()
    }
}