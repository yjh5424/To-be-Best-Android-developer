package com.example.yunjunghyeon.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    val value1 : String by lazy { "a" }

    lateinit var value2 : String

    init {
        value2 = "b"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Log",value1)
        Log.d("Log",value2)
    }
}
