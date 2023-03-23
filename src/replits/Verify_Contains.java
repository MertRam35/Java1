package replits;

import java.util.Scanner;

public class Verify_Contains {


    public static void main(String[] args) {
        //Do NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
        boolean a,b;
        if (word.contains("AirPods") && sentence.contains(" quiz")) {
            a = true;
            System.out.println(a);
        } else if (!word.contains("AirPods") && !sentence.contains(" quiz")) {
            a = false;
            System.out.println(a);
        } else if (!word.contains(" AirPods")&& sentence.contains(" quiz")){
            a = false;b = true;
            System.out.println(a);
            System.out.println(b);
        }else if (word.contains(" AirPods")&& !sentence.contains(" quiz")){
            a = true;b = false;
            System.out.println(a);
            System.out.println(b);
        }


    }
}

