package replits;

import java.util.Scanner;

public class MinutesSeconds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputSeconds =0;
        int hours =0;
        int minutes =0;
        int Seconds =0;
        System.out.println("Enter seconds:");
        inputSeconds =scan.nextInt();

        hours = inputSeconds/(60*60);
        int hoursSeconds = 60*60;//;
        int remainMinutes = (inputSeconds%hoursSeconds)/60;
        int remainSeconds = inputSeconds-(hours*60*60)-(remainMinutes*60);
        System.out.println(hours+" hours, "+remainMinutes+ " minutes, and "+remainSeconds+" seconds");

    }
}
