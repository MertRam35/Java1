package day17_while_DoWhile;

import java.util.Scanner;

public class roomReservation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String reserveRoom = "";
        String roomType = "";

        while (!reserveRoom.equalsIgnoreCase("yes") && !reserveRoom.equalsIgnoreCase("no")) {
            System.out.println("Do you want to reserve a room ?");
            reserveRoom = scan.nextLine().toLowerCase();
            int price = 0;
            if (reserveRoom.equalsIgnoreCase("yes")) {
                while (!roomType.equals("king bed") && !roomType.equals("queen bed") && !roomType.equals("single bed")) {
                    System.out.println("Which type of room do you want to reserve ? King Bed/ Queen Bed/ Single Bed");
                    roomType = scan.nextLine().toLowerCase().trim();
                }
                if (roomType.equals("king bed")) {
                    price += 120;
                } else if (roomType.equals("queen bed")) {
                    price += 100;

                } else if (roomType.equals("single bed")) {
                    price += 80;
                }
                System.out.println("Your Room type is " + roomType + " and You must pay $" + price);

            } else if (reserveRoom.equalsIgnoreCase("no")) System.out.println("Have a nice day.");
        }

    }
}