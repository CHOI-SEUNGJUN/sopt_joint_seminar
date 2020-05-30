package org.sopt.cldi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkImpl {

    private const val BASE_URL = "http://13.125.13.186:3000"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val network : NetworkInterface = retrofit.create(NetworkInterface::class.java)

}