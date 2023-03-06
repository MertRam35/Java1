package day21_ForEachLoop;

public class MaxNUmber {

    public static void main(String[] args) {

        int[] numbers = {10, 200, 0, 40, 50};
        int maxNumber = numbers[0];

        for (int number : numbers) {
            if (maxNumber > number) {
                maxNumber = number;
            }
        }
        int average = 0;
        for (int numbera : numbers) {

            average += numbera;
        }
        System.out.println(average / (numbers.length));
        System.out.println(maxNumber);
    }
}
