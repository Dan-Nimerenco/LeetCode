package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class KeyboardRow {
    public static HashSet<Character> wordToCharHashSet(String word){
        HashSet<Character> ex = new HashSet<>();
        char[] symbols = word.toCharArray();
        for (char i:symbols){
            ex.add(i);
        }
        return ex;
    }

    public static boolean isFromOneKeyboardRow(String row, String word){
        HashSet<Character> ex = wordToCharHashSet(row);
        int size = ex.size();
        char[] let = word.toCharArray();
        for (char i:let){
            ex.add(i);
        }
        return ex.size()==size;
    }

    public static String[] findWords(String[] words) {

        ArrayList<String> rez = new ArrayList<String>();
        for (int i =0; i<= words.length-1;i++){
            if (isFromOneKeyboardRow("qwertyuiop",words[i].toLowerCase()) || isFromOneKeyboardRow("asdfghjkl",words[i].toLowerCase())
                    || isFromOneKeyboardRow("zxcvbnm",words[i].toLowerCase())){
                rez.add(words[i]);
            }
        }
        String[] list = new String[rez.size()];
        for (int j = 0;j<=list.length-1;j++){
            list[j] = rez.get(j);
        }
        return list;
    }
}
