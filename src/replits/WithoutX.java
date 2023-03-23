package replits;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String outPut = word;
        //WRITE YOUR CODE HERE
        if (word.toLowerCase().startsWith("x")) {
            outPut = outPut.substring(1);
        }
        if (word.toLowerCase().endsWith("x")){
            outPut = outPut.substring(0,outPut.length()-1);
        }
        System.out.println(outPut);



        String word1 = scan.next();
        String word2 = scan.next();
        if (word1.length() <5){
            System.out.println("Too Short!");
        }else if (word1.length() >5){
            System.out.println("Too long!");
        }else if (word1.length() == 5){
            System.out.println(""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));

    }}
}
