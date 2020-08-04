package com.kevin;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Person p = new Person("tom",66.5f,1.7f);
        p.hello();

        String ab = "abcde";
        System.out.println(ab.charAt(4));
        System.out.println(ab.length());
        System.out.println(ab.substring(1,4));

        int score = 88;
        System.out.println(score < 60 || score > 90);

        // java的char屬於整數型態，因此可以與int做比較，kotlin則無法
        char a = 'A';
        System.out.println(a > 60);
     //   p.weight = 66.5f;
     //   p.height = 1.7f;
        System.out.println(p.bmi());
    }
}
