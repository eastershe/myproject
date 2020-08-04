package com.kevin.kotlin

import java.util.*

fun main() {
//    userInput()
    val stu = Student("hank", 80, 90)
    stu.print()
    println("Highest score is : ${stu.highest()}" )
}

private fun userInput() {
    val scanner = Scanner(System.`in`)

//    print("Please enter student's name:")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english:")
    var english = scanner.nextInt()

    print("Please enter student's math:")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()

    stu.namecheck()
}

class Student (var name:String?, var english:Int, var math:Int){
    fun print(){
       println("$name\t$english\t$math\t${getAverage()}\t${passOrFaild()}\t${grading()}")
    }

    fun highest() = if (english > math)
    {
        println("Highest score is English")
        english
    } else{
        println("Highest score is Math")
        math
    }

    fun passOrFaild() = if (getAverage() >= 60) "PASS" else "FAILD"

    fun namecheck() = (name?.length)

    fun getAverage() = (english + math)/2

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
}