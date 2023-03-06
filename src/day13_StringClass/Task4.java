package day13_StringClass;

import java.util.Scanner;

/*4. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a sentence");
        String text = scanner.nextLine();

        System.out.println("Write a second sentence");
        String text2 = scanner.nextLine();
        char inFirst = text.charAt(0);

        char inSecond = text2.charAt(0);

        System.out.println(text.substring(0,1).toUpperCase()+ ". " + String.valueOf(inSecond).toUpperCase());


    }
}
