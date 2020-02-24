package java8;

public class PrintValuesOfArrayINT {
    public static void main(String[] args) {

        int[] nums = {7,2,1,5,4};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);

            if (i != nums.length) {
                System.out.print(", ");
            }
        }
        System.out.println();


        for (int j = nums.length-1; j >= 0; j--) {
            System.out.print(nums[j]);

            if (j != 0) {
                System.out.print(", ");
            }
        }
    }
}
