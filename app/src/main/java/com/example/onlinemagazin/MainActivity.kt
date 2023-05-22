package com.example.onlinemagazin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinemagazin.database.OnlineStoreDatabase
import com.example.onlinemagazin.database.entity.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDb = OnlineStoreDatabase.getInstance(this)

//        myDb.userDao().insertUser(User(0, "Mirzayev Ibrohim", "login1", "1234"))
//        myDb.userDao().insertUser(User(0, "Xayrullayev Xabibulloh", "login2", "1234"))
//        myDb.userDao().insertUser(User(0, "Aknazarova Sadoqat", "login3", "1234"))
//        myDb.userDao().insertUser(User(0, "Karimova Shaxrizoda", "login4", "1234"))
    }
}