package java11;

import java.util.Scanner;

public class ReverseString {
    public static void ReverseHello () {
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.next();
        System.out.println(myString);
        for (int i=myString.length(); i>0; i--){
            System.out.print(myString.charAt(i-1));
        }
    }
    public static void main(String[] args) {

        System.out.println("Enter text to be reversed");
        ReverseHello();
    }
}
