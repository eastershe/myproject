package com.kevin.student;

import org.w3c.dom.ls.LSOutput;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
//        int max = (english > math) ? english:math ;
//        if (english > math){
//            max = english;
//        }else {
//            max = math;
//        }
        return (english > math) ? english:math ;
    }

    public void print(){
        int average = getAverage();
        System.out.println(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" +
                ( (average >= 60) ? "PASS" : "FAILED" ) );
//        if (getAverage() > 60){
//            System.out.println("\tTURE");
//        }else{
//            System.out.println("\tFAILED");
//        }
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        System.out.println("Your grading is : " + grading);
    }

    public  int getAverage(){
        return (english + math)/2;
    }
}
