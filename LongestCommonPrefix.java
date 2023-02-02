package LeetCode.LeetCode;

public class LongestCommonPrefix {
    public static int getSmallestWord(String[] lista){
        int min = Integer.MAX_VALUE;
        for (String i : lista){
            if (i.length()<min){
                min=i.length();
            }
        }
        return min;
    }

    public static String longestCommonPrefix(String[] strs) {
        int index = getSmallestWord(strs)-1;
        if(index<0){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        String firstW = strs[0];
        char firstSymb = firstW.charAt(index);
        char verif='-';
        String rez="";
        char[] bySymbols;
        int updIndex = index;
        while(true){
            for (String i : strs){
                verif=i.toCharArray()[index];
                if (firstSymb!=verif){
                    updIndex = index-1;
                    break;
                }
            }
            index--;
            if (index<0){
                break;
            }
            firstSymb = firstW.charAt(index);
        }
        bySymbols = strs[0].toCharArray();
        for (int i=0;i<(updIndex+1);i++){
            rez+=bySymbols[i];
        }
        return rez;
    }
}
