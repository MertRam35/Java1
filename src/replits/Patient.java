package replits;

import java.util.Scanner;

public class Patient {
    public static void main(String[] args) {
        //Enter your code here
        String firstName = "";
        String lastName = "";
        String email = "";
        String street = "";
        String state = ""; String city = "";
        int age;
        int zipCode = 0;
        double height, weigt;
        boolean isMarried;
        long workPhoneNumber = 0;
        long personalPhoneNumber = 0;
        Scanner scan = new Scanner(System.in);

        // this part is already provided DO NOT CHANGE
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
        System.out.println("Enter your first name");
        firstName = scan.nextLine();
        System.out.println("Enter your last name");
        lastName = scan.nextLine();
        System.out.println("Enter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your city");
        city = scan.nextLine();
        System.out.println("Enter your state");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipCode = scan.nextInt();
        System.out.println("Enter work phone number");
        workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height = scan.nextDouble();
        System.out.println("Enter your weight");
        weigt = scan.nextDouble();
        System.out.println("Are you married?");
        isMarried = scan.nextBoolean();
        String contact =""+ workPhoneNumber+", "+personalPhoneNumber+", "+email;
        String fullName =firstName+" "+lastName;
        String address = street+", "+city+", "+state+", "+zipCode;

        System.out.println("Patient personal information");
        System.out.println("Full name: "+fullName);
        System.out.println("Address: "+address);
        System.out.println("Contact: "+contact);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weigt+" pounds");// continue for city
        System.out.println("Married: "+isMarried);

    }
}

