package Sorulacaklar;


    import java.util.Scanner;
    public class Exercises33 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input an integer: ");
        int n = input.nextInt();

            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }System.out.println("The sum of the digits is: " + sum);

        }


    }


