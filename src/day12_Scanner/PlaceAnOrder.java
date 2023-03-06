package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the product name");
        String product = scanner.nextLine();
        System.out.println("enter the price");
        double price;
        price = scanner.nextDouble();
        System.out.println("enter the quantity");
        int quantity = scanner.nextInt();
        System.out.println("enter their first name");
        String name = scanner.next();
        System.out.println(name + ", your order for " + quantity + " " + product + " has been places. Your total is " + (int) (price*quantity));


    }
}
