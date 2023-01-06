package com.ferrero.applay.cdodis

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


class Ijisosdkkosdkosd(private val wosdlp: Qwsodksd) {
    suspend fun xcijxcji() = wosdlp.getData()
}
@Keep
data class Hisokasjididjs(
    @SerializedName("ge")
    val xkzmkckzx: String,
    @SerializedName("vi")
    val eoksokd: String,
    @SerializedName("aps")
    val xozkcokzxcozxcok: String,
)

interface Vfxuhchuxijs {
    @GET("const.json")
    suspend fun sdokskodao(): Response<Hisokasjididjs>
}
class Hysisjioskdmkxmcxkm(private val xicjx: Vfxuhchuxijs) {
    suspend fun rokekokosdkosd() = xicjx.sdokskodao()
}
@Keep
data class Iospsdok(
    @SerializedName("countryCode")
    val civj: String,
)

interface Qwsodksd {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun getData(): Response<Iospsdok>
}








