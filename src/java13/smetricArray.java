package java13;

public class smetricArray {
    public static void main(String[] args) {
        int array1 [] = {1,2,3,4,3,2,1};
        myMethod(array1);
    }
    public static void myMethod (int array []){
        int count = array.length;
        boolean b = true;
        for (int i = 0; i<array.length/2; i++){
            count--;
            if (array [i] != array [count]){
                System.out.println("Not smetric");
                b = false;
                break;
            }
        }
        if (b){
            System.out.println(" smetric");
        }

    }
}
