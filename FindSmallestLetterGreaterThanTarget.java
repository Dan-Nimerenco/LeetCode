package LeetCode.LeetCode;

public class FindSmallestLetterGreaterThanTarget {
    public static int log2ForStepsNumber(int number){
        int num2=2;
        int cnt=1;
        while (num2<=number){
            cnt++;
            num2*=2;
        }
        return cnt;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int limitaStanga = 0;
        int limitaDreapta = letters.length-1;
        int mijloc=(limitaDreapta + limitaStanga)/2;
        if (letters[0]>target || letters[limitaDreapta]<=target){
            return letters[0];
        }
        if (letters.length==2 && letters[limitaDreapta]>target){
            return letters[limitaDreapta];
        }
        int stepNr = log2ForStepsNumber(letters.length);
        for (int i = 1; i<=stepNr;i++){
            if (letters[mijloc]>target){
                limitaDreapta = mijloc;
                mijloc=(limitaDreapta + limitaStanga)/2;
            }
            else if (letters[mijloc]<target){
                limitaStanga = mijloc;
                mijloc=(limitaDreapta + limitaStanga)/2;
            }
            else{
                break;
            }
        }
        if (letters[mijloc]<=target){
            while (letters[mijloc]<=target){
                mijloc++;
            }
            return letters[mijloc];
        }
        else{
            while (letters[mijloc]>target){
                mijloc--;
            }
            return letters[mijloc+1];
        }
    }
}
