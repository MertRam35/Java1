package day08_IfStatements;

public class SwapTwoVariable_WithTemporaryVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        b =25;
        int c= b;
        a = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
