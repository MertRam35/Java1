package day21_ForEachLoop;

import java.util.Arrays;

public class Tasks {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 30, 4, 5, 6,};
        Arrays.sort(numbers);
        int[] descending = new int[numbers.length];
        for (int i = numbers.length - 1, j =0; i >= 0; i--,j++) {

            descending[j]= numbers[i];

        }  System.out.print(Arrays.toString(descending));
    }
}
