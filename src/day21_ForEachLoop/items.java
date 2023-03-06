package day21_ForEachLoop;

public class items {

    public static void main(String[] args) {


        String[] items = {"shoes", "Jacket", "Gloves", "Airpods", "İpad", "İPhone12 Case"};
        double[] prices = { 99.99,150.0,9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 123456, 12347, 12348, 12349, 12350};
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" - $"+prices[i]+" - "+itemIDs[i]);
        }
    }
}
