package reviews.week_14.Exceptions;

import replits.MinutesSeconds;

import javax.management.timer.Timer;

public class checkedException {

    public static void main(String[] args) {

        System.out.println("adam");


        waitFor(3);
        System.out.println("özkan");
    }

    public static void waitFor(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
