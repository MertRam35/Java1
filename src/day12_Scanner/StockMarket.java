package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many total shares are you have already ?");
        int total;
        total = scanner.nextInt();
        boolean a = total > 0;
        if (a){
            System.out.println(" How Much total value in the stock market ?");
            double value = scanner.nextDouble();
            System.out.println("Enter the name of the company you have most shares in ");
            scanner.nextLine();
            String company = scanner.nextLine();
            System.out.println(" Your total stock market holding is $"+(int)value+" which is made up of "+total+" shares."+company+" is your company holdings.");
       }


    }
}
