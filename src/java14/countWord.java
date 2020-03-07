package java14;

public class countWord {
    public static void main(String[] args) {
        countWordsMethod("my name is devle");
    }
    static void countWordsMethod (String sentence){
        int numberOfWords = 1;
        for (int i=1; i<sentence.length(); i++){
            if ( sentence.charAt(i)== ' ' && sentence.charAt(i-1) !=' '){
                numberOfWords++;
            }
        }
        System.out.println(numberOfWords);
    }
}
