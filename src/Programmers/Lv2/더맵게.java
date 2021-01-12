package Programmers.Lv2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> q = new PriorityQueue<>();


        for (int i = 0; i < scoville.length; i++) {
            q.add(scoville[i]);
        }

        int temp = 0;
        while (true) {
            if (q.size() == 1) {
                answer = -1;
                return answer;
            }
            if (q.peek() >= K) {
                return answer;
            }

            temp = q.poll() + (q.poll() * 2);
            answer++;
            q.add(temp);
        }
    }
}