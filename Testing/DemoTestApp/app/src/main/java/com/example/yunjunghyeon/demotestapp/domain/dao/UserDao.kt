package com.example.yunjunghyeon.demotestapp.domain.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.yunjunghyeon.demotestapp.domain.entity.User


interface UserDao{

    @Insert
    fun insertAll(vararg users : User)

    @Insert
    fun insertUser(user : User)

    @Query("SELECT * FROM user")
    fun getUsers(): LiveData<List<User>>
}