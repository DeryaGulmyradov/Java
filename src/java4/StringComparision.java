package java4;

import java.util.Scanner;

public class StringComparision {
    public static void main(String[] args) {
        /*Scanner myScanner = new Scanner(System.in);
        System.out.println("Write \"M\" for male, \"F\" for femaile");
        String Gender = myScanner.nextLine();
        if (Gender.equals("M")){
            System.out.println("Male");
        }
        else if (Gender.equals("F")){
            System.out.println("female");
        }
        else
            System.out.println("You should write \"F\" for Female, \"M\" Male ");
         */
        String a = "a";
        String b = "a";
        if (a==b){  //true  and also (a.equals(b)) is true
            System.out.println("Hello");
        }
        String c = new String("x");
        String d = new String("x");
        if (c.equals((d))){  //returns true. c==d is false
            System.out.println("World");
        }




    }
}
