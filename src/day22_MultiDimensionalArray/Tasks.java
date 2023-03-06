package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Tasks {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}};

        int[][] reverse = new int[array.length][];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

            for (int element = array[i].length - 1, k = 0; element >= 0; element--, k++) {
                reverse[j][k] = array[i][element];
            }
        }
        System.out.println("reverse = " + Arrays.deepToString(reverse));
        // System.out.println(Arrays.deepToString(array));


    }
}
