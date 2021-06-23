package Programmers.Lv2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        // 배열중 가장 큰 값을 구하는 과정
        int[] temp = citations;
        Arrays.sort(temp);
        Integer b[] = Arrays.stream(temp).boxed().toArray(Integer[]::new);

        Arrays.sort(b, Collections.reverseOrder());
        int c[] = Arrays.stream(b).mapToInt(Integer::intValue).toArray();


        int nMax = temp[temp.length-1];

        int H = 0;
        for(int i = 0; i<=nMax; i++){
            H = 0;
            // H값 구하기(배열에서 i보다 큰값)
            for(int h =0; h<citations.length; h++) {
                if (i <= citations[h]) {
                    H++;
                }
            }
            // 만약 i>H가 크면 H-INDEX 규칙을 벗어나면 for문 탈출
            if(i > H){
                break;
            }
            // i중 가장 큰 값을 answer에 대입
            if (answer <= i){
                answer = i;
            }
        }

        return answer;
    }

}
