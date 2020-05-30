package org.sopt.cldi

import org.sopt.cldi.data.BaseResponse
import org.sopt.cldi.data.GomshinTalkData
import retrofit2.Call
import retrofit2.http.GET

interface NetworkInterface {

    @GET("/best")
    fun getBestGunShop() : Call<BaseResponse<List<GomshinTalkData>>>
}