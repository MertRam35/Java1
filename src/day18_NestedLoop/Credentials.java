package day18_NestedLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for (int i = 3; i >= 1; i--) {

            System.out.println("Type your username");
            String username = scan.nextLine();

            System.out.println("Type your password");
            String password = scan.nextLine();

            if (username.equalsIgnoreCase("cydeo") && password.equalsIgnoreCase("woodenspoon")) {
                System.out.println("logged in");
                break;
            } else
                //if (!username.equalsIgnoreCase("cydeo") && !password.equalsIgnoreCase("woodenspoon")) {
                System.out.println("you have " + (i - 1) + " times left");
            count++;
            if (count == 3) {
                System.err.println("Your account is locked");
                break;
            }


            scan.close();
        }
    }
}