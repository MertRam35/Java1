package day09_IfStatements;

public class nameOfTheDay {
    public static void main(String[] args) {
        int day = -1;
        if (day >= 1 && day <= 7) {
            if (day == 1) {
                System.out.println("Today is Monday");
            } else if (day == 2) {
                System.out.println("Today is Tuesday");
            } else if (day == 3) {
                System.out.println("Today is Wednesday");
            } else if (day == 4) {
                System.out.println("Today is Thursday");
            } else if (day == 5) {
                System.out.println("Today is Friday");
            } else if (day == 6) {
                System.out.println("Today is Saturday");
            } else if (day == 7) {
                System.out.println("Today is Sunday");
            } /*else //(day!=1 && day!=2 && day!= 3&& day!=4 && day!=5 && day!=6 && day!=8 )
            {
                System.out.println("Sorry wrong number");*/


        }else { System.out.println("Sorry wrong number");}
    }
}
