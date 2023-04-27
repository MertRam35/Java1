package replits;

public class test2 {

    public static void main(String[] args) {

        int firstNum = 0,
                secondNum = 1,
                total = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print(firstNum + ", ");
            total = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = total;
        }


    }
}
