package day16_ForLoop;

import java.util.Scanner;

public class StringAndChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" type a word and a char");
        String str = scanner.nextLine();
        char chr = scanner.next().charAt(0);
        int repeat = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == chr) {

                repeat++;
            }

        }
        System.out.println(repeat);


    }
}
