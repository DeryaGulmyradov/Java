package java5;

import java.util.Scanner;

public class CarPurchaseSystem {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Model ? (X/Y): ");
        String carModel = myScanner.nextLine();
        float price = 0;
        if (carModel.compareToIgnoreCase("Y")==0){
            price = 30000;
            System.out.print("Price $"+price+", do you want body package? (Y/N): ");
            String bodyPackage = myScanner.nextLine();
            if (bodyPackage.compareToIgnoreCase("Y")==0){
                price = price + 5000;
            }
            else if (bodyPackage.compareToIgnoreCase("N")==0) {
            }
            else{
                System.out.println("you should enter Y or N");
            }
            System.out.print("Price $"+price+", do you want sound package? (Y/N): ");
            String soundPackage = myScanner.nextLine();
            if (soundPackage.compareToIgnoreCase("Y")==0){
                price = price + 3000;
            }
            else if (soundPackage.compareToIgnoreCase("N")==0) {
            }
            else{
                System.out.println("you should enter Y or N");
            }
        }
        else if (carModel.compareToIgnoreCase("X")==0){
            price = 50000;
            System.out.print("Price $"+price+", do you want body package? (Y/N): ");
            String bodyPackage = myScanner.nextLine();
            if (bodyPackage.compareToIgnoreCase("Y")==0){
                price = price + 7000;
            }
            else if (bodyPackage.compareToIgnoreCase("N")==0) {
            }
            else{
                System.out.println("you should enter Y or N");
            }
            System.out.print("Price $"+price+", do you want sound package? (Y/N): ");
            String soundPackage = myScanner.nextLine();
            if (soundPackage.compareToIgnoreCase("Y")==0){
                price = price + 4000;
            }
            else if (soundPackage.compareToIgnoreCase("N")==0) {
            }
            else{
                System.out.println("you should enter Y or N");
            }
        }
        else {
            System.out.println("please enter X or Y");
        }
        System.out.println("Total price iss $"+price);

    }
}
