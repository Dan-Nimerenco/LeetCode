package LeetCode.LeetCode;

public class HappyNumber {

    public static void main(String[] args){
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        if (n/10==0){
            if (n==1 || n==7){
                return true;
            }
            return false;
        }
        int sum=0;
        int numb=0;
        for (int i =0; i<=15;i++){
            while (n!=0){
                numb = n%10;
                sum+= numb*numb;
                n/=10;
            }
            if (sum==1){
                return true;
            }
            else {
                n = sum;
                sum =0;
            }
        }
        return false;
    }

}
