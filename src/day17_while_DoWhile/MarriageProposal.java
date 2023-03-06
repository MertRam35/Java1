package day17_while_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me ?");
        String answer = scan.next().toLowerCase();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("ınvalid answer. please re-enter");
            answer = scan.next().toLowerCase();}

        if (answer.equalsIgnoreCase("yes")) System.out.println("congratulations");
        else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Goodbye");

        }

        }
/*        while (!(answer.equalsIgnoreCase("yes")) || !(answer.equalsIgnoreCase("no"))) {
            System.out.println("ınvalid answer. please re-enter");
            answer = scan.next().toLowerCase();
        }*/


    }

