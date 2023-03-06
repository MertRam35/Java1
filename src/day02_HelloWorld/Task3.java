package day02_HelloWorld;

public class Task3 {

    public static void main(String[] args) {
        int num1 = 909;
        int firstDigit = num1 % 10;

        int secondDigit = num1/10 %10;

        int thirdDigit = num1/100;


        System.out.println("The sum of the digits in "+num1+" is "+(firstDigit+secondDigit+thirdDigit));
    }
}
/*Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits

    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12

    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12

 */