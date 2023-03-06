package day11_SwitchStatements;

public class Grade {
    public static void main(String[] args) {


        char grade = 'B';
        String output = "invalid";
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') {
            if (grade == 'A') {
                output = "excellent";
            }
            if (grade == 'B') {
                output = "great job";
            } else if (grade == 'C') {
                output = "good";
            } else if (grade == 'D') {
                output = "passed";
            } else if (grade == 'F') {
                output = "Failed";
            }


        }
        System.out.println("output = " + output);


    }

}




