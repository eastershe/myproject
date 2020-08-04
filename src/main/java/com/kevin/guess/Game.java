package com.kevin.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secrect = random.nextInt(10)+1;
        System.out.println(secrect);

        int number = 0;
        while (number != secrect){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your number : ");
            number = scanner.nextInt();
            if (number < secrect){
                System.out.println("Higher!!");
            }else if(number > secrect){
                System.out.println("Lower!!");
            }else{
                System.out.println("Great, the answer is : " + number);
            }

        }
//        int i = 0;
//       do {
//           System.out.println(i);
//           i++;
//       }while (i <= 10);
    }
}
