package day08_IfStatements;

import java.util.Scanner;

public class GradeaReport {
    public static void main(String[] args) {

       /* System.out.println(true == !false);
        System.out.println(!true !=false);


        */
        Scanner a = new Scanner(System.in);
        int score = a.nextInt();
        String result="";
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = " is excellent 5";
            } else if (score >= 80) {
               result = " is Great 4";
            } else if (score >= 70) {
               result = " is Good 3";
            } else if (score >= 60) {
                result =" is Passed 2 ";
            } else if (score >= 0) {
               result=" is Faied 1 :(";
            }

        } else {
            result=" No Score";
        }
        System.out.println(score + result);

        String data=(score >= 0 && score <= 100)? (score >= 90 )? "5" : (score>=80)? "4" : (score >=70)? "3": (score>=60)? "2" : "9" :"invalid" ;
        System.out.println("data = " + data);
    }}