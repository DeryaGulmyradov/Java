package java14;

public class multiDemArrayString {
    public static void main(String[] args) {
        int n = (int) (Math.random()*10);
        int m=0;
        String array [] [] = new String [n][m];
        for (int i=0; i<n; i++) {
            m = (int) (Math.random()*10);
            for (int j=0; j<m; j++){
                //array [i] [j] =  (int) ((Math.random()*26)+97);

            }
            System.out.println(array);
        }
    }
}
