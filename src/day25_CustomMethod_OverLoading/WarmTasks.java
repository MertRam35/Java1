package day25_CustomMethod_OverLoading;

public class WarmTasks {
    public static void main(String[] args) {


        int a =sumOf2Numbers(25,50,75);

        System.out.println(a);




    }

    public static int sumOf2Numbers(int num1, int num2, int num3){

        int sumof2Numbers = num1+ num2+num3;


        return sumof2Numbers;
    }
}
