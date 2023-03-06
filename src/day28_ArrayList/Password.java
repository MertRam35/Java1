package day28_ArrayList;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        char[] chars = password.toCharArray();

        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {
                r4 = true;
            }

        }
        boolean isStrongPassword = false;

        System.out.println("isStrongPassword = " + isStrongPassword);
        while (!isStrongPassword) {
            System.err.println("Invalid Password please type again");
            password = scanner.nextLine();
            r1 = password.length() >= 8 && !password.contains(" ");
            chars = password.toCharArray();
            for (char each : chars) {
                if (Character.isUpperCase(each)) {
                    r2 = true;
                } else if (Character.isLowerCase(each)) {
                    r3 = true;
                } else if (Character.isDigit(each)) {
                    r5 = true;
                } else {
                    r4 = true;
                }

            }


            isStrongPassword = r1 && r2 && r3 && r4 && r5;
            System.out.println("isStrongPassword = " + isStrongPassword);

        }

    }
}
