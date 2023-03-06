package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {

// replace index to new element
    public static int[] replace(int[] array, int index, int value) {

if (index <0 || index > array.length-1){
    System.err.println("Invalid Index: "+index);
}
        array[index] = value;
        return array;
    }


    public static char[] replace(char[] array, int index, char value) {

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index] = value;
        return array;
    }


    public static double[] replace(double[] array, int index, double value) {

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index] = value;
        return array;
    }


    public static String[] replace(String[] array, int index, String value) {

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index] = value;
        return array;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8,1, 9,1,2,1};
        arr = replaceAll(arr, 1, 60);
        System.out.println(Arrays.toString(arr));

String[] array = {"java","PENCİL", "KONAMİ", "JAVA", "JAVA","KONAMİ"};
        String[] arr2 =ArraysUtility.removeDuplicates(array);
        System.out.println(Arrays.toString(arr2));
    }


    public static int[] replaceAll(int[] array, int oldValue, int newValue){

        for (int i = 0; i < array.length; i++) {
          if (array[i] == oldValue) {
              array[i] = newValue;
        }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldValue, String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }
}

