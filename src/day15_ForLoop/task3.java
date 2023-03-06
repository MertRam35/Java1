package day15_ForLoop;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int total = 0;
        for (int i = 0; i <= number ; i++) {
          total += i;

        }
        System.out.println(total);




    }
}
