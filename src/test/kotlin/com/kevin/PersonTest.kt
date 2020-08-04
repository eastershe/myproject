package com.kevin.kotlin

import com.kevin.Human
import com.kevin.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest{
    @Test
    fun humanBmiTest(){
        val human = Human("tom",56f,1.6f)
        Assertions.assertEquals(56f/(1.6f*1.6f) , human.bmi())
    }

    @Test
    fun personTest(){
        val person = Person(60f , 1.78f)
        Assertions.assertEquals(60f/(1.78f*1.78f) , person.bmi())
    }
}