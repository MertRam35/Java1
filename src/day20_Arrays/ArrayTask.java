package day20_Arrays;

import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {

        char[] letters = new char[26];
        char result = 'Z';
        for (int i = 0; i < 26; i++, result--) {
            letters[i] = result;
        }
        System.out.println(Arrays.toString(letters));
    }
}
