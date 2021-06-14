package Baekjoon;

import java.util.Scanner;

public class 로봇청소기 {
    static int N;
    static int M;
    static int r;
    static int c;
    static int d;
    static int[][] map;
    static boolean[][] visited;

    static int[] dr;
    static int[] dc;
    static int nd;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        r = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        map = new int[N][M];
        // true : 청소 , false : 비청소
        visited = new boolean[N][M];
        // + 면 인덱스 방향으로 전진 , - 면 인덱스방향으로 후진
        dr = new int[]{-1,0,1,0};
        dc = new int[]{0,1,0,-1};

        for(int n = 0; n<N; n++){
            for(int m = 0; m<M; m++){
                int temp = scan.nextInt();
                map[n][m] = temp;

            }
        }
        boolean finished = true;

        while (finished){
            // 1. 현재 있는 자리 청소 가능
            if(map[r][c] == 0 && visited[r][c] == false){
                visited[r][c] = true;
            }

            // 2. 현재 위치에서 현재 방향을 기준으로 왼쪽방향부터 차례대로 탐색을 진행한다.
            // b. 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번으로 돌아간다.
            for(int i = 0; i < 4; i ++){
                int dd = d - 1;
                if(dd < 0){
                    dd = 3;
                }
                int nr = r + dr[dd];
                int nc = c + dc[dd];

                if(nr >= 0 && nc >= 0 && nr < N && nc < M){
                    //a. 왼쪽이 청소가능 구역이면
                    if (map[nr][nc] == 0 && visited[nr][nc] == false){
                        r = nr;
                        c = nc;
                        d = dd;
                        break;
                    }
                    // 방향만 회전
                    d = dd;
                }
                //4번 돌았으면
                if(i == 3){
                    nr = r - dr[d];
                    nc = c - dc[d];
                    if(nr >= 0 && nc >= 0 && nr < N && nc < M  && map[nr][nc] == 0){
                        r = nr;
                        c = nc;
                    }else{
                        finished = false;
                    }
                }

            }


        }
        int ans = 0;

        //정상출력
        for(int n = 0; n<N; n++){
            for(int m = 0; m<M; m++){
                if(visited[n][m] == true){
                    ans += 1;
                }

            }
        }

        System.out.println(ans);



    }

}
