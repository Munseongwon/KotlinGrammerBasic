package com.example.kotlinbasicgrammer

// 2. Data Class -> 데이터를 담는 그릇이 담겨 있는 클래스
// pojo class -> 모델이 되는 클래스
data class Ticket(val comapnyName: String, val name : String, var data : String, var seatNumber : Int)
class TicketNormal(val comapnyName: String, val name : String, var data : String, var seatNumber : Int)

// toString(), hashCode(), equals(), copy() 메소드를 데이터 클래스를 사용하면 쉽게 만들어준다.
fun main(){
    val ticketAir = Ticket("koreanAir", "JoeMoon", "2023-08-12", 23)
    val ticketNormal = TicketNormal("koreanAir", "JoeMoon", "2023-08-12", 23)

    println(ticketAir)
    println(ticketNormal)}
