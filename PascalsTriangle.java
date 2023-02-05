package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        int numrand = numRows;
        List<List<Integer>> PascalTr = new ArrayList<>();
        List<Integer> firstRaw = new ArrayList<>();
        firstRaw.add(1);
        PascalTr.add(firstRaw);
        if (numrand==1){
            return PascalTr;
        }
        numRows--;
        List<Integer> secondRaw = new ArrayList<>();
        secondRaw.add(1);
        secondRaw.add(1);
        PascalTr.add(secondRaw);
        numRows--;
        List<Integer> workRow;
        List<Integer> uplRow = new ArrayList<>(secondRaw);
        while (numRows!=0){
            workRow = new ArrayList<>();
            workRow.add(1);
            while (!uplRow.isEmpty()){
                if (uplRow.size() >=2){
                    workRow.add(uplRow.get(0) + uplRow.get(1));
                    uplRow.remove(0);
                }
                else {
                    uplRow.clear();
                }
            }
            workRow.add(1);
            PascalTr.add(workRow);
            if (numrand>numRows-2){
                uplRow = new ArrayList<>(workRow);
            }
            numRows--;
        }
        return PascalTr;
    }
}
