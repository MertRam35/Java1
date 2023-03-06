package day09_IfStatements;

public class OxygenTank {
    public static void main(String[] args) {
        /*
4. Create a class called OxygenTank. You are diving in the ocean. Your oxygen tank has a certain level (number)
and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

         */

        int number ;
        number= 25;
        String message = "";
        if (number >= 90) {
            message = " Your Tank is full";
        } else if (number >= 80) {
            message = " Still Okay";
        } else if (number >= 70) {
            message = " Don't Go too Far";
        } else if (number >= 60) {
            message = " Start to head back";
        } else if (number >= 50) {
            message = " Be careful now you at at 50%";
        } else {
            message = " Benzin yok";

        }
        System.out.println("Above " + number + " - " + message);


    }
}
