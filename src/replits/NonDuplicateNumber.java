package replits;

import java.util.Scanner;

public class NonDuplicateNumber {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


        for (int num : nums) {
            int count =0;
            for (int i : nums) {
                if (i==num)count++;
            }
            if (count==1)
                System.out.println(num);

        }

    }
}
