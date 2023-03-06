package day17_while_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter your Second Number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter a math Operator:");
        char c = scanner.next().charAt(0);

        while ( !(c == '+' || c == '-')){
            System.err.println("Invalid Number please re-enter");
            c = scanner.next().charAt(0);
        }
        System.out.println( (c == '+')? num1+num2 : num1-num2);





    }
}
