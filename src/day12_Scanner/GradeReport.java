package day12_Scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR SCORE");
        int score = scan.nextInt();
        char grade = ' ';
        if (score >= 0 && score <= 100) {
            if (score > 85) {
                grade = 'A';
            } else if (score >= 70) {
                grade = 'B';
            } else if (score >= 60) {
                grade = 'C';
            } else if (score >= 45) {
                grade = 'D';
            } else grade = 'F';
            System.out.println("grade = " + grade);
        } else System.out.println("Invalid Score");


    }

}



