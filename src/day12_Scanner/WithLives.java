package day12_Scanner;

import java.util.Scanner;

public class WithLives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How Many People Lives with you");
        int people = scan.nextInt();
        String text = "";
        if (people > 0) {
            if (people < 3) {
                text = "Live with less than 3 people";
            } else if (people < 6 ) {
                text = "Live with 3-6 people";
            } else text = "Live with more than 6 people";
            scan.close();

        } else text = "İmpossible";
        System.out.println(text);

    }
}

