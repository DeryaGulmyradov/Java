package java15;

public class removeSpecaes {
    public static void main(String[] args) {

        removeSpace("it is a perfect day to study");

    }
    public static void removeSpace (String sentence){

        for (int i=0; i<sentence.length(); i++){

            if (sentence.charAt(i) != 32){

                System.out.print(sentence.charAt(i));
            }
            else {
                System.out.print("-");
            }
        }

    }
}
