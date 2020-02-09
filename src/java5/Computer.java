package java5;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter S, M or L : ");
        String size = myScanner.nextLine();
        float price = 0;
        float discount = 0;
        if (size.compareToIgnoreCase("S")==0 || size.compareToIgnoreCase("m" )==0 || size.compareToIgnoreCase( "l")==0) {
            if (size.compareToIgnoreCase("s")==0){
                price = 9.99f;
                System.out.print("Price is $"+price+"\nDo you want discount? Type \"Y\" for Yes, \"N\" for No : ");
                String yesNo = myScanner.nextLine();
                if (yesNo.compareToIgnoreCase("Y")==0){
                    discount = 0.33F;
                }
                else if (yesNo.compareToIgnoreCase("N")==0){
                    discount = 0;
                }
                else {
                    discount = 12345;
                }
            }
            else if (size.compareToIgnoreCase("m")==0){
                price = 10.99f;
                System.out.print("Price is $"+price+"\nDo you want discount? Type \"Y\" for Yes, \"N\" for No : ");
                String yesNo = myScanner.nextLine();
                if (yesNo.compareToIgnoreCase("Y")==0){
                    discount = 0.66F;
                }
                else if (yesNo.compareToIgnoreCase("N")==0){
                    discount = 0;
                }
                else {
                    discount = 12345;
                }
            }
            else {
                price = 11.99f;
                System.out.print("Price is $" + price + "\nDo you want discount? Type \"Y\" for Yes, \"N\" for No : ");
                String yesNo = myScanner.nextLine();
                if (yesNo.compareToIgnoreCase("Y") == 0) {
                    discount = 0.99F;
                } else if (yesNo.compareToIgnoreCase("N") == 0) {
                    discount = 0;
                } else {
                    discount = 12345;
                }
            }
            if (discount==12345){
                System.out.println("Please enter N or Y");
            }
            else
                System.out.println("Price is $" + price + "\nDiscount is $" + discount +"\nTotal amount is "+price+" - "+discount+" = "+ (price-discount));
        }
        else {
            System.out.println("Please enter only S, M or L");
        }
    }
}
