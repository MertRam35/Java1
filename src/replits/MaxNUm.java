package replits;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNUm {

    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] array = str.split(", ");
        int maxNumber = 590;
        String shortest = "";

        for (String s : array) {
            if (s.length() < maxNumber){
                maxNumber = s.length();
            shortest = s;}

        }
        String words = "";
        for (String s : array) {
            if (s.length() == shortest.length()) {
                words += s + " ";
            }

        }
        String[] output = words.split(" ");
        System.out.println(Arrays.toString(output));


    }
}
