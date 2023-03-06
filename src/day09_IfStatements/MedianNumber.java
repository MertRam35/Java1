package day09_IfStatements;
import java.util.Scanner;
public class MedianNumber {
    public static void main(String[] args) {

        Scanner r= new Scanner(System.in);
        int a= r.nextInt();
        int b= r.nextInt();
        int c= r.nextInt();
       // Scanner e= new Scanner(System.in);h
        //Scanner f= new Scanner(System.in);
    //        Scanner c= new Scanner(System.in);
        if ((a < b && a > c) || (a < c && a > b)) {

            System.out.println(a + " is median number");

        }
        if ((b < a && b > c) || (b > a && b < c)) {
            System.out.println(b + " is median number");
        }
        if ((c < a && c > b) || (c > a && c < b)) {

            System.out.println(c+ " is median number");
        }
    }
}