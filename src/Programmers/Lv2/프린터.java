package Programmers.Lv2;

import java.util.*;

public class 프린터 {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        PriorityQueue priority = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : priorities){
            priority.add(n);
            System.out.println(priority);

        }

        System.out.println(priority);
        while (!priority.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == (int)priority.peek()){
                    if(i == location){
                        return answer;
                    }
                    priority.poll();
                    answer ++;
                }
            }
        }
        return answer;
    }
}
