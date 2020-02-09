package java5;

import java.util.Scanner;

public class SwitchNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        byte numberInNumber = myScanner.nextByte();
        String numberInWord = "";
        switch (numberInNumber){
            case 1:
                numberInWord = "one";
                break;
            case 2:
                numberInWord = "two";
                break;
            case 3:
                numberInWord = "three";
                break;
            default:
                System.out.println("enter number 1,2 or 3");
        }
        System.out.println(numberInWord);
    }
}
