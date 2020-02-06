package com.company;

import java.util.Scanner;

public class IfElse {
    /*public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = myScanner.nextInt();
        if (year>1999){                     //if (year>1999 || year <1999) result true (||=or, &&=and)
            System.out.println("After Milenium");
        }
        else {
            System.out.println("'Before Milenium");
        }
    }*/
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter degree: ");
        int Temprature = myScanner.nextInt();
        if (Temprature > 20 && Temprature<41){
            System.out.println("Cold");
        }
        else if (Temprature>40 && Temprature<61){
            System.out.println("Hot");
        }
        else
            System.out.println("Very hot");

    }
}
