package LeetCode.LeetCode;

public class CountAndSay {

    public static void main(String[] args){
        System.out.println(countAndSay(5));
    }

    private static String convTool(String numaru){
        if (numaru.equals("1")){
            return "1";
        }
        char[] lista = numaru.toCharArray();
        int cnt=1;
        String str="";
        for (int i=0;i<=lista.length-2;i++){
            if (lista[i]==lista[i+1]){
                cnt++;
            }
            else {
                str+=""+cnt+ lista[i];
                cnt=1;
            }
        }
        str+=""+cnt+ lista[lista.length-1];
        return str;
    }


    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String rez;
        String ver="11";
        int cnt=2;
        while(cnt<n){
            rez=convTool(ver);
            ver=rez;
            cnt++;
        }
        return ver;
    }
}
