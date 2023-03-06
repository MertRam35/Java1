package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        Integer[] number = {1, 2, 3};

        ArrayList<Integer> names = new ArrayList<>();
        names.add(56);
        System.out.println("names = " + names);
        names.add(45);
        System.out.println("names = " + names);
        names.add(0, 98);
        System.out.println("names = " + names);
    }

}
