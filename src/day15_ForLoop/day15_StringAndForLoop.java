package day15_ForLoop;

import java.util.Scanner;

public class day15_StringAndForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word");
        String text = scanner.next();
if (text.charAt(0)=='x') System.out.println(text.replaceFirst("x", "a"));



    }
}
