package java4;

import java.util.Scanner;

public class BuyDontBuy {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter colour of Item. \"R\" for Red and \"B\" for Blue: ");
        String colour = myScanner.nextLine();
        if (colour.compareToIgnoreCase("R")==0) {
            float colourPoint = 20;
            System.out.print("Please enter price: ");
            float price = myScanner.nextFloat();
            System.out.print("please enter discount percentage : ");
            float percentage = myScanner.nextFloat();
            float discountRate = percentage *  price / 100;
            float pointOfItem = percentage * discountRate -colourPoint;
            if (pointOfItem <= 20) {
                System.out.print("Buy it now");
            } else if (pointOfItem > 20 && pointOfItem <= 40) {
                System.out.print("Buy it now");
            } else
                System.out.println("never buy it");
        }
        else if (colour.compareToIgnoreCase( "B")==0) {
            float colourPoint = 10;
            System.out.print("Please enter price: ");
            float price = myScanner.nextFloat();
            System.out.print("please enter discount percentage : ");
            float percentage = myScanner.nextFloat();
            float discountRate = percentage *  price / 100;
            float pointOfItem = percentage * discountRate -colourPoint;
            if (pointOfItem <= 20) {
                System.out.print("Buy it now");
            } else if (pointOfItem > 20 && pointOfItem <= 40) {
                System.out.print("Buy it now");
            } else
                System.out.println("never buy it");
        }
        else
            System.out.print("Please enter R or B");

    }
}
