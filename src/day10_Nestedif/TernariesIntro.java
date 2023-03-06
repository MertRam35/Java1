package day10_Nestedif;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;
        /*if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }*/
        String result1 = (n % 2 == 0) ? "Even" : "odd";
        System.out.println(result1);
        int age=7;
        String result2 = (age>18 && age<24 )? "Cigarettes" : "No Cigarettes";
        System.out.println(result2);

        int number = 00;
        String result3= (number>0)? "positive" : (number<0) ? "negative" : "zero";
        System.out.println(result3);


    }
}
