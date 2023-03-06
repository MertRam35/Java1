package day13_StringClass;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write Three Words");
        String text = scanner.next();
        String text2 = scanner.next();
        String text3 = scanner.next();
        int a = text.length();
        int b = text2.length();
        int c = text3.length();
        if (a == b && a == c) {
            System.out.println("All Words are same Length");
        } else if
        (a == b || a == c || b == c) {
            System.out.println("Not same nor Different Length");
        }

        if (a != b && a != c && b != c) {
            System.out.println("All different length");


        }
    }
}
