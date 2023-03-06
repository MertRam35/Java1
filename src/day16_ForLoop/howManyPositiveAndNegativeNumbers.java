package day16_ForLoop;

import java.util.Scanner;

public class howManyPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" type a number 5 times");
int positive = 0 , negative =0;
        for (int i = 1; i <= 5; i++) {
            int number = scanner.nextInt();
            if (number>0){
                 positive ++;
            } else if (number<0) {negative++;

            }
        }
        System.out.println(positive+ " positive and "+negative+" negative");


    }
}
