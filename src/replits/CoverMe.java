package replits;

import java.util.Arrays;
import java.util.Scanner;

public class CoverMe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here
/*String result ="";
if (main.contains(coverMe)){
    result =main.substring(0,main.indexOf(coverMe))+"["+main.substring(main.indexOf(coverMe),main.indexOf(coverMe)+coverMe.length())+"]"+main.substring(main.indexOf(coverMe)+coverMe.length());
}else result="["+main+"]";



return result;*/
        String[] a = main.split(coverMe);
        String result = "";
        for (int i = 0; i < a.length; i++) {
            if (!main.contains(coverMe))
                result = "[" + main + "]";

            else  if (i != a.length - 1 )
                result += a[i]+ "[" + coverMe + "]";
            else  if (i == a.length - 1 & a[i].contains(coverMe))
                result += a[i]+ "[" + coverMe + "]";
            else if (i == a.length - 1 && !a[i].equals(coverMe)) {
                result += a[i] ;

            }
        }


        return result;




    }
}
