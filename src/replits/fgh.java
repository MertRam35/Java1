package replits;

import java.util.Scanner;

public class fgh {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();
        String word = "";
        /*
        less than 3   -> ineligible
3-4           -> preschool
5             -> kindergarten
6-10          -> elementary school
11-13         -> middle school
14-18         -> high school
19+           -> college
         */
        System.out.println();
        if (age < 3) {
            word = "ineligible";
        } else if (age < 4) {
            word = "preschool";
        } else if (age == 5) {
            word = "kindergarten";
        }else if (age<11) {
            word = "elementary school";
        }else if (age<14) {
            word = "middle school";
        }else if (age<19) {
            word = "high school";
        }else if (age>=19) {
            word = "college";
        }
        System.out.println(word);


    }
}
