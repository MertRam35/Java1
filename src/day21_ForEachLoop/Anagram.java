package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


        String str1 = "abcd";
        String str2 = "bcda";

        char[] str11 = str1.toCharArray();
        char[] str22 = str2.toCharArray();
        Arrays.sort(str11);
        Arrays.sort(str22);
        boolean a = Arrays.equals(str11, str22);
        System.out.println(Arrays.toString(str11));
        System.out.println(Arrays.toString(str22));
        System.out.println(a);

    }
}
