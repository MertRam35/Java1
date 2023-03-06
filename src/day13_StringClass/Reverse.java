package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write 5 characters String");
        String text;
        text = scanner.nextLine();
        int charLong = text.length();
        if (charLong > 5) {
            System.out.println("Too Long");
        } else if (charLong < 5) {
            System.out.println("Too Short");
        }else System.out.println(""+text.charAt(charLong-1)+text.charAt(charLong-2)+
                text.charAt(charLong-3)+text.charAt(charLong-4)+text.charAt(0));


        }}




