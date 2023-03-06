package day17_while_DoWhile;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        String cat = "cat";
        String dog = "";

        int catnum = 0, dognum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type A Sentence");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length() - 2; i++) {

            if (word.substring(i, i + 3).equalsIgnoreCase(cat)) {

                catnum++;

            }
           else if (word.toLowerCase().substring(i, i + 3).equals("dog")) {

                dognum++;
            }
        }
        System.out.println("catnum = " + catnum);
        System.out.println("dognum = " + dognum);
        if (catnum == dognum) {
            System.out.println("true");
        }

    }
}
