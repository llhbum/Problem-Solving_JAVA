package Programmers.Lv3;

import java.util.HashMap;

public class 단어변환 {

    public static boolean diffChar(String str1, String str2){
        String[] strArr1 = str1.split("");
        String[] strArr2 = str2.split("");
        int strLen = 0;

        for(int i = 0 ; i < strArr1.length; i++){
            if(strArr1[i].equals(strArr2[i])){
                strLen += 1;
                if(strLen == str1.length() - 1){
                    return true;
                }
            }
        }
        return false;
    }
        public int solution(String begin, String target, String[] words) {
            String str = "";
            HashMap<String, Boolean> hm = new HashMap<>();

            int answer = 0;
            return answer;
        }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ccd";

        System.out.println(diffChar(str1,str2));
    }
}
