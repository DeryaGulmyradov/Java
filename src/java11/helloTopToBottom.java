package java11;

public class helloTopToBottom {
    public static void main(String[] args) {
        PrintVertical("Hello");
    }
    public static void PrintVertical (String a) {
        for (int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
    }
}
