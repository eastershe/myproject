package com.kevin.guess

import java.util.*

fun main() {
    val secrect = Random().nextInt(10)+1
    var scanner = Scanner(System.`in`)
    for (i in 1..5){
        print("Please enter a number (${i}/5) : ")
        var number = scanner.nextInt()
        println("第${i}次 : $number")
        if (number > secrect){
            println("Lower")
        }else if (number < secrect){
            println("Highter")
        }else{
            println("Good,the answer is : $secrect")
            break
        }
    }
    println("程式結束")
}