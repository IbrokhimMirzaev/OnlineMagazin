package com.example.onlinemagazin.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "payments",
    foreignKeys = [
        ForeignKey(
            entity = Order::class,
            parentColumns = ["orderId"],
            childColumns = ["orderId"]
        ),
    ],
    indices = [
        Index("orderId"),
    ]
)

data class Payment(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "paymentId")
    val paymentId: Long = 0,

    @ColumnInfo(name = "orderId")
    val orderId: Long,

    @ColumnInfo(name = "amount")
    val amount: Double,
)
