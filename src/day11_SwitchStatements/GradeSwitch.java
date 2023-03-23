package day11_SwitchStatements;

import java.util.Scanner;

/*> -``
  Hello, which item would you like?
  Hat
  Thank you for your purchase!
  Your current balance is: 75$

> - Blanket: $60
> - Charger: $5
> - Hat: $25
> - Headphones: $30
> - Laptop: $200
> - Pants: $50
> - Pillow: $40
> - Smartphone: $1000
> - Socks: $5
> - USB cable: $10

 */
public class GradeSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        String response = scan.next();

        double totalPrice = 0;

        switch (response) {
            case "13.3":
                totalPrice += 200;
                break;
            case "15.0":
                totalPrice += 300;
                break;
            case "17.3":
                totalPrice += 400;
                break;
        }
        System.out.println("Select CPU type:");
        String cpuType = scan.next();
        switch (cpuType) {
            case "i3":
                totalPrice += 150;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;

        }

        System.out.println("Select RAM size:");
        int ram  = scan.nextInt();
        totalPrice+= (50*(ram/4));

        System.out.println("Select storage type:");
        String hdd = scan.next();



        System.out.println("Select storage size:");
        int size  = scan.nextInt();
        switch (hdd) {
            case "HDD":
                totalPrice += (50*(size/500));
            case "SSD":
                totalPrice += (100*(size/500));
                break;}


        System.out.println("Select screen resolution:");
        String ssolution = scan.next();
        switch (hdd) {
            case "FULLHD":
                totalPrice += 100;
            case "4K":
                totalPrice += 200;
                break;

        }
        System.out.println("Final price is: $"+totalPrice);
    }


}


  
