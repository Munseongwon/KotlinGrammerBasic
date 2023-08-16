package com.example.kotlinbasicgrammer

/*
author: SeongwonMun
created: 2023.08.14
TIL: Kotlin basic grammer
*/

open class Human (val name: String = "Annonymous"){

    constructor(name: String, age: Int) : this(name){
        println("my name is ${name}, and ${age}years old")
    }

    init {
        println("New human has been born!!")
    }
    fun eatingCake(){
        println("This is so delicious")
    }

    open fun singASong(){
        println("Nanananana")
    }
}
//init con => main con ->

// upper class -> open
// override -> open
class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("아리랑!~")
        println("my name is : ${name}")
    }
}


fun main(){
//    val human = Human(name = "Minsu")
//    val stranger = Human()
//    human.eatingCake()

    val mom = Human("YongDu", 54)
//    println("this human name is ${stranger.name}")
    var korean = Korean()
    korean.singASong()

}
