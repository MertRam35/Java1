package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your First number");
            int num1 = scan.nextInt();

            System.out.println("Enter your second number");
            int num2 = scan.nextInt();


            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("please re-enter");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}

