package day17_while_DoWhile;

import java.util.Scanner;

/*  8. Create a class called EmailTask2.
Assume that email address is constructed by person's first name and followed by an underscore and last name.
Write a program that will print out information about user based on email. Print first name, last name,
 and domain.
 First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       craig_federighi@apple.com

                Output:
                    First name: Craig
                    Last name: Federighi
                    Domain: apple*/
public class CalledEmailTask2 {
    public static void main(String[] args) {
        System.out.println("type an email address is constructed by person's first name and followed by an underscore and last name");
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        int first = email.indexOf("_" );
        email.substring(0,first);
        System.out.println("First Name: "+email.substring(0,1).toUpperCase()+email.substring(1,first));

        int second = email.indexOf("@");
        email.substring(first,second+1);
        System.out.println("Second Name: "+   email.substring(first+1,first+2).toUpperCase()+email.substring(first+2,second));

        int third = email.indexOf(".");
        email.substring(second,third);
        System.out.println("Third Name: "+email.substring(second+1,third));








    }

    public static class DEVAMET {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type two positive numbers");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            for (int i = number1; i <= number2; i++) {
                if (number1 > 0 && number2 > 0) {
                    System.out.print(i *i);
                } else System.out.println("Invalid Number");
            }


        }


    }
}
