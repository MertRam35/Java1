package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class UniqueElements {


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

}
