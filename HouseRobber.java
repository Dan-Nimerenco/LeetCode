package LeetCode.LeetCode;

public class HouseRobber {

    public static int rob(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        int ind1=0;
        int ind2=1;
        int cnt1 = nums[ind1];
        int cnt2 =nums[ind2];
        int ver=0;
        while (ind1<nums.length-3){
            if (nums[ind1+2]<nums[ind1+3]){
                cnt1+=nums[ind1+3];
                ind1+=3;
                ver=3;
            }
            else{
                cnt1+=nums[ind1+2];
                ind1+=2;
                ver=2;
            }
        }
        if (ver==2){
            cnt1+=nums[nums.length-1];
        }
        while (ind2<nums.length-3){
            if (nums[ind2+2]<nums[ind2+3]){
                cnt2+=nums[ind2+3];
                ind2+=3;
                ver=3;
            }
            else{
                cnt2+=nums[ind2+2];
                ind2+=2;
                ver=2;
            }
        }
        if (ver==2){
            cnt2+=nums[nums.length-1];
        }
        return Math.max(cnt1,cnt2);
    }
}
