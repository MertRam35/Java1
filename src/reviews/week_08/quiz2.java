package reviews.week_08;

import java.util.ArrayList;

public class quiz2 {

    public static void main(String[] args) {

        System.out.println(examResult(52));

    }
    public static String examResult(int score){
        if (score<0 || score>10){
            System.out.println("Unknown");

        }

        return "yes";
    }
}
