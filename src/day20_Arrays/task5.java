package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int[] numbers = new int[10];
        int sum = 2147483647;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter ten numbers " + (i + 1) + " of them =");
            numbers[i] = scan.nextInt();
            if (numbers[i] <= sum) {
                sum = numbers[i];
            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);

    }
}
