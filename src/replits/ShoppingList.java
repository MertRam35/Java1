package replits;

import java.util.Scanner;

public class ShoppingList {

    public static class ShoppingItem
    {
        public String itemName;
        public double itemPrice;
        ShoppingItem(String itemName, double itemPrice)
        {
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int itemCount = 1;
        int arrayCount = 0;
        String item;
        double price;
        String reply;

        double totalPrice = 0;
        ShoppingItem[] list;

        list = new ShoppingItem[50];


        do
        {
            System.out.println("Enter Item"+itemCount+" and its price:");
            item = scan.nextLine();
            price = scan.nextDouble();

            list[arrayCount] = new ShoppingItem(item,price);
            itemCount++;
            arrayCount++;
            System.out.println("Add one more item?");
            scan.nextLine();
            reply=scan.nextLine();
        }
        while(reply.equals("yes"));

        for(int i=1;i<=arrayCount;i++)
        {
            if(i!=arrayCount)
            {
                System.out.print("Item"+i+ ": "+ list[i-1].itemName + " Price: " + list[i-1].itemPrice + ", ");
            }
            else
            {
                System.out.println("Item"+i+ ": "+ list[i-1].itemName + " Price: " + list[i-1].itemPrice);
            }
            totalPrice +=(list[i-1].itemPrice);
        }

        System.out.println("Total price: " + totalPrice);

    }


}
