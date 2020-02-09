package java5;

import java.util.Scanner;

public class MathOrArt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("enter math or art: ");
        String mathArt = myScanner.nextLine();
        if (mathArt.equals("art")){
            System.out.println("Nice Choice");
        }
        else if (mathArt.equals("math")) {
            System.out.print("tutor Y N : ");
            String tutor = myScanner.nextLine();
            if (tutor.equals("Y")) {
                System.out.print("OK");
            } else if (tutor.equals("N")) {
                System.out.print("Study yourself");
            } else {
                System.out.print("enter Y or N");
            }
        }
        else {
            System.out.print("enter art or math");
        }
    }
}
