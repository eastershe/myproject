package com.kevin

import java.io.File

fun main() {
//    write()
    //讀出資料
    File("data.text").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
    //寫入資料的三個方法
    File("output.txt").writeText("這是kotlin測試file寫入的範例檔案")

    File("out.txt").printWriter().use {
        it.println("這是第一行")
        it.println("這是第二行")
        it.println("這是第三行")
    }
    File("out.txt").bufferedWriter().use {
        it.write("這是適用於寫入大內容資料\n")
        it.write("這是適用於寫入大內容資料\n")
        it.write("這是適用於寫入大內容資料\n")
    }
}