package com.example.kotlinbasicgrammer

// 3. Companion Object
// 자바의 static 대신에 사용 되는 것, 정적인 메소드 정적인 변수 선언을 할 때 사용
// private 키워드로 설정해 놓은 클래스나 메소드(정적 변수, 정적 메소드)를 사용할 수 있도록 함

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory : IdProvider{
        val myBook = "new Book"
        fun create() = Book(getId(), myBook)
        override fun getId(): Int {
            return 444
        }
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()

    val bookId = Book.BookFactory.getId()
    println("${book.id} ${book.name}")
}