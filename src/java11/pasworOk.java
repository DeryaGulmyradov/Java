package java11;

import java.util.Scanner;

public class pasworOk {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String password = myScanner.nextLine();

        if (password == "Derya123") {
            System.out.println("Password is ok");
        }
        else if (password.length() < 6) {
            System.out.println("Password should be at least 6 character");
        }
        System.out.println("wrong password");
    }
}
