package com.kevin.guess

import java.util.*

fun main() {
//    val scanner = Scanner(System.`in`)
    var number = 0
    val secrect = Random().nextInt(10)+1
    println(secrect)

    while(number != secrect){
        print("Please enter a number : ")
        number = readLine()!!.toInt()
//        number = scanner.nextInt()
        if (number > secrect){
            println("Lower!!")
        }else if (number < secrect){
            println("Highter!!")
        }else{
            println("好極了! the answer is : $secrect")
        }
    }
}