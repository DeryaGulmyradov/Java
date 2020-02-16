package java8;

public class PrintNumsForLoop {
    public static void main(String[] args) {
        int num1 = 1;
        while (num1<10) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println(num1+""+i + "" + j);
                }
            }
            num1++;
        }
    }
}
