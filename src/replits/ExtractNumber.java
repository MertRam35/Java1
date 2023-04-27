package replits;

import java.util.ArrayList;
import java.util.Scanner;

public class ExtractNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));



    }


        public static String extractNum(String s) {

    char[] sn =s.toCharArray();
String result ="";
            for (char c : sn) {
                if (Character.isDigit(c)){
                  result +=c;
                }
            }
    return result;
    }
}
