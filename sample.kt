package com.example.kotlinbasicgrammer

/*
author: SeongwonMun
created: 2023.08.14
TIL: Kotlin basic grammer
*/

/* entry point */
fun main(){
    helloWorld()
    println(add(4, 5))

    //3. String Template
    val name = "Seongwon"
    var lastname = "Moon"
    println("my name is ${name + lastname} I'm 23")
    println("Is this true? ${1==0}")
    println("this is 2\$a")
}
// 1. 함수(Unit -> 리턴 값 x)
fun helloWorld(){
    println("Hello World")
}

// parameter o => var : type
fun add(a: Int, b: Int) : Int{
    return a + b
}

// 2. var vs var (발[val]은 뗄 수 없다, 바지[var]는 갈아 입을 수 있다)
// val = value(no changes things)
// var = variable
// var (var) => x 반드시 선언을 해주 어야 함
fun hi(){
    val a: Int = 10
    var b: Int = 9
    b = 100

    val c = 10
    var d = 100
    var name = "seongwon"
}