package day17_while_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = scanner.nextInt();
        while (!(age > 0 && age < 120)) {
            System.err.println("Invalid entry, please re-enter");
            age = scanner.nextInt();
        }

        System.out.println("Are you a US citizen ? yes/ no");
        String answer = scanner.next().toLowerCase();
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {//
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Are you a US citizen ? yes/ no");
            answer = scanner.next();
        }
        if ( age >= 18 && answer.equals("yes")){
            System.out.println("eligible to vote");
        }else System.out.println("not eligible");
        scanner.close();


    }
}
