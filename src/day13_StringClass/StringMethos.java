package day13_StringClass;

import java.util.Scanner;

public class StringMethos {
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);

        System.out.println("enter your first name");
       // String frstName = scanner.next();

        String word = "Cydeo";
        //char charac = frstName.charAt(2);
        //System.out.println(charac);
        System.out.println("---------------------");
        String s1 = "Batch 25 is the best batch";
        System.out.println("s1 = " + s1);
        int totl = s1.length();
        System.out.println(totl);
        char lastcharac = s1.charAt(s1.length()-1);
        System.out.println("lastcharac = " + lastcharac);
        System.out.println("------------------");
        String str = "wooden spoon";
        str.toUpperCase();
        System.out.println(str.toUpperCase());

    }
}
