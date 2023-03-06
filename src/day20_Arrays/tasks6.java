package day20_Arrays;

import java.util.Arrays;

public class tasks6 {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int sıfırolmayanlar = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[sıfırolmayanlar++] = array[i];
            }

        }System.out.println(Arrays.toString(array));
        for (int i = sıfırolmayanlar; i < array.length; i++) {
            array[i]=0;
        }
        System.out.println(Arrays.toString(array));
    }
}
