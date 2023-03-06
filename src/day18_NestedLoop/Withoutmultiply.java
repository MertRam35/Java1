package day18_NestedLoop;


import java.util.Scanner;

/*3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200*/
public class Withoutmultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 0; int result = 0;
        System.out.println("enter two number please");
        while (!(number1>0 && number2>0)) {
           number1 = scanner.nextInt();
           number2 = scanner.nextInt();
           if (number1<0 || number2<0){
               System.out.println("invalid number");
               System.out.println("please re-enter numbers");
           }

           for (int i = 1; i <= number2; i++) {
               result += number1;
           }

       }System.out.println(result);
    }
}
