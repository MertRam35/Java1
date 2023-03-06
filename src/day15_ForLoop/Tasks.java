package day15_ForLoop;

public class Tasks {
    public static void main(String[] args) {
        int sum = 0;int even = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {

                sum += i;
               // System.out.println(even);
            }


        }
        System.out.println(sum);


    }
}
