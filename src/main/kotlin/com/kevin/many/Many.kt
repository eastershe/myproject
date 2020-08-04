package com.kevin.many

fun main() {
    val list = listOf(5,6,7,8,9)
    println(list)

    val scores = listOf(66,77,88,99,40)
    for (i in scores){
        println(i)
    }

    val list2 = mutableListOf(5,6,7,8,9)
    list2.add(10)
    println(list2)
}