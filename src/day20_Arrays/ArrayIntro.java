package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {

    public static void main(String[] args) {

        String[] days = {"Sunday", "monday", "Tuesday", "Wednesday", " Thursday", "Friday", "Saturday", };

        System.out.println(Arrays.toString(days));

        int number = 1;

        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

    }
}
