package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,5,4,12,2,1,3,5,4));


        ArrayList<Integer> unique =new ArrayList<>(list2);

        unique.removeIf(p -> Collections.frequency(list2, p) > 1);

        System.out.println(unique);


    }
}