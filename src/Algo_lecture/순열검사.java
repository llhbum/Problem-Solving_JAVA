package Algo_lecture;

import java.util.Arrays;

public class 순열검사 {
    public boolean solution(int[] arr) {
        boolean answer = true;

        Arrays.sort(arr);

        int arr_min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr_min + i != arr[i]){
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}
