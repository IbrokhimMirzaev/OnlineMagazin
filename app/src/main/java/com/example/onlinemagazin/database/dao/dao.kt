package com.example.onlinemagazin.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.onlinemagazin.database.entity.Cart
import com.example.onlinemagazin.database.entity.Order
import com.example.onlinemagazin.database.entity.Payment
import com.example.onlinemagazin.database.entity.Product
import com.example.onlinemagazin.database.entity.User

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers(): List<User>

    @Query("SELECT * FROM users WHERE userId = :userId")
    fun getUserById(userId: Long): User?

    @Insert
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)
}

@Dao
interface ProductDao {
    @Query("SELECT * FROM products")
    fun getAllProducts(): List<Product>

    @Query("SELECT * FROM products WHERE productId = :productId")
    fun getProductById(productId: Long): Product?

    @Query("SELECT * FROM products WHERE category = :category")
    fun getProductsByCategory(category: String): List<Product>

    @Insert
    fun insertProduct(product: Product)

    @Update
    fun updateProduct(product: Product)

    @Delete
    fun deleteProduct(product: Product)
}

@Dao
interface PaymentDao {
    @Query("SELECT * FROM payments")
    fun getAllPayments(): List<Payment>

    @Query("SELECT * FROM payments WHERE paymentId = :paymentId")
    fun getPaymentById(paymentId: Long): Payment?

    @Insert
    fun insertPayment(payment: Payment)

    @Update
    fun updatePayment(payment: Payment)

    @Delete
    fun deletePayment(payment: Payment)
}

@Dao
interface OrderDao {
    @Query("SELECT * FROM orders")
    fun getAllOrders(): List<Order>

    @Query("SELECT * FROM orders WHERE orderId = :orderId")
    fun getOrderById(orderId: Long): Order?

    @Query("SELECT SUM(total) FROM orders")
    fun getTotalAmount(): Double

    @Insert
    fun insertOrder(order: Order)

    @Update
    fun updateOrder(order: Order)

    @Delete
    fun deleteOrder(order: Order)
}

@Dao
interface CartDao {
    @Query("SELECT * FROM cart")
    fun getAllCarts(): List<Cart>

    @Query("SELECT * FROM cart WHERE id = :id")
    fun getCartById(id: Long): Cart?

    @Insert
    fun insertCart(cart: Cart)

    @Update
    fun updateCart(cart: Cart)

    @Delete
    fun deleteCart(cart: Cart)
}




