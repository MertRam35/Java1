package replits;

public class Fibonacci {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber =1;
        int total = 0;
        for (int i = 0; i < 10; i ++) {
            System.out.print(firstNumber+",");

            total = firstNumber + secondNumber ;
            firstNumber = secondNumber;
            secondNumber = total;



        }



    }
}
