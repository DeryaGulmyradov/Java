package java6;

import java.util.Scanner;

public class printReceipt {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        float potato = 2.49f, tomato = 4.79f, banana = 1.65f, carrot = 7.88f, apple = 0.99f;
        System.out.print("Potato -> 123 \nTomato -> 124 \nBanana -> 125 \n Carrot -> 126 \n Apple -> 127 \nPlease enter item ID: ");
        int itemId = myScanner.nextInt();
        float priceItem = 0f;
        String nameItem = "";
        String firstItem = "";

        if  (itemId == 123|| itemId == 124 || itemId == 125 || itemId == 126 || itemId == 127) {
            switch (itemId){
                case 123:
                    priceItem=potato;
                    nameItem = "Potato";
                    System.out.println("Potato - $"+potato);
                    break;
                case 124:
                    priceItem=tomato;
                    break;
                case 125:
                    priceItem=banana;
                    break;
                case 126:
                    priceItem=carrot;
                    break;
                case 127:
                    priceItem=apple;
                    break;
            }
            System.out.print("Please enter quantity item: ");
            int quantity = myScanner.nextInt();
            priceItem = priceItem*quantity;
            System.out.println("Item name  Quantity Price");
            System.out.println("_________  ________ _____");
            System.out.println(nameItem+"     "+quantity+"     $"+priceItem);

        }
        else
            System.out.println("Please correct item ID");
    }
}
