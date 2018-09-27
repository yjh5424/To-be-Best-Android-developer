package com.example.yunjunghyeon.demotestapp.domain.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class User(
        @PrimaryKey
        var id : Int,
        @ColumnInfo(name = "name")
        var name : String,
        @ColumnInfo(name = "age")
        var age : Int,
        @ColumnInfo(name = "address")
        var address : String
)