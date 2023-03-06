package day19Loops;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {


            System.out.println("Enter the radius of the circle");
            double r = scan.nextDouble();
            if (r <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            System.out.println("Diameter of Circle is " + (int)(2 * r));
            System.out.println("Area of circle is " + (int)(Math.PI * r * r));
            System.out.println("Perimeter of circle is " + (int)(2 * Math.PI * r));
            System.out.println();
            String answer = "";
            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.out.println("Would you like to calculate another circle ?");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }


        }

    }
}
