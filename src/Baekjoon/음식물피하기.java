package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 음식물피하기 {
    static int N;
    static int M;
    static int K;

    static int[][] map;
    static boolean[][] visited;

    static int[] dx;
    static int[] dy;

    static int trash;
    static int ans_trash;


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
            for(int n = 0; n < N; n++){
                for(int m = 0; m < M; m++){

                    if(map[n][m] == 1 && !visited[n][m]){
                        q.add(new q_class(n,m));
                        trash = 1;

                        while (!q.isEmpty()){
                            q_class qc = q.poll();
                            int x = qc.x;
                            int y = qc.y;

                            visited[x][y] = true;


                            for(int i = 0; i<dx.length; i++){
                                int nx = x + dx[i];
                                int ny = y + dy[i];

                                if(nx >= 0 && ny >= 0 && nx <N && ny < M && map[nx][ny] == 1 && !visited[nx][ny]){
                                    q.add(new q_class(nx,ny));
                                    trash += 1;
                                    map[nx][ny] = 0;


                                }
                            }
                        }
                        if(ans_trash < trash){
                            ans_trash = trash;
                        }
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            N = scan.nextInt();
            M = scan.nextInt();
            K = scan.nextInt();

            map = new int[N][M];
            visited = new boolean[N][M];

            dx = new int[]{-1,1,0,0};
            dy = new int[]{0,0,-1,1};

            q = new LinkedList<>();
            ans_trash = 0;

            for(int i = 0; i < K; i++){
                int temp1 = scan.nextInt() - 1;
                int temp2 = scan.nextInt() - 1 ;

                for(int n = 0; n<N; n++){
                    for(int m = 0; m<M; m++){
                        if(n == temp1 && m == temp2){
                            map[n][m] = 1;
                        }
                    }
                }
            }
            bfs();

//            for(int n = 0; n<N; n++){
//                for(int m = 0; m<M; m++){
//                    System.out.print(map[n][m]);
//                }
//                System.out.println();
//            }
            System.out.println(ans_trash);
        }

}
