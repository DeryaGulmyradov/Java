package java8;

public class DoWhileForCalendar {
    public static void main(String[] args) {
        //do while -> first execute then condition
        //while -> first condition then condition
   //     int month = 0;
  //      int day = 0;
        //***For Loop***
        /*for (int month=1; month < 13; month++){
            System.out.println("Month: "+ month);
            System.out.println("_______________");
            for (int day=1; day<31; day++){
                System.out.println(month+"/"+day+"/2020");
            }
        }
         */
    // ***  While
        /*int month = 1;
        while (month<13){
            System.out.println("month "+month+"\n_____________");

            int day = 1;
            while (day<31){
                System.out.println(month+"/"+day+"/2020");
                day ++;
            }
            month++;
        }
         */
        int month = 1;
        do {
            int day = 1;
            do {
                System.out.println(month+"/"+day+"/2020");
                day++;
            }
                while (day<31);

            month++;
        }
        while (month<13);


    }
}
