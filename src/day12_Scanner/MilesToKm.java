package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("EnTER miles");
        double miles = scanner.nextDouble();
        double km = (miles * 1.62137d);
        System.out.println(miles + " miles equal to " + km + " kilometers");


        scanner.close();
    }
}
