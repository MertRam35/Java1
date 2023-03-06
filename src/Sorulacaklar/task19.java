package Sorulacaklar;

public class task19 {

    public static void main(String[] args) {

        int decimal = 21;
        int reminder = 0;
        int division = decimal;
        String binary = "";
        while (division >= 2) {

            reminder = division % 2;
            division = division / 2;
            binary += reminder;

        }
        binary += division;
        System.out.println(new StringBuilder(binary).reverse().toString());
    }
}
/*
19. Write a Java program to convert a decimal number to binary number. Go to the editor
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */