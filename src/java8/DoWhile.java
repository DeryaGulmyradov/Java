package java8;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.println("Counter :"+counter);
            counter=counter+2;
        }
        while (counter<42);
    }
}
