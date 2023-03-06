package day11_SwitchStatements;

import java.util.Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {
        System.out.println("Please Write Size");

        String size = "short";
        if (size == "tall" || size == "grande" || size == "venti") {
            switch (size) {
                case "tall":
                    System.out.println(size);
                    System.out.println("price is $3.69");
                    System.out.println("90 calories");
                    break;
                case "grande":
                    System.out.println(size);
                    System.out.println("price is $3.99");
                    System.out.println("120 calories");
                    break;
                default:
                    System.out.println(size);
                    System.out.println("price is $4.29");
                    System.out.println("150 calories");
            }
        } else System.out.println("Invalid Size");


    }


}
