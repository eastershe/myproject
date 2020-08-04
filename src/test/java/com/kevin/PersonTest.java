package com.kevin;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person person = new Person(67f,1.7f);
        Assertions.assertEquals(67f/(1.7f*1.7f) , person.bmi());
    }
}
