package reviews.week_11;

import replits.MergeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraylistIntro {

    public static void main(String[] args) {

        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(5,6,7,8));


       ArrayList<Integer> result = mergeLists(nums1,nums2);
        Collections.sort(result);
        System.out.println(result);
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> result = new ArrayList<>(nums1);
        result.addAll(nums2);
        return result;
    }
}
