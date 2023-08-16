package com.example.kotlinbasicgrammer

// 1. lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a: Int)
// 2) return 값으로 사용할 수 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

//val square : (Int) -> (Int) = {number -> number * number}
val square = {number : Int -> number * number}
val nameAge = {name: String, age : Int -> "my name is ${name}, I'm ${age}"}

fun main(){
    println(square(12))
    println(nameAge("seongwon", 23))

    var sentence = "seongwon daid"
    var sentence2 = "window said"
    println(sentence.pizzaIsGreat())
    println(sentence2.pizzaIsGreat())

    println(extendString("juncheol", 22))

    println(calculateGrade(98))
    println(calculateGrade(970))

    val lamda = {number: Double -> number == 2.1231}
    println(invokeLamda(lamda))
    println(invokeLamda ({ it > 3.22 }))

    println(invokeLamda { it > 3.22 })
}

// 확장 함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!!!"
}
fun extendString(name: String, age:Int) : String{
    val introduceMySelf : String.(Int) -> String = {
        "I'm best ${this} and ${it} years old"
    }
    // ${this} -> String.(), ${it} -> 만약 리턴 받을 파라미터가 1개일 경우 사용 -> Int
    return name.introduceMySelf(age)
}

// 람다의 Return
val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect" // calculateGrade 람다식은 항상 String 값을 리턴받으므로 정수형 인자가 들어오면 처리할 구무이 없으므로 else 문 작성해야 함
        else -> "Error" // 람다는 마지막 표현식은 람다의 value type을 결정
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lambda: (Double) -> Boolean) : Boolean {
    return lambda(2.32323)
}

// 람다식을 사용하기 위해서는
// 1. kotlin interface(x) -> java interface(o)
// 2. 그 인터페이스는 딱 하나의 메소드만 가져야 합니다.
