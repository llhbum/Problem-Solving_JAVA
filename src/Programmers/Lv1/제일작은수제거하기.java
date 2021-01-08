package Programmers.Lv1;

import java.util.Arrays;
import java.util.Collections;

public class 제일작은수제거하기 {

    public int[] solution(int[] arr) {
        int[] answer = {};

        // 배열이 1일 떄 -1 리턴
        if(arr.length == 1){
            return new int[]{-1};
        }

        // 배열의 순서는 바꾸지 않고 가장 작은 값만 제거
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }


}
