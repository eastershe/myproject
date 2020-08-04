package com.kevin

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    var a: String? = "abcde"
     //a = null
    println(a?.length)
    println(a?.substring(2,3))
    println(a?.get(3))

    val h = Human(height = 1.7f,weight = 66.5f)
    h.hello()
    println(h.bmi())

    val score = 88
    println(score > 60)

    val c : Char = 'A'
    println(c.toInt() > 60)

//    var age = 19
//    var height = 170.5f
//    var name : String
//    name = "kevin"

}

    class Human(var name : String="", var weight : Float, var height : Float){
    init { //建構子完成式自動執行
        println("your weight is $weight kg ,and your height is $height m.")
    }
//    constructor(name : String, height: Float, weight: Float)
    fun bmi(): Float{
        val bmi = weight / (height*height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin")
    }
}