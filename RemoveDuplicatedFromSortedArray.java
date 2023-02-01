package LeetCode.LeetCode;

import java.util.Arrays;

public class RemoveDuplicatedFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int cnt=0;
        for(int i=0; i<nums.length-1;i++){
            if (nums[i] == nums[i+1]){
                cnt++;
                int j=i+1;
                while (j<=nums.length-2){
                    nums[j]=nums[j+1];
                    j++;
                }
                nums[nums.length-1] = -cnt-Integer.MIN_VALUE;
                i--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-cnt;
    }
}
