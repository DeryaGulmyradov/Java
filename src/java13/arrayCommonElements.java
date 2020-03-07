package java13;

public class arrayCommonElements {
    public static void main(String[] args) {
        int array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int array2[] = {5, 7, 12, 4, 55, 67, 99};
        myMethod(array1,array2);

    }
    public static void myMethod (int array1 [], int array2 []){

        for (int i = 0; i < array1.length; i++ ){
            int a = array1 [i];
            for (int j=0; j<array2.length; j++){
                if (array2 [j]==a){
                    System.out.println(array2 [j]);
                }
            }
        }

    }
}
