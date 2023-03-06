package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};


        for (int eachElement : numbers) {

            System.out.print(eachElement + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        for (int every : numbers) {
            System.out.print(every + " ");

        }


    }
}
