package day09_IfStatements;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 11, n2 = 3;
        //new in()
        char mathOperator = '$';
        if (mathOperator == '-') {
            System.out.println(n1 - n2);
        } else if (mathOperator == '+') {
            System.out.println(n1 + n2);
        } else if (mathOperator == '*') {
            System.out.println(n1 * n2);
        } else if (mathOperator == '/') {
            System.out.println(n1 / n2);

        }else System.err.println("error");

    }

}
