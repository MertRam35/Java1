package day17_while_DoWhile;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {

        int divided = 23;
        int diven = 3;
        int result = 0;
        while (divided >= diven) {
            divided -= diven;
            result++;
        }
        System.out.println("result = " + result);
        System.out.println("divided = " + divided);


        System.out.println("---------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter numbers");
        int total = 0;
        while (true) {
            System.out.println("enter numbers");
            int numbers = scan.nextInt();
            if (numbers < 0) {
            break;}
            total += numbers;
        }
        System.out.println("total = " + total);


        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of entered numbers: " + sum);
    }
}
