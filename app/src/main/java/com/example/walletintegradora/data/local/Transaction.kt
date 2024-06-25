package com.example.alkewalletapp.data.local

/**
 * Representa datos para la transacción en la wallet.
 */
data class Transaction(

    val profileImage: Int,
    val transactionType: Int,
    val name: String,
    val date: String,
    val operator: String,
    val amount: Double

)
