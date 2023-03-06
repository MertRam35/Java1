package day13_StringClass;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "Cydeo";
        String password = "WoodenSpoon";
        System.out.println("enter your credentals");
        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        if (name.equals(username)  && pass.equals(password)) {
            System.out.println("Logged in");}
        else System.err.println("Incorrect username or password");

    }
}
