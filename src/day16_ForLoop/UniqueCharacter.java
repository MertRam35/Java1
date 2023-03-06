package day16_ForLoop;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= word.length() - 1; i++) {

            char ch = word.charAt(i);
            if (word.indexOf(ch) == word.lastIndexOf(ch)) {
                result.append(ch);
            }

        }
        System.out.println("result = " + result);


    }
}
