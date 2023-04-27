package replits;

import java.util.Scanner;

public class WordCount {

    public static int wordCount(String words) {
        // your code
String [] array=words.split(" ");
int count = array.length;
return count;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
