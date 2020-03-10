package java15;

public class carRange {
    public static void main(String[] args) {
        System.out.println(carrange(10,12));

    }
    public static int carrange (int MPG, int gallonInTank){
        int range = MPG*gallonInTank;
        return range;
    }
}
