package org.sopt.cldi

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkImpl {

    private const val BASE_URL = "#"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val network: NetworkInterface = retrofit.create(NetworkInterface::class.java)

}