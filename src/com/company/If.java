package com.company;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int myInt = myScanner.nextInt();
        if (myInt%2==1){
            System.out.println("the number is odd");
        }
        System.out.println("the number is even");
    }
}
