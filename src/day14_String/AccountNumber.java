package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type your account number ");
        String accountNumber = scanner.next();

        int length = accountNumber.length();
        char firstCharacter = accountNumber.charAt(0);
        if (firstCharacter == '2'&& length == 7) {

        } else if (firstCharacter == '5' && length ==10) {

        }else System.out.println("invalid account number");


    }
}
