package day13_StringClass;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("valid passport ? yes or no");
        String valid = scanner.nextLine().trim();
        int cost = 0;
        String country = "";

        if (valid.equalsIgnoreCase("yes")) {
            int ticket = 1000;

            System.out.println("which country will you travel ?");
            country = scanner.nextLine();

            System.out.println("How Many bags will you take ?");
            byte bags = scanner.nextByte();
            int ticketsWithBags = bags * 50;

            System.out.println("How Many people will you travel with ?");
            short peopleWith = scanner.nextShort();
            int discount = peopleWith <= 3 ? peopleWith * 100 : 300;
            cost = (ticket * peopleWith) + ticketsWithBags - discount;

            System.out.println("Name of the people travel with you ?");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " + bags +
                    " bags but you are travelling with " + peopleWith + " people so we are giving a discount. Your total cost is " + cost);
        }
        else if (valid.equalsIgnoreCase("no")) {
            int renewal = 200;
            System.out.println(" when your passport expired?");
            int expiredYear = scanner.nextInt();
            cost = ((2022-expiredYear) * 75);

            System.out.println("Which Country you plan to ?");
            country = scanner.next();

            System.out.println("Will you travel next year ? (yes or no)");
            String nextYearTravel = scanner.next();
            if (nextYearTravel.equalsIgnoreCase("yes")) {
                cost += 100;
            }
            else if (nextYearTravel.equalsIgnoreCase("no")) {
                cost -= 50;
            }

            System.out.println("Looks like your password has been expired for " + (2022 - expiredYear) + " years," +
                    " but no to worry we will get it ready for you to travel to all countries. Your total cost has come out to " +(cost+renewal));
        }
        else {
            System.out.println("Please type yes or no");
        }

    }
}
