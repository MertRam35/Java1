package day11_SwitchStatements;
import java.util.Scanner;
public class NumberOfDaysİnAMonth {
    public static void main(String[] args) {
//Scanner scanner
        int month = 1;
        int year=2021;
        String days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 10: case 12:
                days = "31 Days";
                break;
            case 4:            case 6:            case 8:            case 9:            case 11:
                days = "30 Days";
                break;
            case 2:
                if (year%4 ==0) {days = "29 Days";}
                else days="28 Days";
                break;
            default:
                days = "İnvalid Month";

        }
        System.out.println(month+". month has "+ days);

    }
}
