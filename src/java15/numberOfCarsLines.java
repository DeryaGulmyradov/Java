package java15;

public class numberOfCarsLines {
    public static void main(String[] args) {
        char array [] = {'h','o','w',' ', 'a', 'r', 'e', ' ', 'y', 'o', 'u', ' ', ' ', 't', 'o', 'd', 'a', 'y', '\1'};
        countWords(array);

    }
    public static void countWords (char array []){
        int words = 1;
        int space = 0;
        int line = 0;

        for (int i = 0; i<array.length; i++){
            if (array [i] == '\1'  ) {
                line++;
            }
            else if (array [i] == ' ') {
                words++;
                space++;
                if (array [i] == array [i+1] && array [i] != array.length){
                    words--;
                }
            }
        }
        System.out.println("number of words: "+ words);
        System.out.println("number of spaces: " + space);
        System.out.println("number of lines: "+ line);
    }

}
