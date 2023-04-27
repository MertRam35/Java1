package replits;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
int i=0;
        do {
            System.out.println("Day " + (i++) + " " + Arrays.toString(inhabitants));
            for (int j = 0; j < inhabitants.length; j++) {
                if (j != inhabitants.length - 1 && j != 0 && inhabitants[j] == 0) {
                    inhabitants[j + 1] /= 2;
                    inhabitants[j - 1] /= 2;
                } else if (j == 0 && inhabitants[j] == 0) {
                    inhabitants[j + 1] /=2 ;
                } else if (j == inhabitants.length - 1 && inhabitants[j] == 0) {
                    inhabitants[j - 1] /= 2;
                }
            }

        }while (Arrays.stream(inhabitants).sum() > 0);



        System.out.println("---- EXTINCT ----");

    }
}
//TODO BU ALIŞTIRMAYI SOR