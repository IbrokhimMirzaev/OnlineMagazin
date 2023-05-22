package com.example.onlinemagazin.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.onlinemagazin.database.dao.CartDao
import com.example.onlinemagazin.database.dao.OrderDao
import com.example.onlinemagazin.database.dao.PaymentDao
import com.example.onlinemagazin.database.dao.ProductDao
import com.example.onlinemagazin.database.dao.UserDao
import com.example.onlinemagazin.database.entity.Cart
import com.example.onlinemagazin.database.entity.Order
import com.example.onlinemagazin.database.entity.Payment
import com.example.onlinemagazin.database.entity.Product
import com.example.onlinemagazin.database.entity.User

@Database(
    entities = [
        Cart::class,
        Order::class,
        Payment::class,
        Product::class,
        User::class,
    ],
    version = 1,
    exportSchema = false
)

abstract class OnlineStoreDatabase : RoomDatabase() {

    abstract fun cartDao(): CartDao
    abstract fun orderDao(): OrderDao
    abstract fun paymentDao(): PaymentDao
    abstract fun productDao(): ProductDao
    abstract fun userDao(): UserDao

    companion object {
        private const val DATABASE_NAME = "online_store_database"

        @Volatile
        private var INSTANCE: OnlineStoreDatabase? = null

        fun getInstance(context: Context): OnlineStoreDatabase  {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, OnlineStoreDatabase::class.java, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .build()
            }

            return INSTANCE!!
        }
    }
}
