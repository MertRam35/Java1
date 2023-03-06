package day29_ArrayList;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        int[] result = new int[array.length];

        for (int each = array.length - 1, j = 0; each >= 0; each--, j++) {
            result[j] = array[each];

        }
        System.out.println(Arrays.toString(result));


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        ArrayList<Integer> reversedList = new ArrayList<>();

        for (int each = list.size() - 1; each >= 0; each--) {

            int number = list.get(each);
            reversedList.add(number);
        }


        System.out.println(reversedList);
    }
}
