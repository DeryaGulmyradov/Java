package java11;

public class ReverseInt {
    public static void reverseInt (){
        int nums = 123056;
        int length = Integer.toString(nums).length();
        int converter = 10;
        int reverse=0;
        int devider = 1;
        for (int i=0; i<length; i++){
            reverse = ((nums%converter)-reverse)/devider;
            System.out.print(reverse);
            converter *= 10;
            devider *=10;
        }
    }
    public static void main(String[] args) {
        ReverseInt.reverseInt();
    }
}
