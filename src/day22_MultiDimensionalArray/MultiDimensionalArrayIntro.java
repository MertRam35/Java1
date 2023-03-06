package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"jan", "joes", "James"};
        String[] group2 = {"janas", "ijones", "Jessica"};
        String[] group3 = {"janas", "ijones", "Jessica"};


        String[][] groups = new String[3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));

    }
}
