package java6;
import java.util.ArrayList;

public class While {
    public static void main(String[] args) {

        Boolean inProgress = true;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int i = 0;

        while(inProgress) {
            System.out.println("Hello"+i);
            nums.add(i);
            if(i == 5) {
                inProgress = false;
            }
            i++;
        }

        for (int k = 0; k<nums.size(); k++) {
            System.out.print(nums.get(k));
        }
    }
}
