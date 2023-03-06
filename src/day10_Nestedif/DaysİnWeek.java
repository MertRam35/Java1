package day10_Nestedif;

public class DaysİnWeek {
    public static void main(String[] args) {

      String number;
        number ="";
        /*String Day = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ?
                "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : (number == 7) ? "Sonday" : "Wrong answer";

        String day2 = (number == 1) ? "Monday":"sORRY";

        System.out.println(Day);
        System.out.println(day2);*/
        System.out.println("---------------------------------------------");

        switch (number) {
            case "1":
                System.out.println("Monday");
                System.out.println("sorry");
             break;
            default:
                System.out.println("İmpossible Answer");
                break;
            case "as":
                System.out.println("Tuesday");
              break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
              //  break;
            case "5":
                System.out.println("Friday");
             //   break;
            case "6":
                System.out.println("Saturday");
              //  break;
            case "7":
                System.out.println("Sonday");
              break;
            //default:
             // System.out.println("İmpossible Answer");
        }
    }
}
