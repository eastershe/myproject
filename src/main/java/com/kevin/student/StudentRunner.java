package com.kevin.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass = 40;
        Student stu = new Student("kevin", 6 , 90);
        stu.print();
        Student stu2 = new Student("tommy", 60 , 40);
        stu2.print();
        Student stu3 = new Student("Jacky", 46 , 90);
        stu3.print();

        GraduateStudent gstu = new GraduateStudent("kotlin",49,90,60);
        gstu.print();

        System.out.println("highest score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student's name:");
        String name = scanner.next();

        System.out.println("Please enter student's english:");
        int english = scanner.nextInt();

        System.out.println("Please enter student's math:");
        int math = scanner.nextInt();

        Student stu = new Student(name, english , math);
        stu.print();

        System.out.println("highest score: " + stu.highest());
    }
}
