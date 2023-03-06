package day16_ForLoop;

import java.util.Scanner;

public class Duplicated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String result = "";

        for (int i = 0 ; i <= word.length() - 1; i++) {
            String ch =""+ word.charAt(i);

            if (!result.contains(ch)) {
                result +=  ch;
            }


        }  System.out.println(result);



    }
}
