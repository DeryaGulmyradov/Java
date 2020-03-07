package java14;

import java.util.Arrays;

public class demensionalArray {
    public static void main(String[] args) {
        int array [] [] = new int[3] [3];
        int counter = 1;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++  ){
                array [i] [j] = counter;

                counter ++;
            }
                int array1 [] = array [i];
                System.out.println(Arrays.toString(array1));
        }
    }
}
