package day23_CustomMethods_Void;

public class CustomMethodsPractice {


    public static void times_5(){

        for (int i = 0; i <5 ; i++) {
            System.out.print("Hello World"+"\t\t");

        }
        System.out.println();
    }

    public static void cydeo_5(){

        for (int i = 0; i < 5; i++) {
            System.out.print("Hello Cydeo\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        times_5();

        cydeo_5();

        times_5();
        evenNumbers();
    }
public static void evenNumbers(){
    for (int i = 0; i <= 100; i++) {
        if (i%2 == 0) System.out.print(i+" " );
    }
}


}
