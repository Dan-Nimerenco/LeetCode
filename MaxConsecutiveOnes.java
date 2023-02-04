package LeetCode.LeetCode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ver = 0;
        int cnt=0;
        int numb =nums.length-1;
        for(int i=0; i<=numb;i++){
            if(nums[i]==1){
                cnt++;
                if (cnt>ver){
                    ver=cnt;
                }
            }
            else {
                cnt=0;
            }
        }
        return ver;
    }
}
