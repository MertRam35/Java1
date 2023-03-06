package day10_Nestedif;

public class ifStatementsWithoutCurlyBraces {
    public static void main(String[] args) {
        int number = 12;
        String month = "";
        if (number > 0 && number <= 12) {
            if (number == 1) month = "This month is January";
            else if (number == 2) month = "This month is February";
            else if (number == 3)
                month = "This month is March";
            else if (number == 4)
                month = "This month is April";
            else if (number == 5)
                month = "This month is May";
            else if (number == 6)
                month = "This month is June";
            else if (number == 7)
                month = "This month is July";
            else if (number == 8)
                month = "This month is August";
            else if (number == 9)
                month = "This month is september";
            else if (number == 10)
                month = "This month is October";
            else if (number == 11)
                month = "This month is November";
            else if (number == 12)
                month = "This month is December";
        } else
            System.out.println(" Sorry");

        System.out.println(month);


    }
}






