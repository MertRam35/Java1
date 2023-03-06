package day13_StringClass;

import java.util.Scanner;

public class initials {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your first name");
        String frstName = scanner.next();

        System.out.println("enter your lAST name");
        String LastName = scanner.next();

        char f = frstName.charAt(0);
        char l = LastName.charAt(0);

    String intal = f+"." + l ;
        System.out.println("intal = " + intal);
        scanner.close();

    }
}
