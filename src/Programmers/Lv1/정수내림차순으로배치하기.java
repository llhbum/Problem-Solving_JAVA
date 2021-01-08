package Programmers.Lv1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        String s  = Long.toString(n);
        String[] sList = s.split("");

        Arrays.sort(sList, Collections.reverseOrder());

        String temp = "";
        for(int i = 0; i<sList.length; i++){
            temp += sList[i];
        }

        answer = Long.parseLong(temp);
        return answer;
    }
}
