package java13;

public class maxValArray {
    public static void main(String[] args) {
        int array1 [] = {1,2,3,4,5,6,7,8,9};
        myMethod(array1);
    }
    public static void myMethod (int array []){
        int max=0;
        for (int i=0; i<array.length; i++){
            if (array [i] > max){
                max = array [i];
            }
        }
        System.out.println(max);
    }
}
