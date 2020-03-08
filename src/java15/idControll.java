package java15;

import java.util.Scanner;

public class idControll {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Where are you going: ");
        myMethod(myScanner.nextLine());

    }
    public static void myMethod (String where){
        if (where.equalsIgnoreCase("europe")){
            System.out.println("please use gata A");
        }
        else if (where.equalsIgnoreCase("Africa")){
            System.out.println("please use gate B");
        }
        else if (where.equalsIgnoreCase("Asia")){
            System.out.println("please use gate C");
        }
        else {
            System.out.println("wrong password");

        }
    }
}
