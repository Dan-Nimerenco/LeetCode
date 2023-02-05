package LeetCode.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class HouseRobber {

    public static void main(String[] args){
        int[] numerele = {8,2,8,9,2};
        System.out.println(rob(numerele));
    }

    public static int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int suma=0;
        Deque<Integer> lista = new ArrayDeque<>();
        for(int i:nums){
            suma+=i;
            lista.offer(i);
        }
        int cnt=0;
        int prim=0;
        int doil=0;
        int ref=0;
        while (true){
            if (lista.size()<2){
                break;
            }
            else {
                prim=lista.poll();
                doil=lista.poll();
            }
            if (prim>=doil){
                ref=1;
                cnt+=prim;
            }
            else {
                lista.poll();
                ref=2;
                cnt+=doil;
            }
        }
        if (lista.size()==1){
            cnt+=lista.pop();
        }
        suma=suma-cnt;
        return Math.max(suma,cnt);
    }
}
















