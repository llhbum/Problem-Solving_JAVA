package Baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 단지번호붙이기 {

    static int N;
    static int[][] map;
    static int[] dx;
    static int[] dy;
    static boolean[][] visited;
    static Queue<q_class> q;

    static LinkedList<Integer> apartment = new LinkedList<>();
    static int apartmentNum;

    static class q_class{
        int x;
        int y;

        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(){
        for(int i=0; i < N; i++){
            for(int j=0; j < N; j++){
                apartmentNum = 0;
                if(map[i][j] == 1){
//                    System.out.println("i : " + i + "j : " + j );

                    q.add(new q_class(i,j));
                    while (!q.isEmpty()){
                        q_class qc = q.poll();
                        apartmentNum += 1;
                        int x = qc.x;
                        int y = qc.y;
                        visited[x][y] = true;

                        for(int k = 0; k <dx.length; k++){
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            if(nx >= 0 && ny >= 0 && nx < N && ny < N && visited[nx][ny] == false && map[nx][ny] == 1){
                                visited[nx][ny] = true;
                                map[nx][ny] = 0;
                                q.add(new q_class(nx,ny));

                            }
                        }
                    }

                }
                if(apartmentNum != 0){
                    apartment.add(apartmentNum);
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        dx = new int[]{-1,1,0,0};
        dy = new int[]{0,0,-1,1};
        q = new LinkedList<q_class>();


        for(int i = 0; i<N; i++){
            String temp = scan.next();
            String[] tempArr = temp.split("");
            for(int j = 0; j<N; j++){
                int tempInt = Integer.parseInt(tempArr[j]);
                map[i][j] =tempInt;
            }
        }

        bfs();


        //정상출력
//        for(int i = 0; i<N; i++){
//            for(int j = 0; j<N; j++){
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }

        System.out.println(apartment.size());
        int[] tempIntArr = new int[apartment.size()];
        for(int i = 0; i < apartment.size(); i++){
            tempIntArr[i] = apartment.get(i);
        }
        Arrays.sort(tempIntArr);
        for(int i : tempIntArr){
            System.out.println(i);
        }

    }
}
