package com.kevin.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 60
    val stu = Student("hank", 80, 90)
    val stu2 = Student("judy", 40, 90)
    val stu3 = Student("jane", 80, 20)
    stu.print()
    stu2.print()
    stu3.print()

    val gstu = GraduateStudent("luke", 60,68,80)
    gstu.print()

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
class GraduateStudent(name: String?, english: Int, math: Int, var thesis: Int) : Student(name, english, math) {
    companion object{
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFaild()}\t${grading()}")
    }

    override fun passOrFaild(): String {
        return if (getAverage() >= GraduateStudent.pass) "PASS" else "FAILD"
    }
}

open class Student (var name:String?, var english:Int, var math:Int){
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            println("測試中的程式碼...")
        }
    }

   open fun print(){
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

   open fun passOrFaild() = if (getAverage() >= pass) "PASS" else "FAILD"

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