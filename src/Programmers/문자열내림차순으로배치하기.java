package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";

        //s문자열 배열로
        String[] sList = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            sList[i] = s.substring(i,i+1);
        }
        Arrays.sort(sList, Collections.reverseOrder());

        for(String val : sList){
            answer += val;
        }
        return answer;
    }
}
