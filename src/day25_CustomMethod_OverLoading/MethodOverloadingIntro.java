package day25_CustomMethod_OverLoading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        Arrays.sort(intArray);
        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};

        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};

        args = new String[]{"ali", "veli"};
        System.out.println(Arrays.toString(args));


    }
}
