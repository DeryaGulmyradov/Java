package java4;

import java.util.Scanner;

public class ClockDegree {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Hour: ");
        float hour = myScanner.nextFloat();
        System.out.print("Enter Minute: ");
        float minute = myScanner.nextFloat();
        if (minute>59) {
            System.out.println("minute has to be less than 60");
        }
        else {
            double hourInDegree = (hour % 12 * 30) + (minute * 0.5); //in 1 min, min moves 6 degree, hour moves 0.5 degree
            double initialDegree1 = Math.abs(minute * 6 - hourInDegree);
            double initialdegree2 = 360 - initialDegree1;
            System.out.println("Difference between minute hand and hour hand is " + Math.min(initialDegree1,initialdegree2) + "  degree.");
        }
    }
}
