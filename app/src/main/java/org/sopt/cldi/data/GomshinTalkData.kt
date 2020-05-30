package org.sopt.cldi.data

import com.google.gson.annotations.SerializedName

data class GomshinTalkData(
    val title: String,
    val category: String,
    val commentNum: Int,
    val likeNum: Int,
    val createdAt: String,
    val bestNum: Int,
    val user:User
)

data class User(
    val nickname:String,
    val level: Int,
    val military: String,
    @SerializedName("class")
    val military_class: String
)