package com.ferrero.applay
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.vopkbok
import com.ferrero.applay.cdodis.Noxizxpsdij
import com.ferrero.applay.cdodis.Mjxiuxcuhsa
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.covkcvkc
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.sijds
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.xcokxc


class Tusijdkox : AppCompatActivity() {
    lateinit var irj: String
    lateinit var qowk: String


    lateinit var kocxkcx: String
    lateinit var rokdfji: String

    val cjjvnxcovock: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var roeko: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kxichudhsf)

        roodk()
    }

    fun ggkoodgjiidj() {
        val rijkosd = Intent(this@Tusijdkox, Mjxiuxcuhsa::class.java)

        if(irj=="1") {
            if(roeko.contains("tdb2")&&kocxkcx.contains("tdb2")) {
                rijkosd.putExtra("WebInt", "campaign")
                startActivity(rijkosd)
                finish()
            } else if (roeko.contains("tdb2")|| qowk.contains(rokdfji)) {
                rijkosd.putExtra("WebInt", "campaign")
                startActivity(rijkosd)
                finish()
            } else if (kocxkcx.contains("tdb2") && !roeko.contains("tdb2")) {
                rijkosd.putExtra("WebInt", "deepLink")
                startActivity(rijkosd)
                finish()
            }
            else {
                startActivity(Intent(this, Noxizxpsdij::class.java))
                finish()
            }
        } else {
            if (kocxkcx.contains("tdb2")) {
                rijkosd.putExtra("WebInt", "deepLink")
                startActivity(rijkosd)
                finish()
            } else {
                startActivity(Intent(this, Noxizxpsdij::class.java))
                finish()
            }
        }
    }

    fun roodk() {

        kocxkcx = cjjvnxcovock.getString(vopkbok, null).toString()
        roeko = cjjvnxcovock.getString(Bgyxiixzjcsuhwq.spdlppsda, null).toString()
        irj = cjjvnxcovock.getString(covkcvkc, null).toString()
        qowk = cjjvnxcovock.getString(xcokxc, null).toString()
        rokdfji = cjjvnxcovock.getString(sijds, null).toString()

        ggkoodgjiidj()
    }




}