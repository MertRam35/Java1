package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number= 65;
        boolean a= number%2==0;
        boolean b=number%3==0;
        boolean c=number%5==0;
        System.out.println(number+" is divisible by 2 : "+a);
        System.out.println(number+" is divisible by 3 : "+b);
        System.out.println(number+" is divisible by 2 : "+c);


    }
}
