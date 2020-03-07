package java12;

public class createCode {
    public static void letter (){
        for (int i=0; i<3; i++){
            System.out.print((int) (Math.random()*10));

        }
    }
    public static void number () {
        for (int i=0; i<3; i++){
            System.out.print((char) ((int) (Math.random()*26+97)) );
        }
    }

    public static void main(String[] args) {

        letter();
        number();

    }
}
