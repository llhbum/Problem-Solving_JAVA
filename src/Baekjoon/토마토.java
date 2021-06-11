package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토 {
    static int H; //상자의 수
    static int M; // 상자의 가로 칸의 수
    static int N; // 상자의 세로 칸의 수
    static int[][][] arr;
    static int[][][] day_arr;
    static int[][][] visited;
    static int[] dx;
    static int[] dy;
    static int[] dh;
    static int ans;
    static Queue<tomato> q;

    static class tomato{
        int x;
        int y;
        int h;

        tomato(int x, int y, int h){
            this.x =x;
            this.y = y;
            this.h = h;
        }

    }

    public static void bfs(){
        while (!q.isEmpty()){
            tomato t = q.poll();
            int x = t.x;
            int y = t.y;
            int h = t.h;

            for(int i =0; i<6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nh = h + dh[i];

                if(nx>=0 && nx < M && ny >=0 && ny < N&& nh >=0 && nh < H) {
                    if(arr[nh][ny][nx]==0&&day_arr[nh][ny][nx]==0) {
                        day_arr[nh][ny][nx] = day_arr[h][y][x] + 1;
                        q.add(new tomato(nx,ny,nh));
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        M = scan.nextInt();
        N = scan.nextInt();
        H = scan.nextInt();
        arr = new int[H][N][M];

        dx = new int[] {-1, 0, 1, 0, 0, 0 };
        dy = new int[] {0, 1, 0, -1, 0, 0};
        dh = new int[] {0, 0, 0, 0, -1, 1};

        q = new LinkedList<tomato>();

        // 0 - 익지 않은 토마토
        // 1 - 익은 토마토
        // -1 - 토마토가 들어있지 않은 칸
        for(int h = 0; h<H; h++){
            for(int n = 0; n<N; n++){
                for(int m = 0; m<M; m++){
                    int temp = scan.nextInt();
                    arr[h][n][m] = temp;
                    if(temp == 1) {
                        q.add(new tomato(m,n,h));
                    }
                }
            }
        }

        day_arr = new int[H][N][M];

        bfs();

        for(int i = 0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int l = 0; l<M; l++) {
                    if(ans<day_arr[i][j][l]) {
                        ans = day_arr[i][j][l];
                    }

                }
            }
        }



        for(int i = 0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int l = 0; l<M; l++) {
                    if(arr[i][j][l]==0&&day_arr[i][j][l]==0) {
                        ans = -1;
                    }

                }
            }
        }

        System.out.println(ans);

    }
}

/*
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

   static class tomato{
      int x;
      int y;
      int h;

      tomato(int x, int y, int h){
         this.x =x;
         this.y = y;
         this.h = h;
      }
   }

   static int M;
   static int N;
   static int H;
   static int[][][] box;
   static int[][][] temp;
   static int done;
   static int ans;
   static int[] dx;
   static int[] dy;
   static int[] dh;
   static int[][][] visited;
   static Queue<tomato> q;

   static void bfs() {
      while(!q.isEmpty()) {
         tomato t = q.poll();
         int x = t.x;
         int y = t.y;
         int h = t.h;

         for(int i =0; i<6; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            int nh = h+dh[i];

            if(nx>=0 && nx < M && ny >=0 && ny < N&& nh >=0 && nh < H) {
               if(box[nh][ny][nx]==0&&temp[nh][ny][nx]==0) {
                  temp[nh][ny][nx] = temp[h][y][x] + 1;
                  q.add(new tomato(nx,ny,nh));
               }
            }
         }

      }
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      M = scan.nextInt();
      N = scan.nextInt();
      H = scan.nextInt();

      box = new int[H][N][M];

      dx = new int[] {-1, 0, 1, 0, 0, 0 };
      dy = new int[] {0, 1, 0, -1, 0, 0};
      dh = new int[] {0, 0, 0, 0, -1, 1};

      q = new LinkedList<tomato>();

      for(int i = 0; i<H; i++) {
         for(int j=0; j<N; j++) {
            for(int l = 0; l<M; l++) {
               int t = scan.nextInt();
               box[i][j][l] = t;
               if(t == 1) {
                  q.add(new tomato(l,j,i));
               }

            }
         }
      }

      temp = new int[H][N][M];

      bfs();


      for(int i = 0; i<H; i++) {
         for(int j=0; j<N; j++) {
            for(int l = 0; l<M; l++) {
               if(ans<temp[i][j][l]) {
                  ans = temp[i][j][l];
               }

            }
         }
      }

      for(int i = 0; i<H; i++) {
         for(int j=0; j<N; j++) {
            for(int l = 0; l<M; l++) {
               if(box[i][j][l]==0&&temp[i][j][l]==0) {
                  ans = -1;
               }

            }
         }
      }

      System.out.println(ans);


   }
}
 */
