package LeetCode.LeetCode;

public class MaximumSubarray {

    public static void main(String[] args){
        int[] numerele = {-2,1};
        System.out.println(maxSubArray(numerele));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        if (nums.length==2 && ((nums[0]|nums[1]) <0)){
            return Math.max(nums[0],nums[1]);
        }
        int sum = 0;
        for (int i=0;i<=nums.length-1;i++){
            sum+= nums[i];
        }

        for (int j=0;j<=nums.length-2;j++){
            if (nums[j]<0){
                sum+= Math.abs(nums[j]);
            }
            else if ((nums[j]+nums[j+1])<0){
                sum+=Math.abs(nums[j]+nums[j+1]);
                j++;
            }
            else{
                break;
            }
        }
        if (nums.length>=3){
            for (int j=nums.length-1;j>=1;j--){
                if (nums[j]<0){
                    sum+= Math.abs(nums[j]);
                }
                else if ((nums[j]+nums[j-1])<0){
                    sum+=Math.abs(nums[j]+nums[j-1]);
                    j--;
                }
                else{
                    break;
                }
            }
        }
        return sum;
    }
}
