package replits;

import java.util.Scanner;

public class RemoveDublicates {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code
        String result = "";

        char[] array = str.toCharArray();
        for (char each : array) {

            if (result.contains(each + "")) {
                continue;
            }else result += "" + each;
        }
        return result;
    }
}
