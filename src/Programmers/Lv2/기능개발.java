package Programmers.Lv2;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class 기능개발 {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        double temp = 0;
        Queue<Integer> q = new ConcurrentLinkedDeque<>();

        // 작업완료시간 구하기
        for(int i = 0; i < progresses.length; i++){
            temp = (100 - progresses[i]);
            q.add((int)(Math.ceil(temp/speeds[i])));
        }


        // 완성된 작업완료시간으로 배포횟수 구하기
        int x1 = (int)(q.poll());
        int x2 = (int)(q.poll());
        int cnt = 1;
        while(true){
            if(q.isEmpty()){
                if(x1 < x2){
                    answer.add(cnt);
                    answer.add(1);
                    break;
                }else {
                    cnt++;
                    answer.add(cnt);
                    break;
                }
            }else {
                if(x1 < x2){
                    answer.add(cnt);
                    x1 = x2;
                    x2 = q.poll();
                    cnt = 1;
                }else{
                    cnt ++;
                    x2 = q.poll();
                }
            }
        }
        return answer;
    }
}
