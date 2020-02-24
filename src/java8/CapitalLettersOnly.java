package java8;

public class CapitalLettersOnly {
    public static void main(String[] args) {
        String myString = "I Do not Know";
        System.out.println(myString.toLowerCase());

        char c = myString.charAt(0);
        System.out.println(Character.isLowerCase(c));

        char letter;
        /*for (int i = 0; i < myString.length(); i++){
            letter = myString.charAt(i);
            if (letter > 66 && letter < 96) {
                System.out.println(myString.charAt(i));
            }
        }
         */
        for (int i = 0; i < myString.length(); i++){
            letter = myString.charAt(i);
            if (!(letter > 66 && letter < 96)) {
                System.out.println(myString.charAt(i));
            }
        }
    }
}
