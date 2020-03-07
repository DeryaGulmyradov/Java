package java13;

import java.util.Arrays;

public class Half {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,6,7,8,9};
        int firstArray [] = new int[array.length/2];
        int secondArray [] = new int[array.length-firstArray.length];

        for (int i = 0; i<firstArray.length; i++){
            firstArray [i] = array [i];
        }
        System.out.println(Arrays.toString(firstArray));

        for (int j = firstArray.length; j < array.length-1; j++){
            secondArray [0] = array [j];
        }
        System.out.println(Arrays.toString(secondArray));
    }


}
