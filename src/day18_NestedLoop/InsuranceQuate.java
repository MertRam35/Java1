package day18_NestedLoop;

import java.util.Scanner;

public class InsuranceQuate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = scan.nextLine();
        //  boolean gend = false;
        // System.out.println("Enter your gender male/female");
        String gender = "";
        while (!gender.equals("male") && !gender.equals("female")) {
            System.out.println("Enter your gender male or female");
            gender = scan.nextLine().toLowerCase();
        }

        String married = "";
        boolean isMarried = false;
        while (!married.equals("yes") && !married.equals("no")) {
            System.out.println("Are you married ? yes/no");
            married = scan.nextLine().toLowerCase();
            if (married.equals("yes")){
                isMarried = true;
            }
        }

        int age = 0;
        boolean isOld = false;
        while (age <= 0 || age > 120) {
            System.out.println("Enter your age");
            age = scan.nextInt();// hangisi daha makul
        if (age > 25) isOld = true;
        }

        int miles = 0;
        while (miles < 5) {
            System.out.println("How many miles do you drive in a day ?");
            miles = scan.nextInt();
        }
        String coverageLiability = "";
        scan.nextLine();
       while (!coverageLiability.equalsIgnoreCase("liability"  )&& !coverageLiability.equalsIgnoreCase("full")){
           System.out.println(" do you want full coverage or liability insurance ? liability/full");
           coverageLiability = scan.nextLine(); }



        String accidentsPast5Years = "";
        while (!accidentsPast5Years.equalsIgnoreCase("yes") && !accidentsPast5Years.equalsIgnoreCase("no")) {
            System.out.println("Do you have any accidents or claims last 5 years? yes/no");
            accidentsPast5Years = scan.nextLine();
        }
        String antiTheftdevice = "";
        while (!antiTheftdevice.equalsIgnoreCase("yes") && !antiTheftdevice.equalsIgnoreCase("no")) {
            System.out.println("Do you have anti-theft device? yes/no");
            antiTheftdevice = scan.nextLine();
        }

        double insuranceQuote = 0;
        if (coverageLiability.equalsIgnoreCase("liability")) {
            if (!isOld) {
                insuranceQuote += 90;
            } else insuranceQuote += 50;

            if (miles <= 10) {
                insuranceQuote += 10;

            } else if ( miles <= 50) {
                insuranceQuote += 30;

            } else insuranceQuote += 50;
        } else if (coverageLiability.equalsIgnoreCase("full")) {
            if (!isOld) {
                insuranceQuote += 160;
            } else
                insuranceQuote += 120;

            if (miles <= 10) {
                insuranceQuote += 20;
            } else if (miles <= 50) {
                insuranceQuote += 40;
            } else
                insuranceQuote += 70;

        }
        if (antiTheftdevice.equalsIgnoreCase("yes")) {
            insuranceQuote = insuranceQuote * 0.95;
        }

        if (accidentsPast5Years.equalsIgnoreCase("yes")) {
            insuranceQuote = insuranceQuote * 1.15;
        } else if (accidentsPast5Years.equalsIgnoreCase("no")) {
            insuranceQuote = insuranceQuote * 0.9;

        }
        if (isMarried) {
            insuranceQuote = insuranceQuote * 0.95;
        }
        System.out.println("your total payment is " + insuranceQuote);
scan.close();
    }


}

