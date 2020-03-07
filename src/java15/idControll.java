package java15;

import java.util.Scanner;

public class idControll {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter your code: ");
        europe(myScanner.nextInt());
    }
    public static void europe (int myCode){
        if (myCode==12341){
            System.out.println("please use gata A");
        }
        else if (myCode==12342){
            System.out.println("please use gate B");
        }
        else {
            System.out.println("wrong password");
        }

    }
}
