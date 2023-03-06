package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

import static utilities.ArraysUtility.addElement;

public class ReverseArray {


    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            result[i] = array[j];

        }
        return result;
    }
}







