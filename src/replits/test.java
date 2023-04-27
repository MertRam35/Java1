package replits;

public class test {

    public static void main(String[] args) {

        int counter = 0, firstNum = 0, secondNum = 1, sum = 0;

        while (counter < 10) {

            System.out.print(firstNum +", ");

            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;

            counter++;
        }


    }
}
