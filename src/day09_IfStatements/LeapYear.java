package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2006;

        boolean leapyear = year % 4 == 0;
        if (leapyear) {
            System.out.println(year + " is the leapyear");
        }
        if (!leapyear) {
            System.out.println(year + " is Not leapyear");
        }
        System.out.println("------------------");
        if (leapyear) {
            System.out.println(year + " is a leapyear");
        } else {
            System.out.println(year + " is NOT a leapyear");
        }
    }
}
