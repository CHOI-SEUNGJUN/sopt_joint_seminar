package org.sopt.cldi.data

import com.google.gson.annotations.SerializedName

data class GomshinTalkData(
    val postIdx: Int,
    val title: String,
    val category: String,
    val commentNum: Int,
    val likeNum: Int,
    val createdAt: String,
    val userIdx: Int,
    val nickname: String,
    val level: Int,
    val military: String,
    @SerializedName("class")
    val military_class: String,
    val bestNum: Int
)

data class BaseResponse<T> (
    val status: Int,
    val success: Boolean,
    val message: String?,
    val data: T?
)