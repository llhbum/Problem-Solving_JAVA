package Programmers;

import java.util.Locale;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;

        //s 모두 소문자로 변환
        s = s.toLowerCase();

        // p,y 개수 카운트
        int pCnt = 0;
        int yCnt = 0;

        for(int i = 0 ; i < s.length(); i++){
            if (s.charAt(i) == 'p'){
                pCnt ++;
            }else if (s.charAt(i) == 'y'){
                yCnt ++;
            }
        }

        // pCnt, yCnt 비교
        if (pCnt == yCnt){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
