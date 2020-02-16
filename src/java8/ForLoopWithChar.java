package java8;

public class ForLoopWithChar {
    public static void main(String[] args) {
        /*char letter = 'a';
        for (int i=1; i<6; i++){
            System.out.println();
            System.out.print(i+" ");

            for (int j=1; j<5; j++){
                System.out.print(letter+" ");
                letter++;
            }
        }
        */
        char letter = 'a';
        int number = 0;
        for (int i=1; i<6; i++) {
            System.out.println();
            System.out.print(i + " ");
            for (number=0; number < 5; number++) {
                System.out.print(letter + " ");
                letter++;
            }
        }
    }
}
