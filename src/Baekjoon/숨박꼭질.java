package Baekjoon;

import java.util.*;

public class 숨박꼭질 {
    static int N;
    static int K;
    static int[] HowToMove;
    static int answer;
    static Queue<Integer> q;
    static int[] Map;


    public static void bfs(){
        q.add(N);
        Map[N] = 1;
        while (!q.isEmpty()){
            int x  = q.poll();

            for(int i = 0; i < 3; i++){
                int nx;
                if(i == 2){
                    nx = x * 2;
                }else {
                    nx = x + HowToMove[i];
                }


                if(nx == K){
                    System.out.println(Map[x]);
                    return;
                }

                if(nx>=0 && nx<Map.length && Map[nx] == 0){
                    q.add(nx);
                    Map[nx] = Map[x] + 1;
                }

            }

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        K = scan.nextInt();
        HowToMove = new int[]{-1,1,2};
        q = new LinkedList<>();
        Map = new int[100001];

        if(N == K){
            System.out.println(0);
        }else {
            bfs();
        }
    }

}
