package day12_Scanner;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cents");
        int cents = scanner.nextInt();
        int dollar = 0 ;
        dollar = (int) (cents*0.01);

       int küsrat  = cents%100;

        System.out.println(cents+" cents equal to "+dollar+" dolar "+küsrat+" cents");



    }
}
