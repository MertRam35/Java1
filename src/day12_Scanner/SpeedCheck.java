package day12_Scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speedlimit = 55;
        System.out.println("speedlimit = " + speedlimit);
        System.out.println("enter the current speed");
        int speed = scan.nextInt();
        int differ = speed - speedlimit ;
        if (speed > speedlimit) {
            System.out.println("You are driving " + differ + " mph over the limit. Slow Down");
        }
        scan.close();

    }
}
