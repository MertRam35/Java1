package day16_ForLoop;

import java.util.Scanner;

public class PalinDrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String drow = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            drow += word.charAt(i);
        }
        if (drow.equalsIgnoreCase(word)) {
            System.out.println("palindrome");
        } else System.out.println("wrong");
        System.out.println(drow);


    }
}
