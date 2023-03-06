package day17_while_DoWhile;

import java.util.Scanner;

/*
 3. write a program to ask user to enter two number and math operator, and return the result.
		if the operator is invalid operator, ask user to re-enter the operator
		until user provides a valid operator (+, -, *, /)*/
public class tasks344 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number :");
        int a = scan.nextInt();
        System.out.println("Enter second Number :");
        int b = scan.nextInt();

        int result = 0;

        String operator = "";
        while (!(operator.equals("-")) && !(operator.equals("+")) && !(operator.equals("/")) && !(operator.equals("*"))) {

            System.out.println("Enter math Operator :");
            operator = "" + scan.next().charAt(0);
            if (operator.equals("*")) {
                result = a * b;
                break;
            } else if (operator.equals("/")) {
                result = a / b;
                break;
            } else if (operator.equals("+")) {
                result = a + b;
                break;

            } else if (operator.equals("-")) {
                result = a - b;
                break;

            }


        }
        System.out.println("result = " + result);

    }
}
