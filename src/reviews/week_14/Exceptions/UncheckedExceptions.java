package reviews.week_14.Exceptions;

import reviews.week_12.ınheritance.TASK.Discord;

public class UncheckedExceptions {
public static Discord discord;
    public static void main(String[] args) {


        try {
            String number ="123";
            System.out.println(Integer.parseInt(number));
        } catch (Exception e) {
           e.printStackTrace();
        }
        System.out.println("a");

       String a = "can you show again how to wrap lines in intellij?";

    }
}
