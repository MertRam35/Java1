package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali","David", "Ahmed", "Jimmy"));
        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);

        String[] names = {"Mary", "Monica", "Mehray", "Musti","sumeyra"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        System.out.println(list);

        list.removeIf(p -> p.charAt(0) == 'M');
        System.out.println(list);
        names = list.toArray(new String[0]);
        System.out.println(Arrays.toString(names));
    }
}
