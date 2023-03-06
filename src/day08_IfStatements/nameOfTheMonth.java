package day08_IfStatements;

public class nameOfTheMonth {
    public static void main(String[] args) {

        int number = 2;
        String month = "";
        String result11 = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3)? "March" :(number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number==11)? "November" :(number==12)? "December" : "Sorry";
        System.out.println(result11);
        System.out.println("------------------------------------");
        if (number > 0 && number <= 12) {
            if (number == 1) {
                month = "This month is January";
            } else if (number == 2) {
                month = "This month is February";
            } else if (number == 3) {
                month = "This month is March";
            } else if (number == 4) {
                month = "This month is April";
            } else if (number == 5) {
                month = "This month is May";
            } else if (number == 6) {
                month = "This month is June";
            } else if (number == 7) {
                month = "This month is July";
            } else if (number == 8) {
                month = "This month is August";
            } else if (number == 9) {
                month = "This month is september";
            } else if (number == 10) {
                month = "This month is October";
            } else if (number == 11) {
                month = "This month is November";
            } else if (number == 12) {
                month = "This month is December";
            }//System.out.println(month);

        } else {
            System.out.println(" Sorry");
        }
        System.out.println(month);
    }
}
