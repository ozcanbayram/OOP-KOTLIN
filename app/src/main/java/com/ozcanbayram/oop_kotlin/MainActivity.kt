package com.ozcanbayram.oop_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User()
        myUser.name="James"
        myUser.age=25
        println(myUser.name)
        println(myUser.age.toString())

    }
}