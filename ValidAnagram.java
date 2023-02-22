package LeetCode.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ValidAnagram {


//      SECOND VERSION
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        int cnt=1;
        HashMap<Character,Integer> list1 = new HashMap<>();
        for (int i=0; i<=first.length-1;i++){
            if (list1.containsKey(first[i])){
                list1.put(first[i], list1.get(first[i])+1);
            }
            else {
                list1.put(first[i],cnt);
            }

        }
        for (int j=0; j<=second.length-1;j++){
            if (list1.containsKey(second[j])){
                list1.put(second[j],list1.get(second[j])-1);
                if (list1.get(second[j])==0){
                    list1.remove(second[j]);
                }
            }
            else{
                return false;
            }
        }
        if (list1.size()==0){
            return true;
        }
        return false;
    }

//    FIRST VERSION
//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()){
//            return false;
//        }
//        char[] first = s.toCharArray();
//        char[] second = t.toCharArray();
//        ArrayList<Character> list1 = new ArrayList<>(first.length);
//        for (char i : first){
//            list1.add(i);
//        }
//        for (char j : second){
//            if (list1.contains(j)){
//                list1.remove(list1.indexOf(j));
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
//    }
}
