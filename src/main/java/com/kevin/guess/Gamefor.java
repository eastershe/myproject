package com.kevin.guess;

import java.util.Random;
import java.util.Scanner;

public class Gamefor {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i=5 ; i>0 ; i--){
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.println(sum);
        int secrect = new Random().nextInt(10)+1;
        System.out.println(secrect);

        for (int i=1 ; i<5 ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a number (" + i + "/4) : ");
            int number = scanner.nextInt();
            System.out.println("第" + i + "次 : " + number);
            if (number > secrect){
                System.out.println("Lower!!");
            }else if (number < secrect){
                System.out.println("Hight!!");
            }else{
                System.out.println("Great , the answer is : " + secrect);
                break;
            }
        }
        System.out.println("結束程式");
    }
}
