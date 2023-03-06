package day13_StringClass;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Sentences");
        String sentence = scanner.nextLine();
        String sentence2 = scanner.nextLine();
        int s1 =sentence.length();
        int s2 = sentence2.length();
        //System.out.println(sentence.charAt(0) + " " + sentence.charAt(sentence.length() - 1));
        if (s1<s2){
            System.out.println(sentence2);}
        else System.out.println(sentence);
        scanner.close();


    }
}
