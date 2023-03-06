package day19Loops;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            if (score < 60) {
                System.out.println("F");
            } else if (score < 70) {
                System.out.println("D");
            } else if (score < 80) {
                System.out.println("C");

            } else if (score < 90) {
                System.out.println("B");
            } else System.out.println("A");
            System.out.println();
            String answer = "";

            System.out.println("Would you like to continue ?");
            answer = scan.next();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP\"");
                System.exit(0);
            }
            if (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }


        }
    }

}


