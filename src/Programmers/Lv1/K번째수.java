package Programmers.Lv1;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for ( int i = 0; i < commands.length; i ++){
            int s = commands[i][0];
            int d = commands[i][1];
            int n = commands[i][2];

            int[] temp = Arrays.copyOfRange(array, s-1, d);
            Arrays.sort(temp);

            answer[i] = temp[n-1];

        }
        return answer;
    }
}
