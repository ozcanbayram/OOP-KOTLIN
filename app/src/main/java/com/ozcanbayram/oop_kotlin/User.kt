package com.ozcanbayram.oop_kotlin

class User {
    //Property
    var name : String? = null
    var age : Int? = null

    //Constructor vs init
    constructor(nameInput:String,ageInput:Int){
        this.name = nameInput
        this.age = ageInput
    }

    init {
        println("init")
    }
}

