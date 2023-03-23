package replits;

import java.util.Arrays;
import java.util.Scanner;

public class Sandwich {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String bread = "bread";
        int a = str.indexOf(bread);
        int b = str.lastIndexOf(bread);
        if (a == b){
            System.out.println("nothing");
        } else System.out.println( str.substring(a+5,b));

        }
        /*
        String[] b = str.split(a,3);
        System.out.println(Arrays.toString(b));

         */


    }

