package LeetCode.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int cnt=0;
        for (int i=0;i<=nums1.length-1;i++){
            if (i>(m-1)){
                nums1[i]=nums2[cnt];
                cnt++;
            }
        }
        Arrays.sort(nums1);
    }
}
