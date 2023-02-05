package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public static List<String> fizzBuzz(int n) {
        List<String> rez = new ArrayList<String>();
        int first=0;
        int second=0;
        int cnt=1;
        while (cnt<=n){
            first=cnt%3;
            second=cnt%5;
            if (first==0 && second==0){
                rez.add("FizzBuzz");
            }
            else if (first==0){
                rez.add("Fizz");
            }
            else if (second==0){
                rez.add("Buzz");
            }
            else{
                rez.add(""+cnt);
            }
            cnt++;
        }
        return rez;
    }
}
