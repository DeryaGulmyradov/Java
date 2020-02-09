package java5;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int myInteger = scanner.nextInt();
        String myOutput = (myInteger%2==0)? "even" : "odd";
        System.out.println("Your number is " + myOutput);
    }
}
