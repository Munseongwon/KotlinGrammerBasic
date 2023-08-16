package com.example.kotlinbasicgrammer

//Singleton Pattern -> 실행될 때 CarFactory 한 번만 호출되어 메모리 누수 방지
object CarFactory{
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int) : Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(CarFactory.cars.size.toShort())
    println(car)
    println(car2)
}