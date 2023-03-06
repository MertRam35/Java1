package day16_ForLoop;

import java.util.Scanner;

public class sumOfDigitsFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a word");
        String word = scanner.next();
        int total = 0;
        for (int i = 0; i <= word.length() - 1; i++) {

            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                total += Character.getNumericValue( word.charAt(i));
            }


        }
        System.out.println(word.charAt(0));
        System.out.println(total);


    }
}
