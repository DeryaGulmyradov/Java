package java11;


public class VoidStringMethod {
    public static void main(String[] args) {
        System.out.println("Sun day is fun day with java");
        printMyName ();
        printMyName2("It is always fun with java");
        System.out.println(printMyName3());
        System.out.println(printMyName4("So you are also in love with java"));
        System.out.println(myInt(7));


        System.out.println();
    }
    public static void printMyName () {
        System.out.println("Yes sure");
    }
    public static void printMyName2 (String name){
        System.out.println(name);
    }
    public static String printMyName3 () {
        return "O yea I love java too";
    }
    public static String printMyName4 (String name) {
        return name;
    }
    public static int myInt (int number){
        return 9;
    }
}
