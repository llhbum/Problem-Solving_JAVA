package Algo_lecture;

import java.util.*;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++){
            String temp_s = s.substring(i,i+1);
            answer += Integer.parseInt(temp_s);
        }
        return answer;

        // 자릿수를 구해서 푸는 방법도 있음
    }
}
