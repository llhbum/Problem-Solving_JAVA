package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토2 {
    static int[][] map;
    static boolean[][] visited;
    static int N;
    static int M;
    static int[] dx;
    static int[] dy;
    static Queue<q_class> q;
    static class q_class{
        int x;
        int y;
        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(){
        while (!q.isEmpty()){
            q_class qc = q.poll();

            int x = qc.x;
            int y = qc.y;
            visited[x][y] = true;

            for(int i = 0 ; i<dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && map[nx][ny] == 0){
                    map[nx][ny] = map[x][y] + 1;
                    q.add(new q_class(nx,ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        q = new LinkedList<>();
        N = scan.nextInt();
        M = scan.nextInt();
        map = new int[M][N];
        visited = new boolean[M][N];
        dx = new int[]{-1,1,0,0};
        dy = new int[]{0,0,-1,1};
        for(int m = 0 ; m < M; m++){
            for(int n = 0; n < N; n++){
                map[m][n] = scan.nextInt();
            }
        }

        for(int m = 0 ; m < M; m++){
            for(int n = 0; n < N; n++){
                if(map[m][n] == 1){
                    q.add(new q_class(m,n));
                }
            }
        }
        bfs();

        int max = 1;
        for(int m = 0 ; m < M; m++){
            for(int n = 0; n < N; n++){
                if(map[m][n] == 0){
                    max = -1;
                }
            }
        }

        if(max == -1){
            System.out.println(max);
        }else {
            for(int m = 0 ; m < M; m++){
                for(int n = 0; n < N; n++){
                    if(max < map[m][n]){
                        max = map[m][n];
                    }
                }
            }
            System.out.println(max-1);
        }
    }
}
