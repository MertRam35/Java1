package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;


        }
        System.out.println(sum);

        int total = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            total += scanner.nextInt();

        }
        System.out.println("total = " + total);
        scanner.close();

    }
}
