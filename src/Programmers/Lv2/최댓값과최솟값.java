package Programmers.Lv2;

import java.util.Arrays;
import java.util.Collections;

public class 최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] sList = s.split(" ");
        int[] nList = new int[sList.length];

        for(int i = 0; i < sList.length; i++){
            nList[i] = Integer.parseInt(sList[i]);
        }

        Arrays.sort(nList);
        String max = Integer.toString(nList[nList.length-1]);
        String min = Integer.toString(nList[0]);
        answer += min+ " ";
        answer += max;

        return answer;
    }
}
