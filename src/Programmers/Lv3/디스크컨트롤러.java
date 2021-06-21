package Programmers.Lv3;

import java.util.*;

class 디스크컨트롤러 {
    public static int solution(int[][] jobs) {
        int answer = 0;
        int now = 0;
        int count = 0;
        int jobidx = 0;

        Arrays.sort(jobs,(j1,j2)->j1[0]-j2[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((j1,j2)-> j1[1]-j2[1]);

        while(count<jobs.length){
            while(jobidx < jobs.length && jobs[jobidx][0]<=now ){
                pq.add(jobs[jobidx]);
                jobidx += 1;
                System.out.println(jobidx);

            }

            if(pq.isEmpty()){
                now = jobs[jobidx][0];
            }else{
                int[] nowjob = pq.poll();
                answer += nowjob[1] + now - nowjob[0];
                now += nowjob[1];
                count++;

            }


        }



        return answer / jobs.length;
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        solution(jobs);
    }
}