package day21_ForEachLoop;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3,};
        int[] arr2 = {4, 5};

        int[] arr3 = new int[arr1.length + arr2.length];
        int l = 0;
        for (int i : arr1) {
            arr3[l] = i;
            l++;
        }
        for (int i : arr2) {
            arr3[l] = i;
            l++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
