package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodsWithParameters {

    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else System.out.println(number + " is odd number");

    }

    public static void main(String[] args) {


        oddOrEven(25);
        ageOfPerson(25,50);

    }

    public static void ageOfPerson(int x, int y ) {


        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }
    }
}
