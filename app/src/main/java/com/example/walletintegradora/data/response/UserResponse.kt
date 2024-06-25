package com.example.walletintegradora.data.response

import com.google.gson.annotations.SerializedName

data class UserResponse(

    val id: Long,
    @SerializedName("first_name")
    val firstname: String,
    @SerializedName("last_name")
    val lastname: String,
    val email: String,
    val password: String,
    val points: Long?,
    val roleId: Long,
    val createdAt: String?,
    val updatedAt: String?
)
