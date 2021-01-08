package Programmers.Lv1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public static ArrayList<Integer> solution(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] != arr[i+1]){
                ans.add(arr[i]);
            }
        }
        ans.add(arr[arr.length - 1]);


        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        solution(arr);
    }
}
