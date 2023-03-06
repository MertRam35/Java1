package day11_SwitchStatements;

import java.util.Scanner;

public class scannBrowser{


    public static void main(String[] args) {
        // Declare a String variable named browserName
        String browserName;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the name of the selected browser
        System.out.print("Enter the name of the selected browser: ");
        browserName = input.nextLine();

        // Use a nested if statement to check if the browser name matches one of the valid browsers
        String output;
        if (browserName.equalsIgnoreCase("chrome")) {
            output = "Chrome Browser is selected";
        } else if (browserName.equalsIgnoreCase("firefox")) {
            output = "Firefox Browser is selected";
        } else if (browserName.equalsIgnoreCase("opera")) {
            output = "Opera Browser is selected";
        } else if (browserName.equalsIgnoreCase("safari")) {
            output = "Safari Browser is selected";
        } else if (browserName.equalsIgnoreCase("edge")) {
            output = "Edge Browser is selected";
        } else {
            output = "Invalid Browser Name";
        }

        System.out.println(output);
    }
}
