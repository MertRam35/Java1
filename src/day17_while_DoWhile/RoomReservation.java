package day17_while_DoWhile;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = 0;
        String roomType = "";
        System.out.println("Do you want to reserve a room ?");
        String answer = "";
        while (!(answer.equals("yes")) || !(answer.equals("no"))) {
            answer = scan.nextLine().toLowerCase();
            if (answer.equals("yes")) {
                System.out.println("Which Type of Room want to reserve ?");

                while (roomType != "king bed" || roomType != "queen bed" || roomType != "single bed") {
                    roomType = scan.nextLine().toLowerCase();

                    if (roomType.equals("king bed")) {
                        price = 120;
                        break;
                    } else if (roomType.equals("queen bed")) {
                        price = 100;
                        break;
                    } else if (roomType.equals("single bed")) {
                        price = 80;
                        break;
                    } else {
                        System.out.println("invalid room type. Please re-enter Room Type.");

                    }
                }

            } else if (answer.equals("no")) {
                System.out.println("Have a nice day");
                break;
            } else System.out.println("re-enter answer yes/no");

            // answer = scan.next().toLowerCase();


        }
        System.out.println( "Your room type is "+roomType+" and you must pay $"+price);

    }
}