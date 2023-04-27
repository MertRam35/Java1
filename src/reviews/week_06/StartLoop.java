package reviews.week_06;

import java.util.Random;
import java.util.Scanner;

public class StartLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hiddenNumber = random.nextInt(25);
        boolean flag = true;System.out.println("Try to find the number");
        do {

            int num = scanner.nextInt();
            if (num == hiddenNumber){
                flag = false;
                System.out.println("found number");
            }else System.out.println("Try another number");
        }while (flag);




    }
}
