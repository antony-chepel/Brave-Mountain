package com.ferrero.applay

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.ferrero.applay.cdodis.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val riookdko = module {


    single  <Vfxuhchuxijs> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Vfxuhchuxijs::class.java)
    }

    single <Qwsodksd> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Qwsodksd::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://bravemountain.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Ijisosdkkosdkosd(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Hysisjioskdmkxmcxkm(get(named("HostInter")))
    }
    single{
        rijjsi()
    }
    single (named("SharedPreferences")) {
        aokaoksa(androidApplication())
    }

}

fun aokaoksa(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

val vjjicxi = module {
    viewModel {
        Grsyuuhxc(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}

fun rijjsi(): Gson {
    return GsonBuilder().create()
}

