package day22_MultiDimensionalArray;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][][] arr = {{{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}}, {{10, 20, 30}, {40, 50, 60, 70, 80}, {90, 100, 110, 120, 130}}};


        for (int[][] ints : arr) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }


    }
}
