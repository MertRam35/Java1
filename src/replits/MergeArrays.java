package replits;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

    public static int[] merge(int[] a,int[] b) {


int[] c = new int[a.length+ b.length];
        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
        int j = a.length;
        for (int i = 0; i < b.length; i++) {
            c[j]=b[i];
            j++;
        }


return c;



    }//end merge

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}
