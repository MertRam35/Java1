package day16_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a word");
        String last = "";
        String word = scanner.nextLine();
        for (int i = word.length()-1; i >= 0; i--) {
            last += (word.charAt(i));


        }
        System.out.println("last = " + last);
        // System.out.println(last);


    }
}
