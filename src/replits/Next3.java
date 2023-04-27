package replits;

import java.util.Scanner;

public class Next3 {

    public static int getDup(String[] arr) {
int count=0;
        for (String each : arr) {
            for (String s1 : arr) {
                if (each.equals(s1))
                    count++;
            }
        }

return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }


}
