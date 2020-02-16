package java8;

public class Align {
    public static void main(String[] args) {
        for (int i=10; i<20; i++){
            System.out.format("%2s", i);
        }
        System.out.println();
        for (int i=30; i<40; i++){
            System.out.format("   %s",i);
        }
    }
}
