package com.kevin.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.AssertionError

class StudentTest{
    @Test
    fun highestTest(){
        val student = Student("rose",50,89)
        Assertions.assertEquals(89,student.highest())
    }

    @Test
    fun bmiTest(){
        val student = Student("rose",50,89)
        Assertions.assertEquals((50+89)/2 , student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("rose",50,89)
        Assertions.assertEquals('D',student.grading())
    }

}