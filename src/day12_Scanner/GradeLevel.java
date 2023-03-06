package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte number=19;
        String text;
        if (number >= 1 && number <= 18) {
            if (number <= 5) {
                text = "Elementary School";
            } else if (number <= 8) {
                text = "Middle School";
            } else if (number <= 12) {
                text = "High School";}
            else if (number <=16) {text ="College";}
            else {text ="Grad School";}
        }else {text = "Invalid Grade";}
        System.out.println(text);

        }

        }



