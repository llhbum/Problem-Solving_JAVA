package Programmers.Lv2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class 땅따먹기 {

    // 정답
    int solution(int[][] land) {

        for(int i=1; i<land.length; i++) {
            land[i][0] = land[i][0] + Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][1] = land[i][1] + Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
            land[i][2] = land[i][2] + Math.max(land[i - 1][1], Math.max(land[i - 1][0], land[i - 1][3]));
            land[i][3] = land[i][3] + Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));
        }
        Arrays.sort(land[land.length-1]);
        return land[land.length-1][3];
    }

    //풀이

    /*
    DP 문제인지 모르고 오답처럼 삽질했음
    힌트 :
    1. 주어진 조건중 열의 개수는 4개이고
    2. 핵심은 첫줄을 기준으로 다음 줄의 최대값을 찾는게 아닌 뒷항목에서 첫항목을 더한 뒤 그 합의 최댓값을 찾는 것이다.(다른 블로그 참고)
    ref) https://haningya.tistory.com/118

     */




      // 오답
//    int solution(int[][] land) {
//        int answer = 0;
//
//        int[] maxIdx = new int[2];
//
//
//        int tmpMax = 0;
//        int tmpIdx = 0;
//        int tmpTotal = 0;
//
//        for(int i = 0; i < n[0].length; i++){
//            tmpMax = n[0][i];
//            tmpTotal = tmpMax;
//            tmpIdx = i;
//            for(int j = 1; j < n.length; j++){
//                maxIdx = maxMethod(n[j],tmpIdx);
//                tmpTotal += maxIdx[0];
//                tmpIdx = maxIdx[1];
//            }
//            if(answer < tmpTotal){
//                answer = tmpTotal;
//            }
//
//        }
//        return answer;
//    }
//
//    //maxIdx[0] = max값 , maxIdx[1] = max값의 idx값
//    //init maxMethod
//    public static int[] maxMethod(int[] n){
//        int[] maxIdx = new int[2];
//        for(int i = 0; i< n.length; i++){
//            if(maxIdx[0]<n[i]){
//                maxIdx[0] = n[i];
//                maxIdx[1] = i;
//            }
//        }
//        return maxIdx;
//    }
//
//    public static int[] maxMethod(int[] n, int beforeMaxIdx){
//        int[] maxIdx = new int[2];
//        for(int i = 0; i< n.length; i++){
//            if(maxIdx[0]<n[i] && i != beforeMaxIdx){
//                maxIdx[0] = n[i];
//                maxIdx[1] = i;
//            }
//        }
//        return maxIdx;
//    }

}
