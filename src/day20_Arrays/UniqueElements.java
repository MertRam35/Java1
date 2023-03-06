package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] items = new String[5];
        int[] prices = new int[5];
        int totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println("enter " + (i + 1) + ". item's name");
            items[i] = scan.next();
            System.out.println("enter " + (i + 1) + ". item's price");
            prices[i] = scan.nextInt();
            totalPrice += prices[i];

        }//System.out.println(items[i]+" = "+prices[i]);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" -- "+prices[i]);
        }
        System.out.println(Arrays.toString(items)+Arrays.toString(prices));
        System.out.println(Arrays.toString(prices));
        System.out.println("totalPrice = " + totalPrice);

    }
}
