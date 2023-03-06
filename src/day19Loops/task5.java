package day19Loops;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println("How much do you make an hour?");
            int hourlyRate = scan.nextInt();

            if (hourlyRate < 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week ?");
            int weeklyHours = scan.nextInt();

            if (weeklyHours < 1 && weeklyHours > 144) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();

            if (taxRate < 0 && taxRate > 10) {
                System.out.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }
            double stateTax = hourlyRate * weeklyHours * taxRate / 100;
            double federalTax = (hourlyRate * weeklyHours * 0.26);
            System.out.println("Gross Salary is " + hourlyRate * weeklyHours);
            System.out.println("Federal Tax is " + federalTax);
            System.out.println("State Tax is " + stateTax);
            System.out.println("Total Tax is " + (stateTax + federalTax));
            System.out.println("Net income is " + ((hourlyRate * weeklyHours) - (federalTax + stateTax)));

            System.out.println("Would you like to continue?");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("yes")) {
                a = true;
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                a = false;

            } else  {
               System.out.println("Invalid Entry");
                System.exit(0);
            }
        }


    }
}
