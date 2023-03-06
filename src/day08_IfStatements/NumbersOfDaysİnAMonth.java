package day08_IfStatements;

public class NumbersOfDaysİnAMonth {
    public static void main(String[] args) {

        int number = 6;
        if (number == 1) {
            System.out.print("This Month is January");
        }
        if (number == 2) {
            System.out.print("This Month is February");
        }
        if (number == 3) {
            System.out.print("This Month is March");
        }
        if (number == 4) {
            System.out.print("This Month is April");
        }
        if (number == 5) {
            System.out.print("This Month is May");
        }
        if (number == 6) {
            System.out.print("This Month is June");
        }
        if (number == 7) {
            System.out.print("This Month is July");
        }
        if (number == 8) {
            System.out.print("This Month is August");
        }
        if (number == 9) {
            System.out.print("This Month is september");
        }
        if (number == 10) {
            System.out.print("This Month is October");
        }
        if (number == 11) {
            System.out.print("This Month is November");
        }
        if (number == 12) {
            System.out.print("This Month is December");
        }

        if (number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12) {
            System.out.println(" and This Month has 31 days.");
        }

        if (number == 2) {
            System.out.println(" and This Month has 28 days.");
        }

        if (number == 4 || number == 6 || number == 9 || number == 11) {
            System.out.println(" and This Month has 30 days.");
        }

    }
}

