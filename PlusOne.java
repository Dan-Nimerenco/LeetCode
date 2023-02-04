package LeetCode.LeetCode;

public class PlusOne {
    private static boolean allNines(int[] digs){
        int cnt=0;
        for (int i =0;i<=digs.length-1;i++){
            if (digs[i]==9){
                cnt++;
            }
        }
        return cnt==digs.length;
    }

    public static int[] plusOne(int[] digits){
        if (allNines(digits)){
            int[] digs = new int[digits.length+1];
            digs[0] =0;
            int m = digs.length-1;
            while(m>0){
                digs[m] = 9;
                m--;
            }
            digits = digs;

        }
        int j = digits.length-1;
        if (digits[j]==9){
            while(digits[j] ==9){
                digits[j]=0;
                if (digits[j-1] == 9){
                    j--;
                }
                else{
                    digits[j-1]++;
                }
            }
            return digits;
        }
        else {
            digits[j]++;
            return digits;
        }
    }
}
