package java13;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
       int array11 [] = {1,2,3,4,5,9};
       int array22 [] = {6,7,8,9,1,0};

       myMethod(array11,array22);
    }

    public static void myMethod (int array1 [], int array2 []){
        int arraySum [] = new int[array1.length+array1.length];

        for (int i=0; i<array1.length; i++){
            arraySum [i] = array1 [i];
            //System.out.println(Arrays.toString(arraySum));
        }
        for (int j=0; j<array2.length; j++){
            arraySum [j+array1.length] = array2 [j];
            if (j==array2.length-1) {
                System.out.println(Arrays.toString(arraySum));
            }
        }
    }
}
