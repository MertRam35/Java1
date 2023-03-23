package reviews.week_05;

import java.util.Scanner;

public class CountHi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int itemNo = 1;
        System.out.println("Enter the name of item " + itemNo++);
        String nameOfItem = scan.nextLine();
        System.out.println("Enter the price of the " + nameOfItem);
        double priceOfItem = scan.nextDouble();
        System.out.println("How many " + nameOfItem + " will you buy?");
        int numberOfItem = scan.nextInt();
        scan.nextLine();
        double totalPrice = priceOfItem * numberOfItem;
        String shoppingList = nameOfItem + " x " + numberOfItem + " - $" + totalPrice+"\n";

        System.out.println("Do you want to add more items to the shopping list?");
        String answer = scan.nextLine();
        double totalCost= totalPrice;
        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter the name of item " + itemNo++);
            nameOfItem = scan.nextLine();
            System.out.println("Enter the price of the " + nameOfItem);
            priceOfItem = scan.nextDouble();
            System.out.println("How many " + nameOfItem + " will you buy?");
            numberOfItem = scan.nextInt();
            scan.nextLine();
            totalPrice = priceOfItem * numberOfItem;
            totalCost +=totalPrice;
            shoppingList +=nameOfItem + " x " + numberOfItem + " - $" + totalPrice+"\n";
            System.out.println("SHOPPING LIST:\n"+shoppingList);
            System.out.println("Do you want to add more items to the shopping list?");
            answer = scan.nextLine();
            if (answer.equalsIgnoreCase("no")){
                System.out.println("SHOPPING LIST:\n"+shoppingList+"\n"+"Total cost: $"+totalCost);
                System.exit(0);
            }
        }


    }
}
