package com.kevin;

import com.kevin.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void higestTest(){
        Student student = new Student("kevin",60,68);
        Assertions.assertEquals(68 , student.highest());
    }

    @Test
    void averageTest(){
        Student student = new Student("kevin", 60, 68);
        Assertions.assertEquals((60+68)/2 , student.getAverage());
    }
}
