package java15;

public class cityNameStartingWithA {
    public static void main(String[] args) {
        String array [] [] = {{"Azerbeyjan"}, {"Houston"}, {"Amsterdam"}, {"Ashgabat"}};
        CityStartA(array);

    }

    public static void CityStartA (String [] [] city){
        for (int i=0; i<city.length; i++){

            if (city [i] [0].charAt(0) == 'A' ) {
                System.out.println(city [i] [0]);

            }

        }
    }
}
