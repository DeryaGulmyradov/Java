package java6;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int elementNumOfArray, sum = 0;
        System.out.println("Enter element num of array: ");
        elementNumOfArray = myScanner.nextInt();
        int array[] = new int[elementNumOfArray];
        System.out.println("Enter elements");
        for (int i = 0; i<elementNumOfArray; i ++){
            array[i] = myScanner.nextInt();
            sum = sum + array [i];
            System.out.println(sum);
        }
        System.out.println("Sum" + sum);


    }
}
