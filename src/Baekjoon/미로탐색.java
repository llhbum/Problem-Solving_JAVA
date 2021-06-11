package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로탐색 {

    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static Queue<q_class> q;
    static int[] dx;
    static int[] dy;
    static class q_class{
        int x;
        int y;

        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(){
        while(!q.isEmpty()){
            q_class qc = q.poll();
            int x = qc.x;
            int y = qc.y;
            visited[x][y] = true;

            for(int i = 0; i < dx.length; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < M && visited[nx][ny] == false && map[nx][ny] == 1){

                    map[nx][ny] = map[x][y] + 1;
                    q.add(new q_class(nx,ny));

                }
            }

        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];

        dx = new int[] {-1,1,0,0};
        dy = new int[] {0,0,-1,1};

        for(int i = 0; i <N; i++){
            String input = scan.next();
            String[] strArray = input.split("");

            for(int j = 0; j < M; j++){
                int temp = Integer.parseInt(strArray[j]);
                map[i][j] = temp;
            }
        }

        q = new LinkedList<q_class>();
        q.add(new q_class(0,0));
        bfs();

        //map 정상출력
        // max == ans
        int ans = map[N-1][M-1];

        System.out.println(ans);

    }
}
