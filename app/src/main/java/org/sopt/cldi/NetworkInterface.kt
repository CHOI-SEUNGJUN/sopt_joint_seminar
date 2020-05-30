package org.sopt.cldi

import retrofit2.Call
import retrofit2.http.GET

interface NetworkInterface {

    @GET("/best")
    fun getBestGunShop() : Call<Any>
}