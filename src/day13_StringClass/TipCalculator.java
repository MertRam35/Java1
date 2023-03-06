package day13_StringClass;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Split or No Split (Yes or No) ?");
        String text = scanner.nextLine().toLowerCase();

        System.out.println("Enter the Number of People");
        int number = scanner.nextInt();

        System.out.println("Enter the check amount");
        int amount = scanner.nextInt();

        System.out.println("How was the service quality ? (Excellent/Great/Good/Fair/Poor");
        scanner.nextLine();
        String quality = scanner.nextLine().toLowerCase();
        double poor = 0.05, fair = 0.1, good = 0.15, great = 0.2, excellent = 0.25;

        System.out.println("Number of people entered : " + number);
        double evaluation = 0;
        if (quality.equalsIgnoreCase("poor")) {
            evaluation = poor;
        } else if (quality.equalsIgnoreCase("fair")) {
            evaluation = fair;
        } else if (quality.equalsIgnoreCase("good")) {
            evaluation = good;
        } else if (quality.equalsIgnoreCase("great")) {
            evaluation = great;
        } else if (quality.equalsIgnoreCase("excellent")) {
            evaluation = excellent;
        }

        System.out.println("Total to pay : " + (amount + (amount * evaluation)));
        System.out.println("total tip : " + amount * evaluation);
        System.out.println("Total per person : " + (amount + (amount * evaluation)) / number);
        System.out.println("Tip per person : " + (amount * evaluation) / number);

        switch (quality) {
            case "poor":
                System.out.println("Total to pay : " + (amount + (amount * poor)));
                System.out.println("total tip : " + amount * poor);
                System.out.println("Total per person : " + (amount + (amount * poor)) / number);
                System.out.println("Tip per person : " + (amount * poor) / number);
                break;
            case "fair":
                System.out.println("Total to pay : " + (amount + (amount * fair)));
                System.out.println("total tip : " + amount * fair);
                System.out.println("Total per person : " + (amount + (amount * fair)) / number);
                System.out.println("Tip per person : " + (amount * fair) / number);
                break;
            case "good":
                System.out.println("Total to pay : " + (amount + (amount * good)));
                System.out.println("total tip : " + amount * good);
                System.out.println("Total per person : " + (amount + (amount * good)) / number);
                System.out.println("Tip per person : " + (amount * good) / number);
                break;
            case "great":
                System.out.println("Total to pay : " + (amount + (amount * great)));
                System.out.println("total tip : " + amount * great);
                System.out.println("Total per person : " + (amount + (amount * great)) / number);
                System.out.println("Tip per person : " + (amount * great) / number);
                break;
            case "excellent":
                System.out.println("Total to pay : " + (amount + amount * excellent));
                System.out.println("total tip : " + amount * excellent);
                System.out.println("Total per person : " + (amount + (amount * excellent)) / number);
                System.out.println("Tip per person : " + (amount * excellent) / number);
                break;
            //if (quality.equals("poor"))


        }
        scanner.close();
    }
}
