package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your gender");
        String gender = scanner.next();
        scanner.nextLine();
        System.out.println("Enter your full name");
        String fullName = scanner.nextLine();
        System.out.println(" Enter your phone number");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter your zip code");
       // scanner.nextLine();
        int zipcode = scanner.nextInt();
        System.out.println(" Enter your School Name");
        scanner.nextLine();
        String schoolName = scanner.nextLine();
        System.out.println(" Enter your City Name");
        String cityName = scanner.nextLine();
        System.out.println("Enter Your State Name");
        String stateName = scanner.next();
        System.out.println(" Enter your building Number");
        int buildingNumber = scanner.nextInt();
        System.out.println("Enter your Street Name");
        scanner.nextLine();
        String streetName = scanner.nextLine();
        scanner.close();
        System.out.println("1. " + fullName);
        System.out.println("2. " + age);
        System.out.println("3. " + gender);
        System.out.println("4. " + phoneNumber);
        System.out.println("5. address:");
        System.out.println("\t\t" + buildingNumber + " " + streetName);
        System.out.println("\t\t" + cityName + " " + stateName + " " + zipcode);
        System.out.println("6. " + schoolName);


    }
}
