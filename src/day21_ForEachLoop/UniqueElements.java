package day21_ForEachLoop;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"layan", "Layan", "Oleksandr", "Adam", "Adam", "Cydeo"};


        for (String word : words) {
            int frequency = 0;
            for (String s : words) {
                if (s.equalsIgnoreCase(word)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.print(word + " ");
            }
        }

char[] letters =String.valueOf(15687123).toCharArray();
        System.out.println(Arrays.toString(letters));
    }


}

