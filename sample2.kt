package com.example.kotlinbasicgrammer

/*
author: SeongwonMun
created: 2023.08.14
TIL: Kotlin basic grammer
*/

fun main(){

    array()

    checkNumber(1)

    forAndWhile()

    nullCheck()

    ignoreNull()
}

//4.조건식
fun maxBy(a: Int, b: Int) : Int{
    if(a > b){
        return a
    } else {
        return b
    }
}

fun maxBy2(a: Int, b: Int) = if(a>b) a else b // expression

fun checkNumber(score: Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
    print("b: ${b} ")
    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement -> 코틀린 은 Expression
// Expression -> 뽀짝 뽀짝 해서 뭘 만들고 리턴 하면 표현식
// Statement -> 명령어를 지시한 문장 -> 리턴 값 x


// 5. Array and List
// Array -> Mutable(값 변경 가능)
// List 1. List(읽기만 가능), List 2. MutableList(값 변경 가능한 리스트)
fun array(){

    // init
    var array = arrayOf(1, 2 ,3)
    var list = listOf(1, 2, 3)

    var array2 = arrayOf(1, "2", "304f")
    var list2 = listOf(1, "d", 11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)

    println(array)
    println(list)

    println(array2)
    println(list2)

    println(result)
    println(arrayList)
}

// 6. For / While
fun forAndWhile(){
    val students = arrayListOf("Seongwon", "harim", "juncheol", "minsang")
    for (name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 ${name}")
    }

    var sum = 0
    for (i in 1 ..100){
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("current index : $index")
        index++
    }
}

// 7. Nullable / NonNull
fun nullCheck(){
    // NPE -> Null pointer Exception: Runtime 시점 에서 잡힘 -> Complie 시점 에서는 안 잡힘(Java)
    // ? -> Complie 시점 에서 null 체크를 할 게(kotlin)

    var name  = "john"
    var nullName: String? = null

    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()
    // if the nullname is not null -> return value and  but the nullname is null -> return the null

    // ?: 엘비스 연산자
    val lastName : String? = "Hong"
    val fullName = name + " " + (lastName?: "No lastName")
    // lastName is not null -> return value and run but lastname is null -> run and return null
    println(fullName)

    //!! -> complier 한테 나는 null이 아닌 것
    //정말로 확실하지 않은 이상 쓰지 않는 것을 추천
    //웬만하면 ?, ?: 연산자를 사용
}

fun ignoreNull() {
//    val mNotNull : String = str!!
//    val upper = mNotNull.toUpperCase()

    //let -> email not null -> run the let func
    //receiver object => using lamda structure
    val email : String?= "botting819@nana.com"
    email?.let{
        println("my email is ${email}")
    }
//    upper?.let {
//        println(upper)
//    }

}
