package day13_StringClass;

import java.util.Scanner;

public class ThreeLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a three letter word");
        String text = scanner.nextLine();
        if (text.length() ==3){
            char b = text.charAt(1);
            switch (b){
                case 'a':
                    System.out.println("Cool word");
                    break;
                default:
                    System.out.println("Okay word");
            }

        }if (text.length() >3) {
            System.out.println("Word is too Long");
        }if (text.length()<3)System.out.println("Word is too Short");

    }
}
