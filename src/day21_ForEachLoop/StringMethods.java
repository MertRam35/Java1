package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {


        String sentence = "Wooden@Spoon";
        String[] b = sentence.split("@");
       // b[0] = b[0] + "d";

        char[] a = sentence.toCharArray();

        System.out.println(Arrays.toString(a));


        System.out.println(Arrays.toString(sentence.split("@")));
    }
}
