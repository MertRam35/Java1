package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

import static utilities.ArraysUtility.addElement;

public class MergeTwoArrays {

    // merge the given two arrays nd returns te new array
    public static int[] merge(int[] array1, int[] array2){
        int[] result = {};
        for (int each : array1) {
            result = addElement(result, each);
        }

        for (int each : array2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static char[] merge(char[] array1, char[] array2){
        char[] result = {};
        for (char each : array1) {
            result = addElement(result, each);
        }

        for (char each : array2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static double[] merge(double[] array1, double[] array2){
        double[] result = {};
        for (double each : array1) {
            result = addElement(result, each);
        }

        for (double each : array2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static String[] merge(String[] array1, String[] array2){
        String[] result = {};
        for (String each : array1) {
            result = addElement(result, each);
        }

        for (String each : array2) {
            result = addElement(result, each);

        }
        return result;
    }



    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,1,2,5,6,7,2,8,9,10,11,9,7};

        array = ArraysUtility.removeDuplicates(array);

        System.out.println(Arrays.toString(array));

    }




}
