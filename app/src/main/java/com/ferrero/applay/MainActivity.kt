package com.ferrero.applay
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.spdlppsda
import java.util.concurrent.Executors
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.covkcvkc

import com.ferrero.applay.cdodis.Grsyuuhxc

import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    val eiofokkof by viewModel<Grsyuuhxc>()
    val xkxz: SharedPreferences by inject(named("SharedPreferences"))







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eiofokkof.xciojxcijjivxc(this@MainActivity)

        eiofokkof.gofdjifdodkf(this@MainActivity)

        eosdsko()

        GlobalScope.launch (Dispatchers.IO){
            eiofokkof.gokijxcji()
        }

    }



    fun vccvkkcv() {
        val rokkosdko = Intent(this@MainActivity, Tusijdkox::class.java)
        startActivity(rokkosdko)
        finish()
    }

    fun eosdsko() {
        val esokd = Executors.newSingleThreadScheduledExecutor()
        var apsodwjiwd = xkxz.getString(covkcvkc, null)
        val gokgkho = Executors.newSingleThreadScheduledExecutor()
        var xijcx = xkxz.getString(spdlppsda, null)
        esokd.scheduleAtFixedRate({
            if (apsodwjiwd != null) {
                Log.d("appsChec", "checkAppps:$apsodwjiwd ")
                esokd.shutdownNow()
                when (apsodwjiwd) {
                    "1" ->
                        gokgkho.scheduleAtFixedRate({
                            if (xijcx != null) {
                                gokgkho.shutdownNow()
                                vccvkkcv()
                            } else {
                                xijcx = xkxz.getString(spdlppsda, null)
                            }
                        }, 0, 1, TimeUnit.SECONDS)
                    else ->
                        vccvkkcv()
                }
            } else {
                Log.d("appsChec", "checkAppps:$apsodwjiwd ")
                apsodwjiwd = xkxz.getString(covkcvkc, null)
            }
        }, 0, 1, TimeUnit.SECONDS)
    }
}