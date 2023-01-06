package com.ferrero.applay.cdodis
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.spdlppsda
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.rokosd
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.vopkbok
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.rokds
import com.ferrero.applay.Bgyxiixzjcsuhwq.Companion.difjid

import com.ferrero.applay.databinding.ActivityKxizjcushaBinding
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal


class Mjxiuxcuhsa : AppCompatActivity() {
    private val vocbbvko = 1
    var dofijdj = ""

    private var sdoks = false
    var ovckijf: ValueCallback<Array<Uri>>? = null

    lateinit var cokvjivcx: ActivityKxizjcushaBinding
    var kxixuhsd: String? = null
    lateinit var xicjxij: WebView
    var wosdij = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cokvjivcx = ActivityKxizjcushaBinding.inflate(layoutInflater)
        setContentView(cokvjivcx.root)

        xicjxij = cokvjivcx.oixjsd
        Snackbar.make(
            cokvjivcx.root, "Loading...",
            Snackbar.LENGTH_SHORT
        ).show()


        val orjidfjid = CookieManager.getInstance()
        orjidfjid.setAcceptCookie(true)
        orjidfjid.setAcceptThirdPartyCookies(xicjxij, true)
        ogvijcchucv()
        val cnxcj: Activity = this
        xicjxij.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(rokdf: WebView, fokogkgf: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(fokogkgf)) {
                        return false
                    }
                    if (ofkfjf(fokogkgf)) {

                        val vockvibjb = Intent(Intent.ACTION_VIEW)
                        vockvibjb.data = Uri.parse(fokogkgf)
                        startActivity(vockvibjb)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }

            }


            override fun onPageFinished(rodkof: WebView, xlccxko: String) {
                super.onPageFinished(rodkof, xlccxko)

                ozijdijs(xlccxko)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(cnxcj, description, Toast.LENGTH_SHORT).show()
            }


        }
        xicjxij.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                ogkgfi: WebView, cokokxcv: ValueCallback<Array<Uri>>,
                rokdkos: FileChooserParams
            ): Boolean {
                ovckijf?.onReceiveValue(null)
                ovckijf = cokokxcv
                var obkov: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (obkov!!.resolveActivity(packageManager) != null) {
                    var rieoksd: File? = null
                    try {
                        rieoksd = rokokf()
                        obkov.putExtra("PhotoPath", kxixuhsd)
                    } catch (ex: IOException) {

                    }


                    if (rieoksd != null) {
                        kxixuhsd = "file:" + rieoksd.absolutePath
                        obkov.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(rieoksd)
                        )
                    } else {
                        obkov = null
                    }
                }
                val ovkgji = Intent(Intent.ACTION_GET_CONTENT)
                ovkgji.addCategory(Intent.CATEGORY_OPENABLE)
                ovkgji.type = "image/*"
                val rijkodosk: Array<Intent?> =
                    obkov?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val gogkfjifguh = Intent(Intent.ACTION_CHOOSER)
                gogkfjifguh.putExtra(Intent.EXTRA_INTENT, ovkgji)
                gogkfjifguh.putExtra(Intent.EXTRA_TITLE, "Pick your image")
                gogkfjifguh.putExtra(Intent.EXTRA_INITIAL_INTENTS, rijkodosk)
                startActivityForResult(
                    gogkfjifguh, vocbbvko
                )
                return true
            }

            @Throws(IOException::class)
            private fun rokokf(): File {
                var ijcxvhuc = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!ijcxvhuc.exists()) {
                    ijcxvhuc.mkdirs()
                }

                ijcxvhuc =
                    File(ijcxvhuc.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return ijcxvhuc
            }

        }

        xicjxij.loadUrl(rokexckozxc())
    }


    private fun ogvijcchucv() {
        val dasko = xicjxij.settings

        dasko.allowFileAccess = true
        dasko.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        dasko.javaScriptEnabled = true
        dasko.javaScriptCanOpenWindowsAutomatically = true
        dasko.pluginState = WebSettings.PluginState.ON
        dasko.loadWithOverviewMode = true

        dasko.useWideViewPort = true
        dasko.domStorageEnabled = true

        dasko.userAgentString = dasko.userAgentString.replace("; wv", "")
        dasko.allowContentAccess = true
        dasko.setSupportMultipleWindows(false)
        dasko.displayZoomControls = false

        dasko.setAppCacheEnabled(true)
        dasko.builtInZoomControls = true
        dasko.setSupportZoom(true)


    }





    private fun ofkfjf(jcvncv: String): Boolean {

        val rokeokjidf = packageManager
        try {
            rokeokjidf.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }


    private fun qowisjdi(icjvjivc: String) {
        OneSignal.setExternalUserId(
            icjvjivc,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(rokdkos: JSONObject) {
                    try {
                        if (rokdkos.has("push") && rokdkos.getJSONObject("push").has("success")) {
                            val vockv = rokdkos.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $vockv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (rokdkos.has("email") && rokdkos.getJSONObject("email").has("success")) {
                            val epwlwdldw =
                                rokdkos.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $epwlwdldw"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (rokdkos.has("sms") && rokdkos.getJSONObject("sms").has("success")) {
                            val wijsdodks = rokdkos.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $wijsdodks"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun rokexckozxc(): String {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val xijcxji = "sub_id_4="

        val osdspdlds = "sub_id_5="
        val rokosdko = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val cijvjivc = rokosdko.getString(rokds, null)
        val rokdf: String? = rokosdko.getString(spdlppsda, null)
        val apaoksokasok = "sub_id_1="

        val rokokosd: String? = rokosdko.getString(vopkbok, null)
        val jsudhds = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val gokgkohok = "naming"

        val sdskods = "deeporg"
        val wokosd = intent
        val qowjiweij = wokosd.getStringExtra("WebInt")
        val ijvbjivbc = "ad_id="
        val kcmkmkcvmvc = "com.ferrero.applay"

        val obkobonk: String? = rokosdko.getString(difjid, "null")
        val oqokdso = Build.VERSION.RELEASE
        val nibjibn = "deviceID="
        val rokokeokf: String? = rokosdko.getString(rokosd, null)
        val obijvbji = "sub_id_6="

        when (qowjiweij) {
            "deepLink" -> {
                wosdij ="$rokokeokf$apaoksokasok$rokokosd&$nibjibn$jsudhds&$ijvbjivbc$obkobonk&$xijcxji$kcmkmkcvmvc&$osdspdlds$oqokdso&$obijvbji$sdskods"
                qowisjdi(cijvjivc.toString())
                Log.d("TESTAG", "urururururururur deep: $wosdij")
            }
            "campaign" -> {
                wosdij =
                    "$rokokeokf$apaoksokasok$rokdf&$nibjibn$jsudhds&$ijvbjivbc$obkobonk&$xijcxji$kcmkmkcvmvc&$osdspdlds$oqokdso&$obijvbji$gokgkohok"
                qowisjdi(jsudhds.toString())
                Log.d("TESTAG", "urururururururur apps: $wosdij")
            }
        }
        return rokosdko.getString("SAVED_URL", wosdij).toString()
    }



    fun ozijdijs(sdlpsd: String?) {
        if (!sdlpsd!!.contains("t.me")) {

            if (dofijdj == "") {
                dofijdj = getSharedPreferences(
                    "SHARED_PREF",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    sdlpsd
                ).toString()

                val tiodkfo = getSharedPreferences("SHARED_PREF", MODE_PRIVATE)
                val iasdjasdj = tiodkfo.edit()
                iasdjasdj.putString("SAVED_URL", sdlpsd)
                iasdjasdj.apply()
            }
        }
    }


    override fun onActivityResult(ofkdjid: Int, eijsidj: Int, mxkcijjicx: Intent?) {
        if (ofkdjid != vocbbvko || ovckijf == null) {
            super.onActivityResult(ofkdjid, eijsidj, mxkcijjicx)
            return
        }
        var roeksjids: Array<Uri>? = null

        if (eijsidj == AppCompatActivity.RESULT_OK) {
            if (mxkcijjicx == null || mxkcijjicx.data == null) {

                roeksjids = arrayOf(Uri.parse(kxixuhsd))
            } else {
                val bokvbbnji = mxkcijjicx.dataString
                if (bokvbbnji != null) {
                    roeksjids = arrayOf(Uri.parse(bokvbbnji))
                }
            }
        }
        ovckijf?.onReceiveValue(roeksjids)
        ovckijf = null
    }



    override fun onBackPressed() {
            if (xicjxij.canGoBack()) {
                if (sdoks) {
                    xicjxij.stopLoading()
                    xicjxij.loadUrl(dofijdj)
                }
                this.sdoks = true
                xicjxij.goBack()
                Handler(Looper.getMainLooper()).postDelayed(Runnable {
                    sdoks = false
                }, 2000)

            } else {
                super.onBackPressed()
            }
    }




}

