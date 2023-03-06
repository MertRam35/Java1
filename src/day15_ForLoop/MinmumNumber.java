package day15_ForLoop;

import java.util.Scanner;

public class MinmumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minumum = 2147483647;

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();
           if (num < minumum ){
               minumum = num ;
           }
        }
        System.out.println("minumum = " + minumum);




    }
}
