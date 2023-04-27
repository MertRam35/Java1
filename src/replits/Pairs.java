package replits;

import java.util.Scanner;

public class Pairs {

    public static void main(String[] args){
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+", "+arr[i+1]);
        }
        //WRITE YOUR CODE BELOW:

    }

}
