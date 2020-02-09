package java5;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        byte monthInNumber = myScanner.nextByte();
        switch (monthInNumber){
            case 1:
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            default:
                System.out.println("only 1,2,3");
                break;

        }
    }
}
