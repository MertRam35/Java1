package replits;

import java.util.Scanner;

public class Diving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        for (int i = 0, j = 1; i < score.length; i++, j++) {
            System.out.println("Enter score for judge " + j + ":");
            score[i] = input.nextFloat();
        }
        System.out.println("Enter the difficulty rating:");
        float rating = input.nextFloat();
        float lowest = 500;
        for (float v : score) {
            if (v < lowest)
                lowest = v;
        }
        float highest = 0;
        for (float v : score) {
            if (v > highest)
                highest = v;
        }
        float total = 0;
        for (float v : score) {
            total += v;
        }
        total -= (highest + lowest);

        float result = (float) ((total * rating) * 0.6);

        System.out.println("Final score: " + result);
    }
}
