package com.ferrero.applay

import android.app.Application
import android.content.Context
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.logger.Level
import java.util.*

class Bgyxiixzjcsuhwq: Application() {
    override fun onCreate() {
        super.onCreate()
        val difjjid = UUID.randomUUID().toString()
        val woksd = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val covkc = getSharedPreferences("PREFS_NAME", 0)



        if (covkc.getBoolean("my_first_time", true)) {
            woksd.edit().putString(rokds, difjjid).apply()
            covkc.edit().putBoolean("my_first_time", false).apply()
        }

        startKoin{
            androidLogger(Level.DEBUG)
            androidContext(this@Bgyxiixzjcsuhwq)
            modules(listOf(
                vjjicxi, riookdko
            ))
        }

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(xcjxci)
    }

    companion object {
        const val xcjxci = "449dea45-237c-453a-aa1d-5e7f753547b3"
        val rokds: String = "myID"
        var difjid: String? = "main_id"
        val sijds: String = "uff"


        val covkcvkc: String = "appsCheckChe"
        val vopkbok: String = "deepL"
        var rokosd: String = "link"

        val xcokxc: String = "geoCo"
        var spdlppsda: String? = "c11"



    }
}