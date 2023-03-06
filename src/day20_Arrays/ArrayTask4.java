package day20_Arrays;

import java.util.Arrays;

public class ArrayTask4 {
    public static void main(String[] args) {


        int[] numbers = new int[100];
        int j = 100;
        for (int i = 0; i < 100; i++ ,j--) {
            numbers[i] = j;

        }
        System.out.println(Arrays.toString(numbers));

    }
}
