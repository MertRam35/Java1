package day17_while_DoWhile;

import java.util.Scanner;

public class calculator2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a*b );
        System.out.println( "do you want to continue? yes/no");
        String answer = scan.next().toLowerCase();
        while ( answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter two numbers");
             a = scan.nextInt();
             b = scan.nextInt();

            System.out.println(a*b );
        }


    }
}
