package Baekjoon;

import java.util.*;

public class 전쟁전투 {
    static int N;
    static int M;
    static String[][] map;
    static boolean[][] visitied;
    static int[] dx;
    static int[] dy;
    static Queue<q_class> q;
    static List<Integer> answer_W;
    static List<Integer> answer_B;
    static int colorNum;

    static class q_class{
        int x;
        int y;

        q_class(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(String c, List answerList){

        for(int n = 0; n<M; n++){
            for(int m = 0; m<N; m++){
                if(map[n][m].equals(c)){
                    colorNum = 0;
                    q.add(new q_class(n,m));
                    visitied[n][m] = true;

                    while (!q.isEmpty()){
                        q_class qc = q.poll();

                        int x = qc.x;
                        int y = qc.y;
                        visitied[x][y] = true;
                        colorNum += 1;

                        for(int i = 0; i<dx.length; i++){
                            int nx = x + dx[i];
                            int ny = y + dy[i];

                            if(nx >= 0 && ny >= 0 && nx < M && ny < N && visitied[nx][ny] == false && map[nx][ny].equals(c)){
                                visitied[nx][ny] = true;
                                map[nx][ny] = "X";
                                q.add(new q_class(nx,ny));

                            }
                        }
                    }
                    answerList.add(colorNum);

                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        M = scan.nextInt();
        map = new String[M][N];
        visitied = new boolean[M][N];

        dx = new int[]{-1,1,0,0};
        dy = new int[]{0,0,-1,1};

        q = new LinkedList();

        for(int n = 0; n<M;n++){
            String temp = scan.next();
            String[] st = temp.split("");
            for(int m = 0; m<N; m++){
                map[n][m] = st[m];
            }
        }

        answer_W = new ArrayList();
        answer_B = new ArrayList();


        bfs("W", answer_W);
        bfs("B", answer_B);

//        System.out.println(answer_W.toString());
//        System.out.println(answer_B.toString());

        int ans_W  = 0;
        int ans_B  = 0;

        //정상 출력
        for(int i = 0 ; i < answer_W.size(); i++){
            ans_W += Math.pow(answer_W.get(i), 2);

        }
        System.out.print(ans_W);
        System.out.print(" ");

        for(int i = 0 ; i < answer_B.size(); i++){
            ans_B += Math.pow(answer_B.get(i), 2);
        }
        System.out.print(ans_B);




    }


}
