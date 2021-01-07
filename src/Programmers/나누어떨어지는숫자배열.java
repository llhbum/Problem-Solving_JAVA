package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int val : arr){
            if(val % divisor == 0){
                answer.add(val);
            }
        }

        if(answer.size() == 0 ){
            answer.add(-1);
        }

        int[] ans = new int[answer.size()];

        for (int i = 0 ; i < ans.length; i++){
            ans[i] = answer.get(i);
        }

        Arrays.sort(ans);

        return ans;
    }

}
