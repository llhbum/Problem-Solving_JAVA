package Programmers.Lv2;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {
    public int solution(int[] A, int[] B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i<A.length; i++){
            answer += A[i] * B[A.length-i-1];
        }

        return answer;
    }

}
