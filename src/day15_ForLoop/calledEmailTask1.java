package day15_ForLoop;

import java.util.Scanner;
/*
    7. Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com*/
public class calledEmailTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type an email address is constructed by person's first name and followed by an underscore and last name");

        String email = scanner.nextLine();
int first = email.indexOf("_" );
int q = email.indexOf("@");
        System.out.println(first);
        System.out.println();
String part1 = email.substring(0,first);
        System.out.println(part1);
String part2 = email.substring(first+1,q);
        System.out.println(part2);
        System.out.println(part2+"_"+part1+"@gmail.com");







    }
}
