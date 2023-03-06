package day19Loops;

import java.util.Scanner;

public class examples {
    public static void main(String[] args) {


/* for döngüsünde alt alta 10 satır her bir satırda satır numarası yanında satır numarası kadar yıldız*/

        for (int i = 1; i <= 10 ; i++ ) {
            System.out.print(i);
            for (int j = 1 ; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();


        }


    }
}
