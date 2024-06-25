package com.example.walletintegradora.data.response

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserSchema(

    @PrimaryKey
    val email : String,
    val password : String,
    val token : String

)
