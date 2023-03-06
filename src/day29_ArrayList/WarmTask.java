package day29_ArrayList;

import java.util.ArrayList;

public class WarmTask {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        System.out.println("numbers = " + numbers);

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer element : numbers) {

            int frequency = 0;
            for (Integer each : numbers) {
                if (each == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println("element = " + element);
                break;
            }
        }

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9,};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }


}