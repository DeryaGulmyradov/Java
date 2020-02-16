package java8;

public class CharAtIndex {
    public static void main(String[] args) {
        String name = "Java is fun";
        /*for (int i=0; i<name.length();i++){
            if (name.charAt(i)=='a'||name.charAt(i)=='i'||name.charAt(i)=='u'){
                System.out.println(name.charAt(i));
            }
        }*/
        int i = 0;
        while (i<name.length()){
            if (name.charAt(i)=='a'||name.charAt(i)=='i'||name.charAt(i)=='u'){
                System.out.println(name.charAt(i));

            }
            i++;
        }
    }
}
