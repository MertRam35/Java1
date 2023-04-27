package reviews.week_07;

import java.util.Arrays;
import java.util.Scanner;

public class IntroOfArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        String[] arr2 = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
