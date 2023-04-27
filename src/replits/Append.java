package replits;

import java.util.ArrayList;
import java.util.Scanner;

public class Append {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list) {
int sum =0;

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list) {
            if (each >0)
     result.add(each);
sum += each;
        }
        result.add(sum);
return result;
    }
}