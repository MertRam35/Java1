package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Which bedroom do you want to reserve? King/Queen/Single");
            String bedroom = scan.next().toLowerCase();
            int price = 0;
            if (bedroom.equals("king")) {
                price += 120;
            } else if (bedroom.equals("queen")) {
                price += 100;
            } else if (bedroom.equals("single")) {
                price += 80;
            }
            System.out.println("How many nights do you stay ?");
            int night = scan.nextInt();
            String another = "";
            while (true) {
                System.out.println("would you like to reserve another room?");
                another = scan.next().toLowerCase();
                if (another.equals("yes")) {
                    break;
                }
                if (another.equals("no")) {
                    System.out.println("night price is " + price + " and total price is " + price * night);
                    break;
                }
            }
            if (another.equals("no")) {
                break;


            }

        }
    }}



