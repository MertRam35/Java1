package day21_ForEachLoop;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3,27, 4, 5,45,90};
        Arrays.sort(numbers);

        int[] reversed = new int[numbers.length];


        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {

            reversed[i] = numbers[j];

        }
        System.out.println(Arrays.toString(reversed));

    }
}
