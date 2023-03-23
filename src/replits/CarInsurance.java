package replits;

import java.util.Scanner;

public class CarInsurance {

    public static void main(String[] args) {

        System.out.println("Welcome to the Cydeo car insurance!");

        Scanner scanner = new Scanner(System.in);
        double premiumCost = 0;
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();

       /* System.out.println("Do you have a US driver license?");
        String isDriverLicense = scanner.nextLine();
        if (isDriverLicense.equalsIgnoreCase("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        int zipCode = scanner.nextInt();
        if (zipCode == 20910 || zipCode == 20740) {
            premiumCost += 60;
        } else if (zipCode == 22102 || zipCode == 22103) {
            premiumCost += 30;

        } else {
            premiumCost += 50;
        }
        System.out.println("Is this vehicle owned, financed, or leased?");
        scanner.nextLine();
        String vehice = scanner.nextLine();
        if (vehice.equalsIgnoreCase("owned")) {
            premiumCost += 10;
        } else if (vehice.equalsIgnoreCase("financed")) {
            premiumCost += 15;

        } else if (vehice.equalsIgnoreCase("leased")) {
            premiumCost += 20;
        }
        System.out.println("How is this vehicle primarily used?");
        String howUsed = scanner.nextLine();
        if (howUsed.equalsIgnoreCase("business")) {
            premiumCost += 50;
        } else if (howUsed.equalsIgnoreCase("pleasure")) {
            premiumCost += 10;
        } else if (howUsed.equalsIgnoreCase("commuting")) {
            premiumCost += 20;
            System.out.println("How many days do you commute?");
            int days = scanner.nextInt();
            premiumCost += (days * 5);

        }

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age < 16) {
            System.out.println("You can't be driving");
            System.exit(0);
        } else if (age < 20) {
            premiumCost *= 10;

        } else if (age < 25) {
            premiumCost *= 6;

        } else if (age >= 25) {
            premiumCost *= 2;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        scanner.nextLine();
        String accidents= scanner.nextLine();
        if (accidents.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int accidetsNumber = scanner.nextInt();
            premiumCost +=(accidetsNumber*10);
            scanner.nextLine();
        }*/
        System.out.println("What is the highest level of education you have completed?");
        String education = scanner.nextLine();
        if ((education.equalsIgnoreCase("bachelors")) || (education.equalsIgnoreCase("masters"))){
            premiumCost-=(premiumCost*0.05);
        }else if (education.equalsIgnoreCase("PHD")) {
            premiumCost -= (premiumCost * 0.1);
        }else if (education.equalsIgnoreCase("High School")) {
            premiumCost -= (premiumCost * 0.05);
        }
        System.out.println(education.toUpperCase().replaceAll(" ",""));
String firstName =fullName.toUpperCase().substring(0,1)+""+fullName.substring(1,fullName.indexOf(" "));
String lastName=   fullName.toUpperCase().substring(fullName.indexOf(" ")+1,fullName.indexOf(" ")+2)+fullName.substring(fullName.indexOf(" ")+2);
           System.out.println(firstName+" "+lastName+", here's your quote!");
        System.out.println(firstName);
        System.out.println("This is your start premium cost: $"+premiumCost);
        //System.out.println("This is your reference number: "+fullName.toUpperCase().substring(0,2)+age+lastName.toUpperCase().substring(lastName.length()-3)+zipCode+education.toUpperCase().replaceAll(" ",""));

    }
}
