package com.kevin;

public class Person {
    String name;
    // 屬性
    float weight;
    float height;

    // 建構子
    public Person(float weight,float height){ //區域變數
        this.weight = weight;
        this.height = height;
    }

    // 建構子多載 overloading
    public Person(String name, float weight, float height){
        this(weight,height);
        this.name = name;
    }

    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }
    public void hello(){
        System.out.println("Hello World!!!");
    }
}
