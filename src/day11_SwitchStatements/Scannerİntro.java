package day11_SwitchStatements;


import java.util.Scanner;

public class Scannerİntro {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter a integer : ");
        int asa = keyboard.nextInt();
        if (asa == 25) {
            System.out.println(keyboard.nextInt());
        } else System.err.println(asa + " = " + "wrong number");
        keyboard.close();
        Scanner mali = new Scanner(System.in);
        int asaa= mali.nextInt();
        System.out.println(asaa);






    }
}
