package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number five times");
            int num = scanner.nextInt();
           if (num > max) {
                max = num;
            }
        }
        System.out.println("max = " + max);


    }
}
