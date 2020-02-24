package java11;

import java6.While;

import java.util.Scanner;

public class numberGuessingGame {
    public static void  name123 (){
        Scanner myScanner = new Scanner (System.in);
        int guess = 50;
        boolean win = true;
        while (win) {
            System.out.print("Guess my number: ");
            int number = myScanner.nextInt();
            if (number == guess) {
                System.out.println("true");
                win = false;
            }
            else if (number < guess) {
                System.out.println("guess num is larger");
            }
            else
                System.out.println("guess num is less");
        }
    }
}
