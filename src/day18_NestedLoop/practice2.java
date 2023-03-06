package day18_NestedLoop;

import java.util.Scanner;

public class practice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer = "";
        while (true) {
            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even NUmber");
            } else System.out.println("Odd number");


            System.out.println("Would you like to enter another number");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Would you like to enter another number");
                answer = scan.next();


            }
            if (answer.equals("no")) {System.out.println("thanks");
            break;}

            // while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {


            //}

        }


    }
}
