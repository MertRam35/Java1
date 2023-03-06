package day22_MultiDimensionalArray;

import java.util.Arrays;

public class WarmTask {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] word = sentence.split(" ");
        String s = word[1];
        String result = "";
        for (int i = word[1].length()-1, j = 0; i >= 0; i--, j++) {
           result += word[1].charAt(i);
        }
        System.out.println(word[0]+" "+result+" "+word[2]);
    }
}
