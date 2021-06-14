package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*

 */
public class 스타트링크 {
    static int F; //최대 높이
    static int S; // 현위치
    static int G; //스타트링크
    static int U; // 이동1
    static int D; // 이동2
    static Queue<Integer> q ;
    static int[] ud;
    static int[] map;

    public static void bfs(){
        q.add(S);
        map[S] = 1;
        while (!q.isEmpty()){
            int x = q.poll();
            if(x == G){
                return;
            }

            for(int i = 0; i<ud.length; i++){
                int nx = x + ud[i];

                if(nx >= 1 && nx <=F && map[nx] == 0){
                    map[nx] = map[x] + 1;
                    q.add(nx);
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        F = scan.nextInt();
        S = scan.nextInt();
        G = scan.nextInt();
        U = scan.nextInt();
        D = scan.nextInt();

        map = new int[F+1];
        q = new LinkedList();
        ud = new int[]{U,-D};


        bfs();
        int ans = map[G];
        if(ans == 0 ){
            System.out.println("use the stairs");
        }else {
            System.out.println(ans-1);
        }


    }
}
