package LeetCode.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {

    public int calPoints(String[] operations) {
        Deque<Integer> theScore = new ArrayDeque<>();
        theScore.push(0);
        theScore.push(0);
        int last=0;
        int beforeLast=0;
        int sum=0;
        for (String i : operations){
            if (i.equals("+")){
                last = theScore.pop();
                beforeLast = theScore.pop();
                theScore.push(beforeLast);
                theScore.push(last);
                theScore.push(beforeLast+last);
                sum+=beforeLast+last;
            }
            else if (i.equals("D")){
                last = theScore.peek()*2;
                sum+=last;
                theScore.push(last);
            }
            else if (i.equals("C")){
                sum-=theScore.pop();
            }
            else {
                last = Integer.parseInt(i);
                sum+= last;
                theScore.push(last);
            }
        }
        return sum;
    }




}
