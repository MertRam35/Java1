package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter ?");
        int length = scan.nextInt();
        if (length <= 0) {
            System.err.println("Invalid Entry");
            System.exit(0);

        }
        int[] numbers = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++) {
            System.out.println("enter " + (i + 1) + ". number");
            numbers[i] = scan.nextInt();

            sum += numbers[i];

        }

        System.out.println("Your numbers are "+Arrays.toString(numbers));
        System.out.println("and sum of them is "+sum);
        // System.out.println(sum);

        scan.close();


    }
}
