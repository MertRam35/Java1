package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));


        int[] scores = new int[5];
        System.out.println(Arrays.toString(scores));

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        for (int i = 0; i < month.length ; i++) {

            //System.out.println(month[i]);
        }
        for (int j = month.length-1; j >=0 ; j--) {
            System.out.println(month[j]);

        }
    }
}
