package java13;

import java.util.Arrays;

public class arrayWithRandomNumbers {
    public static void main(String[] args) {
        myMethod(10);

    }
    public static void myMethod (int n){
        int array [] = new int[n];
        for (int i = 0; i<array.length; i++){
            array[i] = 1000 + (int) (Math.random()*4000);

        }
        System.out.println(Arrays.toString(array));

    }
}
