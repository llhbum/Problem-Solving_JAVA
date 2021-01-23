package Programmers.Lv2;

import java.util.Arrays;

public class N개의최소공배수 {
    public int solution(int[] arr) {
        int ans = 0;
        Arrays.sort(arr);
        int max = arr[arr.length-1] - 1;

        while(true){
            max ++;
            int cnt = arr.length;
            for(int i = 0; i<arr.length; i++){
                if(max % arr[i]==0){
                    cnt--;
                }
                if(cnt == 0){
                    break;
                }
            }
            if(cnt == 0){
                break;
            }

        }
        ans = max;
        return ans;
    }
}
