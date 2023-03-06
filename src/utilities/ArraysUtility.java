package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static void printEach(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(char[] array) {

        for (char each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] array) {

        for (String each : array) {
            System.out.println(each);
        }
    }


    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];


    }

    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];


    }

    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];


    }

    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];


    }


    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }


    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static double[] addElement(double[] array, double element) {

        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static String[] addElement(String[] array, String element) {

        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }

    public static char[] addElement(char[] array, char element) {

        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        return result;
    }


    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }
        return count;
    }


    public static int[] uniqueElements(int[] array) {
        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] array) {
        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] array) {
        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    public static String[] uniqueElements(String[] array) {
        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }


    // removes the index from the array, returns new array.
    public static int[] removeElements(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }


        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }


    public static double[] removeElements(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }


        double[] result = new double[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static char[] removeElements(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }


        char[] result = new char[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    public static String[] removeElements(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index:" + index);
            System.exit(0);
        }


        String[] result = new String[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }


    // merge the given two arrays nd returns te new array
    public static int[] merge(int[] array1, int[] array2) {
        int[] result = {};
        for (int each : array1) {
            result = addElement(result, each);
        }

        for (int each : array2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static char[] merge(char[] array1, char[] array2) {
        char[] result = {};
        for (char each : array1) {
            result = addElement(result, each);
        }

        for (char each : array2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static double[] merge(double[] array1, double[] array2) {
        double[] result = {};
        for (double each : array1) {
            result = addElement(result, each);
        }

        for (double each : array2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static String[] merge(String[] array1, String[] array2) {
        String[] result = {};
        for (String each : array1) {
            result = addElement(result, each);
        }

        for (String each : array2) {
            result = addElement(result, each);

        }
        return result;
    }


    //reverses the array, returns a new array
    public static int[] reverse(int[] array) {
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);

        }
        return result;
    }

    public static double[] reverse(double[] array) {
        double[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);

        }
        return result;
    }

    public static char[] reverse(char[] array) {
        char[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);

        }
        return result;
    }

    public static String[] reverse(String[] array) {
        String[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);

        }
        return result;
    }

    //removeDuplicates
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = addElement(result, each);
            }
        }
        return result;

    }

    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = addElement(result, each);
            }
        }
        return result;

    }


    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = addElement(result, each);
            }
        }
        return result;

    }


    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = addElement(result, each);
            }
        }
        return result;

    }



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



    //replace all the matching old values to new values
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
            if (array[i].equals(oldValue)) {
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
