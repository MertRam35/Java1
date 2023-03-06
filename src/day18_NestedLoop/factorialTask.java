package day18_NestedLoop;

import java.util.Scanner;

public class factorialTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int result = 0; // result değeri neden alınan sonucu etkiliyor

        for (int i = 1; i <= number; i++) {
            result *= i;// number 5 iken 5*4*3*2*1 olmalı *2 ekliyor
        }

        System.out.println(result);

        System.out.println("----------------------");



        /*        int number = 5;
                int result = 1;

                // Calculate factorial of number
                for (int i = 1; i <= number; i++) {
                    result *= i;
                }
        System.out.println(result);

                // Print the result*/

    }
}

