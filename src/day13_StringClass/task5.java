package day13_StringClass;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a string");

        String text = scanner.nextLine();
        if (text.isEmpty()) {
            System.out.println("String is Empty");
        }
        int chara = text.length();
        if (chara > 3) {
            System.out.println("" +text.charAt(text.length() - 3)+text.charAt(text.length() - 2) +text.charAt(text.length() - 1));
        } else System.out.println(text);
    }


}
