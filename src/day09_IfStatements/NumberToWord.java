package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int number =0;
        String word = (number >= 0 && number <= 9) ?
                (number == 0) ? "zero" : (number == 1) ? "one" : (number == 2) ? "two" : (number == 3) ? "three"
                : (number == 4) ? "four" : (number == 5) ? "five"
                : (number == 6) ? "six" : (number == 7) ? "seven" : (number == 8) ? "eight" :"nine"
                : "invalid number";
        System.out.println(word);
       /*if (number == 0) {
            System.out.println("zero");
        } else if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else if (number == 5) {
            System.out.println("Five");
        } else if (number == 6) {
            System.out.println("Six");
        } else if (number == 7) {
            System.out.println("Seven");
        } else if (number == 8) {
            System.out.println("Eight");
        } else if (number == 9) {
            System.out.println("Nine");

        }*/

    }

}


