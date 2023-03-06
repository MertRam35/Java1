package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Collections.swap(list, 0, list.size() - 1);

        System.out.println(list);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list2);

        int size = list2.size();

        list2.removeAll(Arrays.asList(0));
        System.out.println(list2);

        int newSize = list2.size();

        int totalNumberOfZeros = size - newSize;

        for (int i = 0; i < totalNumberOfZeros; i++) {
            list2.add(0);
        }

        System.out.println(list2);

        String str = "ABCD123+%#@456EG!";


        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));

        }
        ArrayList<Character> letters = new ArrayList<>(chars);

        letters.removeIf(p -> !Character.isLetter(p));

        System.out.println("letters = " + letters);

        ArrayList<Character> digit = new ArrayList<>(chars);

        digit.removeIf(p -> !Character.isDigit(p));
        System.out.println("digit = " + digit);

        ArrayList<Character> symbol = new ArrayList<>(chars);
        symbol.removeIf(p -> Character.isLetterOrDigit(p));

        System.out.println("symbol = " + symbol);


        String name ="";

        for (Character letter : letters) {
            name += letter;
        }

        System.out.println("name = " + name);


    }

}
