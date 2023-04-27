package reviews.week_08;

import java.util.ArrayList;

public class Quiz {

    public static void main(String[] args) {



        System.out.println(method(100));

    }
    public static String method(int num){
        if (num < 0){
            return " less than 0";
        } else if (num < 50) {
            return "less than 50";

        } else if (num < 100) {
            return  "less than 100";

        }else return "other";
    }
}
