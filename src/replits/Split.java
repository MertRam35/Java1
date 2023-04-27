package replits;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] sentence2 = sentence.split(" ");
        for (int i = sentence2.length - 1; i >= 0; i--) {
          if (i!=0){
              System.out.print(sentence2[i]+" ");
          }else  System.out.print(sentence2[i]);
        }
    }
}
