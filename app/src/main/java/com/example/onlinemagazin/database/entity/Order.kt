package com.example.onlinemagazin.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "orders",
    foreignKeys = [
        ForeignKey(
            entity = Product::class,
            parentColumns = ["productId"],
            childColumns = ["productId"]
        ),
        ForeignKey(
            entity = User::class,
            parentColumns = ["userId"],
            childColumns = ["userId"]
        ),
        ForeignKey(
            entity = Payment::class,
            parentColumns = ["paymentId"],
            childColumns = ["paymentId"]
        ),
    ],
    indices = [
        Index("productId"),
        Index("userId"),
        Index("paymentId"),
    ]
)
data class Order(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "orderId")
    val orderId: Long = 0,

    @ColumnInfo(name = "productId")
    val productId: Long,

    @ColumnInfo(name = "userId")
    val userId: Long,

    @ColumnInfo(name = "total")
    val total: Double,

    @ColumnInfo(name = "paymentId")
    val paymentId: Long,
)