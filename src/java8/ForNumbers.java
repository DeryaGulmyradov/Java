package java8;

public class ForNumbers {
    public static void main(String[] args) {
        /*for (int i=1; i<41; i++){
            System.out.print(i+"  ");
            if (i%5==0){
                System.out.println();
            }
        }
        */
        int num = 0;

        for ( int i=0; i<5; i++ ){
            System.out.println();
            for (int j=1; j<5; j++){
                System.out.print(" "+num);
                num = num+1;
            }

        }
    }
}
