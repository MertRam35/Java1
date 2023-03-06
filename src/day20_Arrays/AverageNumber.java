package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How Many numbers do you want to enter ?");
        int answer = scan.nextInt();
        int[] array = new int[answer];
        int average = 0;

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter your " + (i + 1) + ". number");
            if (answer == i + 1) {
                System.out.println("last time");
            }
            array[i] = scan.nextInt();
            average += array[i];
        }

        double averageNumber = average / answer;
        System.out.println(Arrays.toString(array));
        System.out.println("averageNumber = " +(int) averageNumber);
    }
}
