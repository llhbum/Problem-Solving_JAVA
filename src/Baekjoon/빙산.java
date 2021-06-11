package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 빙산 {
    static int N;
    static int M;
    static int[][] map;
    static int[][] OriginalMap;
    static boolean[][] visitied;
    static boolean[][] meltVisited;

    static int[] dx;
    static int[] dy;

    static Queue<q_class> q;

    static int iceNum;
    static int meltCnt = 0;

    static class q_class{
        int x;
        int y;

        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

        public static void initMap(){
            for(int i = 0; i<N; i++){
                for(int j = 0; j<M; j++){
                    map[i][j] = OriginalMap[i][j];
                }
            }
        }

        //빙산 녹이기
        public static void melt_bfs(){
//            System.out.println("melt_bfs 시작");

            meltVisited = new boolean[N][M];

            for(int n = 0; n<N; n++){
                for(int m = 0; m < M; m++){
                    if(OriginalMap[n][m] != 0){
                        meltVisited[n][m] = true;
                        for(int i = 0; i < dx.length; i++){
                            int nx = n + dx[i];
                            int ny = m + dy[i];

                            if(nx >= 0 && ny >= 0 && nx < N && ny < M && OriginalMap[nx][ny] == 0 && meltVisited[nx][ny] == false){
                                OriginalMap[n][m] --;
//                                System.out.println("OriginalMap : " + OriginalMap[n][m] + ' ');
//                                System.out.println();
                            }
                            if(OriginalMap[n][m] <= 0 ){
                                break;
                            }
                        }
                    }
                }
            }
            meltCnt+=1;
            System.out.println("meltCnt : " + meltCnt);
            for(int n = 0; n<N; n++){
                for(int m = 0; m < M; m++){
                    System.out.print(OriginalMap[n][m]);
                }
                System.out.println();
            }
            return;
        }

        //빙산 개수 체크
        public static void check_bfs(){
//            System.out.println("check_bfs 시작");
            q = new LinkedList<q_class>();
                for(int n = 0; n<N; n++){
                    for(int m = 0; m<M; m++){
                        if(map[n][m] != 0 ){

                            q.add(new q_class(n,m));
                            while (!q.isEmpty()){

                                q_class qc = q.poll();
                                int x = qc.x;
                                int y = qc.y;
                                visitied[x][y] = true;
                                for(int i = 0; i<dx.length; i++){
                                    int nx = x + dx[i];
                                    int ny = y + dy[i];

                                    if(nx>=0 && ny >= 0 && nx<N && ny < M && visitied[nx][ny] == false && map[nx][ny] != 0){
                                        visitied[nx][ny] = true;
                                        q.add(new q_class(nx,ny));
                                        map[nx][ny] = 0;

                                    }
                                }
                            }
                            iceNum += 1;
                            System.out.println("iceNum : " + iceNum);
                        }
                    }
                }
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            N = scan.nextInt();
            M = scan.nextInt();
            map = new int[N][M];
            OriginalMap = new int[N][M];
            visitied = new boolean[N][M];


            for(int n = 0; n<N; n++){
                for(int m = 0; m < M; m++){
                    int temp = scan.nextInt();
                    map[n][m] = temp;
                    OriginalMap[n][m] = temp;
                }
            }

            dx = new int[]{-1,1,0,0};
            dy = new int[]{0,0,-1,1};



            int mapMax = 0;
            int answer = 0;
            //정상출력
            for(int n = 0; n<N; n++){
                for(int m = 0; m < M; m++){

                    if(mapMax < map[n][m]){
                        mapMax = map[n][m];
                    }
                }
            }

            for(int i = 0; i<mapMax; i++){
                melt_bfs();
                initMap();
                iceNum = 0;
                check_bfs();
                initMap();
                if(iceNum >= 2){
                    answer = meltCnt;
                    break;
                }
            }

            System.out.println(answer);

        }


}
