package java15;

public class MovieDecision {
    public static void main(String[] args) {
        System.out.println(watchMovie(20,4,2));


    }
    public static String watchMovie (int IMDB , int votes, int boxOffice){
        int result = IMDB*votes/boxOffice;
        if (result>10){
            return "whatch the movie";
        }
        else {
            return "dont whatch";
        }
    }
}
