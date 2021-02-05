package Algo_lecture;

import java.util.ArrayList;
import java.util.HashSet;

public class 나머지한점 {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        int target_x = 0;
        int target_y = 0;


        ArrayList<Integer> xList = new ArrayList();
        ArrayList<Integer> yList = new ArrayList();

        for(int i = 0; i < v.length; i++){
            xList.add(v[i][0]);
            yList.add(v[i][1]);
        }

        target_x = xList.get(0) ^ xList.get(1) ^ xList.get(2);
        target_y = yList.get(0) ^ yList.get(1) ^ yList.get(2);

        answer[0] = target_x;
        answer[1] = target_y;

        return answer;
    }
}
