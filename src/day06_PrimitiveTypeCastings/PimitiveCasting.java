package day06_PrimitiveTypeCastings;

public class PimitiveCasting {
    public static void main(String[] args) {

//double > float > long > int > short > byte

        int a = 100;
        double b = a / 6;
        System.out.println(b);

        double c = a/6;
        System.out.println(c);
        double d = (double) a/6;
        System.out.println(d);


    }
}
