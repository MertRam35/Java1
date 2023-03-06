package w3resource.com;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number 1");
        int number1 = scan.nextInt();
        System.out.println("enter number 2");
        int number2 = scan.nextInt();
        int temporay = 0;
        temporay = number2;
        number2 = number1;
        number1 = temporay;
        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);
    }
}
