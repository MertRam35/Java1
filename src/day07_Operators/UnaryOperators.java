package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        /*int num2 = 25;
        System.out.println(num2);
        System.out.println(" c = " + num2);
        System.out.println(num2++);
        System.out.println(num2);*/
        int x = 200;
        System.out.println(x);//200
        //System.out.println(--x);//199
        System.out.println(x++);//200
        System.out.println(x);//201
        int y = (x++);
        System.out.println("y = " + y);//200


    }
}
