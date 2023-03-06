package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(12,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(12,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(12,3,4,5,6,7,8,9));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 != 0){
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
