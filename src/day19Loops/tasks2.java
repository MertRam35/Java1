package day19Loops;

import java.util.Scanner;

public class tasks2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square");
            int side = scan.nextInt();
            if (side <= 0) {
                System.out.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            System.out.println("Area of Square is " + side * side);
            System.out.println("Perimeter of Square is " + 4 * side);
            System.out.println();
           // System.out.println("Would you like to calculate another Square?");
            String answer =" ";
            while (!(answer.equals("yes") || answer.equals("no")))
            {   System.out.println("Would you like to calculate another Square?");
            answer = scan.next().toLowerCase();
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                System.exit(0);
            }}
        }
    }
}
