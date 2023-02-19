package LeetCode.LeetCode;

public class MaximumSubarray {

    public static void main(String[] args){
        int[] numerele = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(numerele));
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index1 = 0;
        int index2 = nums.length-1;
        int sum = 0;
        if (nums.length==1){
            return nums[0];
        }
        for (int i: nums){
            if (i>=max){
                max=i;
            }
            sum+= i;
        }
        max = Math.max(sum,max);
        while (index1!=index2){
            if (nums[index1]<nums[index2]){
                sum-=nums[index1];
                max = Math.max(max,sum);
                index1++;
            }
            else {
                sum-=nums[index2];
                max = Math.max(max,sum);
                index2--;
            }
        }
        return max;
    }
}
