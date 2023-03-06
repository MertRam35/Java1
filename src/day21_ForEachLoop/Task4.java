package day21_ForEachLoop;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};

        int[] sum = new int[arr1.length+ arr2.length+ arr3.length];
        int value = 0;
        for (int i : arr1) {
            sum[value] = i;
            value++;
        }
        for (int i : arr2) {
            sum[value]= i;
            value++;
        }
        for (int i : arr3) {
            sum[value]= i;
            value++;
        }
        System.out.println(Arrays.toString(sum));



    }
}
