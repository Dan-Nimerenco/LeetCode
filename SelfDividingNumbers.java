package LeetCode.LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbers {

    public static void main(String[] args){
        System.out.println(selfDividingNumbers(1,22));
    }

    public static boolean isSelfDividing(int number){
        int numar = number;
        int num=0;
        while (numar!=0){
            num = numar%10;
            if (num==0){
                return false;
            }
            if (number%num!=0){
                return false;
            }
            numar/=10;
        }
        return true;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> rezultat = new ArrayList<>();
        for (int i = left; i<=right;i++){
            if (isSelfDividing(i)){
                rezultat.add(i);
            }
        }
        return rezultat;
    }

}
