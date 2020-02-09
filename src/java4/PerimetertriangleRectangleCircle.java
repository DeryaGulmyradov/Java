package java4;

import java.util.Scanner;

public class PerimetertriangleRectangleCircle {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Please enter \"C\" for Circle, \"R\" for Rectangle, \"T\" for Triangle perimeter: ");
        String input = myScanner.nextLine();
        if (input.equals("C")){
            System.out.print("Please enter radius: ");
            float circle = myScanner.nextFloat();
            System.out.print("Perimeter of Circle is "+ 2*3.14*circle);
        }
        else if (input.equals(("R"))){  //input.CompareTo
            System.out.print("Please enter Length: ");
            float lengthRectangle = myScanner.nextFloat();
            System.out.print("Please enter hight: ");
            float hightRectangle = myScanner.nextFloat();
            System.out.print("Perimeter of Rectangle is "+ lengthRectangle*hightRectangle*2);
        }
        else if (input.equals(("T"))){
            System.out.print("Please enter Side1: ");
            float side1Triangle = myScanner.nextFloat();
            System.out.print("Please enter Side2: ");
            float side2Triangle = myScanner.nextFloat();
            System.out.print("Please enter Side3: ");
            float side3Triangle = myScanner.nextFloat();
            System.out.print("Perimeter of Rectangle is "+ side1Triangle+side2Triangle+side3Triangle);
        }
        else
            System.out.println("You should enter \"C\",\"R\" or \"T\"");
    }
}
