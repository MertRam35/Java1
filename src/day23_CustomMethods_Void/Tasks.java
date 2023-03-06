package day23_CustomMethods_Void;

public class Tasks {
    public static void main(String[] args) {

        anagram("kala", "alak");


    }

    public static void anagram(String first, String second) {

        if (first.length() == second.length()) {
            int count = 0;
            for (int i = 0, j = second.length() - 1; i < first.length(); i++, j--) {


            }

        } else System.out.println(first + " and " + second + " are NOT anagram");

    }
}




