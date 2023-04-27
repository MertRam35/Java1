package replits;

import java.util.Arrays;

public class MeetingTask {

    public static void main(String[] args) {


        String str = "I Love Java ";
        String[] love = str.split(" ");

        System.out.println(Arrays.toString(love));

        for (int i = 0; i < love.length; i++) {

            if (i == 1) {
                String dummy = "";
                for (int j = love[1].length() - 1; j >= 0; j--) {

                    dummy += love[i].charAt(j) + "";

                }
                love[1] = dummy;
            }
            System.out.print(love[i] + " ");

        }

    }
}
