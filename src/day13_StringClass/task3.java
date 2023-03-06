package day13_StringClass;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write a string");
        String str = scanner.nextLine();
        char first = str.charAt(0);
        char last =  str.charAt(str.length()-1);
        boolean tf = first==last;
       if (tf){
            System.out.println("same"); }else System.out.println("different");

        scanner.close();




    }
}
