package replits;

import java.util.ArrayList;
import java.util.Scanner;

public class Nanuk {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }




    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {

        int goal = 0;
        for (String each : result) {

            goal += Integer.parseInt(each);

        }
        boolean r1 = goal >= boast;
        boolean r2 = true;
        int nanukGoal = 0;
        for (String each : result) {
            if (each.equals("nanuk"))
                nanukGoal++;
            if (wayStones == 0 && nanukGoal == 0) {

                r2 = true;
            } else if (wayStones > 0 && nanukGoal > wayStones) {
                r2 = false;}else r2 = false;

            }


            return r1 && r2;
        }
    }
