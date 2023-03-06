package day17_while_DoWhile;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type user name");
        String userName = scan.next().toLowerCase();

        System.out.println("Enter your Password");
        String password = scan.next().toLowerCase();


        if (userName.equals("cydeo") && password.equals("cydeo123")) {
            System.out.println("Log in");
        } else {
            int attempts = 3;

            while (!(userName.equals("cydeo") && password.equals("cydeo123")) && attempts > 0) {
               if (attempts == 1){
                   System.out.println( "This is your last chance");
               }

                System.out.println("Invalid User name type again please");

                System.out.println("Type user name");
                userName = scan.next().toLowerCase();

                System.out.println("Enter your Password");
                password = scan.next().toLowerCase();
               attempts--;
            }



        if (userName.equals("cydeo") && password.equals("cydeo123")) {
            System.out.println("Log in");
        } else {
            System.out.println(" Your account is locked");
        }}
        scan.close();

    }
}

