package day14_String;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      /*  System.out.println("Enter two words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println( word1.substring(1)+word2.substring(2));*/
        System.out.println("------------------------");

      /*  System.out.println();
        System.out.println("Enter a Word");
        String word3 = scanner.next();
        String word4 = "" + word3.charAt(word3.length() - 2) + word3.charAt(word3.length() - 1);
        switch (word4) {
            case "ly":
                System.out.println("really ?");
                break;
            default:
                System.out.println("never mind");
        }*/

       /* System.out.println("-------------------------");
        System.out.println("Type a Word");

        String word = scanner.next();
        if (word.charAt(0) == 'x') {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }
        System.out.println("----------------------------");
        System.out.println("Enter two words");
        String word1 = scanner.next();
        String word2 = scanner.next();System.out.println("");

        if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            System.out.println(word1+word2.substring(1));

        }else  System.out.println(word1+word2);*/

        System.out.println("----------------------");
        System.out.println("type a word");
        String word = scanner.next();
        char firstChar = word.charAt(0);
        if (firstChar >= '0' && firstChar <= 57) {
            System.out.println("first character is digit");
        } else if (firstChar >= 65 && firstChar <= 90) {
            System.out.println("first character is UpperChase");
        } else if (firstChar >= 97 && firstChar <= 122) {
            System.out.println("first character is LowerChase");

        } else System.out.println("first Character is Special Character");


    }
}
