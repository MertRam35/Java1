package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str ="aabcccdeeeeef";

        str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);
       // ArrayList<Character>

    }
}
