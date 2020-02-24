package java11;

public class ReverseString {
    public static void ReverseHello () {
        String myString = "Hello";
        for (int i=myString.length(); i>0; i--){
            System.out.print(myString.charAt(i-1));
        }
    }
    public static void main(String[] args) {
        ReverseHello();
    }
}
