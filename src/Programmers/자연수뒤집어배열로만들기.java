package Programmers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {

        String s = Long.toString(n);
        String[] sList = s.split("");

        int[] answer = new int[sList.length];

        for(int i = 0; i <sList.length; i++){
            answer[sList.length - i - 1] = Integer.parseInt(sList[i]);
        }
        return answer;
    }
}
