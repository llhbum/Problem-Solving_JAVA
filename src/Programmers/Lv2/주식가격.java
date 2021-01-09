package Programmers.Lv2;

import java.util.ArrayList;

public class 주식가격 {
    public ArrayList<Integer> solution(int[] prices) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < prices.length-1 ; i++){
            int cnt = 1;
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] > prices[j] || j == prices.length - 1){
                    answer.add(cnt);
                    break;
                }
                else {
                    cnt++;
                }

            }
        }
        answer.add(0);
        return answer;
    }
}
